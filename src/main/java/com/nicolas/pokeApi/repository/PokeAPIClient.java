package com.nicolas.pokeApi.repository;

import com.nicolas.pokeApi.dto.PokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokeapi" /* nombre_cliente */, url = "https://pokeapi.co/api/v2" /* url base. Luego se especifica con endpoints */)
public interface PokeAPIClient {
    
    @GetMapping("/pokemon/{pokemonId}")
    public PokemonDTO getPokemonInfo(@PathVariable("pokemonId") int pokemonId);
}
