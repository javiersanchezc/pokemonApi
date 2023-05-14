package com.app.pokemonApi.controller;

import com.app.pokemonApi.models.PokemonResponse;
import com.app.pokemonApi.service.PokemonDTO;
import com.app.pokemonApi.service.PokemonService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PokemonSoapController {
    private final PokemonService pokemonService;

    public PokemonSoapController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }
/*
    @GetMapping("/pokemon/{id}")
    public PokemonDTO getPokemon(@PathVariable int id) {
        return this.pokemonService.getPokemon(id);
    }
*/
    @GetMapping("/pokemons")
    public PokemonResponse getPokemons(@RequestParam int page, @RequestParam int size) {
        return pokemonService.getPokemons(page, size);
    }


}
