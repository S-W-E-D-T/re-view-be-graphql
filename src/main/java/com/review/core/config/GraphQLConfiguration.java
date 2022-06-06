package com.review.core.config;

import com.review.core.service.GraphQLUserService;
import io.leangen.graphql.metadata.strategy.query.PublicResolverBuilder;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import io.leangen.graphql.spqr.spring.annotations.WithResolverBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfiguration {

    @GraphQLApi
    @WithResolverBuilder(PublicResolverBuilder.class)
    @Bean
    public GraphQLUserService graphQLUserService() {
        return new GraphQLUserService();
    }
}
