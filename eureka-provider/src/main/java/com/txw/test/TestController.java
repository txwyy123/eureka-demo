package com.txw.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by txwyy123 on 18/3/19.
 */
@RestController
public class TestController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public Response add(@RequestParam Integer a, @RequestParam Integer b) {
        List<ServiceInstance> instanceList = client.getInstances("consume-service");
        Integer r = a + b;

        for(ServiceInstance serviceInstance : instanceList)
            System.out.println("/add, host:" + serviceInstance.getHost() + ", service_id:" + serviceInstance.getServiceId() + ", result:" + r);

        Response response = new Response();
        response.setId(r);
        return response;
    }
}
