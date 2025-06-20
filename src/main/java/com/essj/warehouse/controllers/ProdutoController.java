package com.essj.warehouse.controllers;


import com.essj.warehouse.dto.ProdutoMinDTO;
import com.essj.warehouse.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    private List<ProdutoMinDTO> findAll(){
        List<ProdutoMinDTO> result = produtoService.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public ProdutoMinDTO findById(@PathVariable Long id) {
        ProdutoMinDTO result = produtoService.findById(id);
        return result;
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        produtoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
