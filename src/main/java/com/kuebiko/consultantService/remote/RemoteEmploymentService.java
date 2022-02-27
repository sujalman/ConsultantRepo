package com.kuebiko.consultantService.remote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RemoteEmploymentService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${employment.findURL}")
    private String apiHost;         //http://localhost:8085/v1/employment/find

    public Object getEmploymentDetails(Long id){
        String finalUrlWithParams = apiHost + "?id=" +id;
        Object response = restTemplate.getForObject(finalUrlWithParams, Object.class);

        return response;
    }
}
