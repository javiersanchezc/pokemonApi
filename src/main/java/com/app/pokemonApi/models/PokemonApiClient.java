package com.app.pokemonApi.models;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class PokemonApiClient {
    private final WebClient webClient;

    public PokemonApiClient(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://pokeapi.co/api/v2").build();
    }

    public PokemonResponse getPokemon(int limit, int offset) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/pokemon").queryParam("limit", limit).queryParam("offset", offset).build())
                .retrieve()
                .bodyToMono(PokemonResponse.class)
                .block();
    }

    public PokemonResponse getPokemons(int page, int size) {
        int offset = (page - 1) * size;

        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/pokemon")
                        .queryParam("limit", size)
                        .queryParam("offset", offset)
                        .build())
                .retrieve()
                .bodyToMono(PokemonResponse.class)
                .block();
    }




}
