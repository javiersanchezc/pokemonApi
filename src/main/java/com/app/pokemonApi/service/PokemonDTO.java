package com.app.pokemonApi.service;

public class PokemonDTO {
    private int id;
    private String name;
    // ...otros campos necesarios...

    public PokemonDTO() {
        // Constructor vacío requerido para la deserialización
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ...otros métodos getters y setters...
}
