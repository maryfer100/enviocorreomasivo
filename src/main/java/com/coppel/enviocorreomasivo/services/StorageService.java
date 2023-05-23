package com.coppel.enviocorreomasivo.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
public interface StorageService {
    void init() throws IOException;
    String store(MultipartFile file);
    Resource LoadAsResource(String filename);
}