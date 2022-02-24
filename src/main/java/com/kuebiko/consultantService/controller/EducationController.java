package com.kuebiko.consultantService.controller;

import com.kuebiko.consultantService.models.Education;
import com.kuebiko.consultantService.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/education")
public class EducationController {

    @Autowired
    EducationService educationService;

    @PostMapping
    @RequestMapping("/save")
    public Education save (@RequestBody Education payload){

        Education returnResponse = educationService.save(payload);
        return returnResponse;
    }
}
