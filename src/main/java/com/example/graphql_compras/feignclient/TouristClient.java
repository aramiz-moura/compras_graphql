package com.example.graphql_compras.feignclient;


import com.example.graphql_compras.model.Tourist;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name ="tourist-client" ,url = "http://restapi.adequateshop.com/api/Tourist?page=2")
public interface TouristClient {


    @GetMapping
    Tourist getTourist();
}
