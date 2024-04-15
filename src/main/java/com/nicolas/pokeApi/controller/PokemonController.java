package com.nicolas.pokeApi.controller;

import com.nicolas.pokeApi.dto.PokemonDTO;
import com.nicolas.pokeApi.repository.PokeAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {
    
    @Autowired
    private PokeAPIClient pokeAPIClient;
    
    @GetMapping("/pokemon/{pokemonId}")
    public PokemonDTO getPokemonInfo(@PathVariable ("pokemonId") int pokemonId) {
        return pokeAPIClient.getPokemonInfo(pokemonId);
    }
}
