package com.example.demo.bai5.bai5_6_SU_DUNG_RESTFUL_API_DE_QUAN_LY_FILE_PHIA_SERVER.controller;

import com.example.demo.bai5.bai5_6_SU_DUNG_RESTFUL_API_DE_QUAN_LY_FILE_PHIA_SERVER.service.FileManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/demo56/image/")
public class FileUploadController {
    @Autowired
    private FileManagerService service;

    @GetMapping("{folder}/{file}")
    public byte[] download(@PathVariable("folder") String folder,
                           @PathVariable("file") String file) {
        return service.readFile(folder, file);
    }

    @PostMapping("upload/{folder}")
    public List<String> upLoad(@PathVariable("folder") String folder,
                               @PathVariable("files") MultipartFile[] files) {
        return service.upLoad(folder, files);
    }

    @DeleteMapping("delete/{folder}/{file}")
    public void delete(@PathVariable("folder") String folder,
                       @PathVariable("file") String file) {
        delete(folder, file);
    }

    @GetMapping("{folder}")
    public List<String> list(@PathVariable("folder") String folder) {
        return service.getAll(folder);
    }
}
