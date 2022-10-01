package com.example.graphql_compras.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.graphql_compras.model.Tourist;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class TouristGraphQL implements GraphQLQueryResolver, GraphQLMutationResolver {

    private final TouristService touristService;


    public Tourist getTourist() {
        return touristService.getTourist();
    }
}
