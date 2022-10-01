package com.example.graphql_compras.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql_compras.model.Cliente;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class QueryGraphQL implements GraphQLQueryResolver {

    public String hello() {
        return "Hello GraphQL!";
    }

    public int soma(int a, int b) {
        return a+b;
    }

    public Cliente cliente() {
        return new Cliente("Aramiz","aramiz@gmail.com");
    }

    public List<Cliente> clientes() {
        List<Cliente> clientes = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            clientes.add(new Cliente("Cliente" + i, "a"+i+"@gmail.com"));
        }
        return clientes;
    }

}
