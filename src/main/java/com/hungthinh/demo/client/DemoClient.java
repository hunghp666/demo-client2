package com.hungthinh.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient (name = "demo-client" ,
                url = "https://localhost:8091")
public interface DemoClient {
    @GetMapping (value = "/test/hello")
    String getFromClient1();
}
