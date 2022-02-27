package com.kuebiko.consultantService.controller;

import com.kuebiko.consultantService.models.Address;
import com.kuebiko.consultantService.service.AddressService;
import com.kuebiko.consultantService.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/consultant-service")
public class ConsultantController {

    @Autowired
    AddressService addressService;

    @Autowired
    UploadService uploadService;

    @PostMapping
    @RequestMapping("/save")
    public Address save (@RequestBody Address payload){

        Address returnedResponse = addressService.save(payload);
        return returnedResponse;
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestPart(value = "file") MultipartFile file) throws IOException {
       String response = uploadService.upload(file);
        return response;
    }

}
