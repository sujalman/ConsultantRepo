package com.kuebiko.consultantService.controller;

import com.kuebiko.consultantService.models.PersonalDetails;
import com.kuebiko.consultantService.service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal-details")
public class PersonalDetailsController {

    @Autowired
    PersonalDetailsService personalDetailsService;

    @PostMapping
    @RequestMapping("/save")
    public PersonalDetails save (@RequestBody PersonalDetails payload){

        PersonalDetails returnResponse = personalDetailsService.save(payload);
        return  returnResponse;
    }
}
