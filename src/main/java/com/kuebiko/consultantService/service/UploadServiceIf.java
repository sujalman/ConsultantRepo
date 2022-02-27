package com.kuebiko.consultantService.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadServiceIf {
    String upload(MultipartFile file) throws IOException;

}
