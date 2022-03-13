package com.niit.MongoDbExample.proxy;

import com.niit.MongoDbExample.models.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "jwt-security-service",url = "localhost:8085")
public interface CustomerProxy {

    @PostMapping("/api/v1/register")
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer user);

}
