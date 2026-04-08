package com.acm.apiconnectg.controler;

import com.acm.apiconnectg.model.Producto;
import com.acm.apiconnectg.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequestMapping("/api/productos")
@RestController
public class ProductoControler {
    private final ProductoService productoService;

    @Autowired
    public ProductoControler(ProductoService productoService){
        this.productoService = productoService;
    }
    @GetMapping("/getProductoById/{id}")
    public Mono<Producto> getProductoById(@PathVariable int id){
        return productoService.getProductoById(id);
    }
}
