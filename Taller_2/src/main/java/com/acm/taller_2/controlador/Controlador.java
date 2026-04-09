package com.acm.taller_2.controlador;

import com.acm.taller_2.modelo.Pokemon;
import com.acm.taller_2.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RequestMapping("/api/pokemones")
@RestController
public class Controlador {
    private final PokemonService pokemonService;

    @Autowired
    public Controlador(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }
    @GetMapping("/getDatosById/{id}")
    public Mono<Pokemon> getDatosById(@PathVariable int id){
        return pokemonService.getDatosById(id);
    }
    @GetMapping("/getAllPokemon")
    public Mono<List<Pokemon>> getAllPokemon(){
        return pokemonService.getAllPokemon();
    }
}
