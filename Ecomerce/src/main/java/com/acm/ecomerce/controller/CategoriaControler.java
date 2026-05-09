package com.acm.ecomerce.controller;

import com.acm.ecomerce.entity.Categoria;
import com.acm.ecomerce.repository.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/categorias")
public class CategoriaControler {
    private CategoriaService categoriaService;
    @Autowired
    public CategoriaControler(CategoriaService categoriaService){
        this.categoriaService = categoriaService;
    }
    @PostMapping("create-categoria")
    public ResponseEntity<Categoria> saveCategoria(@RequestBody Categoria categoria){
        Categoria categoriaGuardada  = categoriaService.crearCategoria(categoria);
        return ResponseEntity.ok(categoriaGuardada);
    }


}
