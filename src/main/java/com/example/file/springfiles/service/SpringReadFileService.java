package com.example.file.springfiles.service;

import com.example.file.springfiles.model.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface SpringReadFileService {
    List<User> findAll();

    boolean saveDataFromUploadFile(MultipartFile file);
}
