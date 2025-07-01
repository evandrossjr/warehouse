package com.essj.warehouse.controllers;


import com.essj.warehouse.dto.ProdutoMinDTO;
import com.essj.warehouse.services.ProdutoService;
import jakarta.validation.Valid;
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

    @GetMapping(value = "/{codigo}")
    public ProdutoMinDTO findById(@PathVariable String codigo) {
        ProdutoMinDTO result = produtoService.findByCodigo(codigo);
        return result;
    }

    @PostMapping
    ProdutoMinDTO novoProduto(@Valid @RequestBody ProdutoMinDTO produtoMinDTO){
        return produtoService.salvar(produtoMinDTO);
    }


    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        produtoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
