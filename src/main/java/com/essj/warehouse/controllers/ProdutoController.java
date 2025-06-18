package com.essj.warehouse.controllers;


import com.essj.warehouse.dto.ProdutoMinDTO;
import com.essj.warehouse.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
