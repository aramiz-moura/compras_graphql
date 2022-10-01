package com.example.graphql_compras.graphql;


import com.example.graphql_compras.feignclient.TouristClient;
import com.example.graphql_compras.model.Tourist;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TouristService {

    private final TouristClient touristClient;

    public Tourist getTourist() {
        return touristClient.getTourist();
    }

}
