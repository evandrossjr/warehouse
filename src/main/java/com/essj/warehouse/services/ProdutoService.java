package com.essj.warehouse.services;


import com.essj.warehouse.entities.Produto;
import com.essj.warehouse.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto findAll(){
        return produtoRepository.findAll();
    }
}
