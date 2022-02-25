package com.kuebiko.consultantService.controller;

import com.kuebiko.consultantService.models.PersonalDetails;
import com.kuebiko.consultantService.service.PersonalDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personal-details")
public class PersonalDetailsController {

        @Autowired
        PersonalDetailsService personalDetailsService;

        @PostMapping
        @RequestMapping("/save")
        public PersonalDetails save (@RequestBody PersonalDetails payload){
            return personalDetailsService.save(payload);
        }

        @GetMapping
        @RequestMapping ("/find")
        public  PersonalDetails findData (@RequestParam ("id") Long id){
            return personalDetailsService.getId(id);
        }
}
