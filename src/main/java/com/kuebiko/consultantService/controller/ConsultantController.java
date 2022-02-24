package com.kuebiko.consultantService.controller;

import com.kuebiko.consultantService.models.Address;
import com.kuebiko.consultantService.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consultant-service")
public class ConsultantController {

    @Autowired
    AddressService addressService;

    @PostMapping
    @RequestMapping("/save")
    public Address save (@RequestBody Address payload){

        Address returnedResponse = addressService.save(payload);
        return returnedResponse;
    }

}
