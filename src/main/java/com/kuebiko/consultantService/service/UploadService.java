package com.kuebiko.consultantService.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class UploadService implements UploadServiceIf{

    @Value("{employment.aws.bucketName}")
    private String bucketName;

    @Value("{employment.aws.url}")
    private String bucketUrl;

    @Autowired
    private AmazonS3 s3client;

    private File convertMultiPartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }

    @Override
    public String upload(MultipartFile file) throws IOException {
        File parseFile = convertMultiPartToFile(file);
        PutObjectResult response= s3client.putObject(new PutObjectRequest(bucketName, file.getName(), parseFile)
                .withCannedAcl(CannedAccessControlList.PublicRead));
        return bucketUrl + file.getName();
    }
}
