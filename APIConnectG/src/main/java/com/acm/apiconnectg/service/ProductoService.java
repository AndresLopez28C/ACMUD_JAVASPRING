package com.acm.apiconnectg.service;

import com.acm.apiconnectg.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class ProductoService {
    private final WebClient webClient;
    @Autowired
    public ProductoService (WebClient webClient){
        this.webClient = webClient;
    }
    public Mono<Producto> getProductoById (int id){
        return webClient.get()
                .uri("/products/{id}",id)
                .retrieve()
                .bodyToMono(Producto.class);
    }

}
