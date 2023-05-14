package com.app.pokemonApi.models;
public class Pokemon {
    private int id;
    private String name;
    // ...otros campos necesarios...

    public Pokemon() {
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

