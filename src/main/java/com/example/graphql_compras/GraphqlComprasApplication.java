package com.example.graphql_compras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GraphqlComprasApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlComprasApplication.class, args);
    }

}
