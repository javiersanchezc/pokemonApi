package com.app.pokemonApi.service;

import com.app.pokemonApi.models.Pokemon;
import com.app.pokemonApi.models.PokemonApiClient;
import com.app.pokemonApi.models.PokemonResponse;
import org.springframework.stereotype.Service;


@Service
public class PokemonService {
    private final PokemonApiClient pokemonApiClient;

    public PokemonService(PokemonApiClient pokemonApiClient) {
        this.pokemonApiClient = pokemonApiClient;
    }
/*
    public PokemonDTO getPokemon(int id) {
        Pokemon pokemon = this.pokemonApiClient.getPokemon(id);

        PokemonDTO pokemonDTO = new PokemonDTO();
        pokemonDTO.setId(pokemon.getId());
        pokemonDTO.setName(pokemon.getName());


        return pokemonDTO;
    }
*/
    public PokemonResponse getPokemons(int page, int size) {
        return this.pokemonApiClient.getPokemons(page, size);
    }
}
