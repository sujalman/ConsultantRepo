package com.kuebiko.consultantService.service;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AmazonClient {

        private AmazonS3 s3client;

        @Value("${employment.aws.accessKey.id}")
        private String accessKey;
        @Value("${employment.aws.accessKey.secret}")
        private String secretKey;

        @PostConstruct
        private void initializeAmazon() {
            AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);
            this.s3client = new AmazonS3Client(credentials);
        }
    }
