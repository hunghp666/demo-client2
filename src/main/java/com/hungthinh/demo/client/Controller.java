package com.hungthinh.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private DemoClient demoClient;
    @GetMapping("/api/hello")
    public String home() {

//        RestTemplate restTemplate = new RestTemplate();
//
//        try {
//            return restTemplate.getForObject(new URI("http://localhost:8091/test/hello"), String.class);
//        } catch (Exception e) {
//            return "Cannot connect to service";
//        }
//
//        try {
//            return demoClient.getFromClient1();
//        } catch (FeignException e){
//            return e.getMessage();
//        }
        return "From client 2";
    }
}
