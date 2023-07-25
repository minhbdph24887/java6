package com.example.demo.bai5.bai5_6_SU_DUNG_RESTFUL_API_DE_QUAN_LY_FILE_PHIA_SERVER.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileManagerService {

    byte[] readFile(String folder, String filename);

    List<String> upLoad(String folder, MultipartFile[] files);

    void delete(String folder, String filename);

    List<String> getAll(String folder);
}
