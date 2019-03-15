package com.txw.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by txwyy123 on 18/3/19.
 */
@RestController
public class Controller {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String getCustomer() {
        String response = restTemplate.getForEntity( "http://test-service/add?a=1&b=2", String.class).getBody();
        return response;
    }
}
