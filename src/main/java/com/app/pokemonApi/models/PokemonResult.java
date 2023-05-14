package com.app.pokemonApi.models;

import com.app.pokemonApi.service.PokemonDTO;
public class PokemonResult {
    private String name;
    private String url;
    private PokemonDTO pokemon;

    public PokemonResult() {
        // Constructor vacío requerido para la deserialización
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PokemonDTO getPokemon() {
        return pokemon;
    }

    public void setPokemon(PokemonDTO pokemon) {
        this.pokemon = pokemon;
    }
}
