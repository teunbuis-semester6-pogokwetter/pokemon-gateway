package com.teun.pokemongateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GatewayConfig {
    @Bean
    @Profile("prod")
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("home", r -> r.path("/api/home/**")
                        .uri("http://pokemon-gateway:8080"))
                .route("userpokemon", r -> r.path("/api/userpokemon/**")
                        .uri("http://pokemon-service:8081"))
                .route("pokemon", r -> r.path("/api/pokemon/**")
                        .uri("http://pokemon-service:8081"))
                .route("pokemonimg", r -> r.path("/api/pokemonimg/**")
                        .uri("http://pokemon-service:8081"))
                .route("user", r -> r.path("/api/user/**")
                        .uri("http://user-service:8082"))
                .route("auth", r -> r.path("/api/auth/**")
                        .uri("http://auth-service:8082"))
                .route("read", r -> r.path("/api/userpokemonread/**")
                        .uri("http://pokemonread-service:8085"))
                .route("write", r -> r.path("/api/userpokemonwrite/**")
                        .uri("http://pokemonwrite-service:8086"))
                .build();
    }
    @Bean
    @Profile("dev")
    public RouteLocator customRouteLocator2(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("home", r -> r.path("/api/home/**")
                        .uri("http://localhost:8080"))
                .route("userpokemon", r -> r.path("/api/userpokemon/**")
                        .uri("http://localhost:8081"))
                .route("pokemon", r -> r.path("/api/pokemon/**")
                        .uri("http://localhost:8081"))
                .route("pokemonimg", r -> r.path("/api/pokemonimg/**")
                        .uri("http://localhost:8081"))
                .route("user", r -> r.path("/api/user/**")
                        .uri("http://localhost:8082"))
                .route("auth", r -> r.path("/api/auth/**")
                        .uri("http://localhost:8082"))
                .route("read", r -> r.path("/api/userpokemonread/**")
                        .uri("http://localhost:8085"))
                .route("write", r -> r.path("/api/userpokemonwrite/**")
                        .uri("http://localhost:8086"))
                .build();
    }
}
