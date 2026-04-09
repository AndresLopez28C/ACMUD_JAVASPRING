package com.acm.taller_2.service;

import com.acm.taller_2.modelo.Pokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class PokemonService {
    private final WebClient webClient;
    @Autowired
    public PokemonService (WebClient webClient){
        this.webClient = webClient;
    }
    public Mono<Pokemon>getDatosById (int id){
        return webClient.get()
                .uri("/pokemon/{id}",id)
                .retrieve()
                .bodyToMono(Pokemon.class);
    }
    public Mono<List<Pokemon>>getAllPokemon() {
        return webClient.get()
                .uri("/pokemon/")
                .retrieve()
                .bodyToFlux(Pokemon.class)
                .collectList();
    }
}
