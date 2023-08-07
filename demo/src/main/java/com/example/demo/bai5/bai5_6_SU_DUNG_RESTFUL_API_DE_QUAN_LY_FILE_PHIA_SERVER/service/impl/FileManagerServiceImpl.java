package com.example.demo.bai5.bai5_6_SU_DUNG_RESTFUL_API_DE_QUAN_LY_FILE_PHIA_SERVER.service.impl;

import com.example.demo.bai5.bai5_6_SU_DUNG_RESTFUL_API_DE_QUAN_LY_FILE_PHIA_SERVER.service.FileManagerService;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileManagerServiceImpl implements FileManagerService {
    @Autowired
    private ServletContext servletContext;

    private Path getPath(String folder, String filename) {
        File file = Paths.get(servletContext.getRealPath("/files/"), folder).toFile();
        if (!file.exists()) {
            file.mkdirs();
        }
        return Paths.get(file.getAbsolutePath(), filename);
    }

    @Override
    public byte[] readFile(String folder, String filename) {
        Path path = this.getPath(folder, filename);
        try {
            return Files.readAllBytes(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<String> upLoad(String folder, MultipartFile[] files) {
        List<String> stringList = new ArrayList<String>();
        for (MultipartFile file : files) {
            String name = System.currentTimeMillis() + file.getOriginalFilename();
            String fileName = Integer.toHexString(name.hashCode()) + name.substring(name.lastIndexOf("."));
            Path path = this.getPath(folder, fileName);
            try {
                file.transferTo(path);
                stringList.add(fileName);
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        return stringList;
    }

    @Override
    public void delete(String folder, String filename) {
        Path path = this.getPath(folder, filename);
        path.toFile().delete();
    }

    @Override
    public List<String> getAll(String folder) {
        List<String> list = new ArrayList<>();
        File file = Paths.get(servletContext.getRealPath("/files/"), folder).toFile();
        if (file.exists()) {
            File[] file1 = file.listFiles();
            assert file1 != null;
            for (File file2 : file1) {
                list.add(file2.getName());
            }
        }
        return list;
    }
}
