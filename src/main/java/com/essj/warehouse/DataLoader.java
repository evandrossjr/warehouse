package com.essj.warehouse;


import com.essj.warehouse.entities.Produto;
import com.essj.warehouse.entities.enums.Unidade;
import com.essj.warehouse.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader implements CommandLineRunner {


    @Autowired
    private ProdutoRepository produtoRepository;


    @Override
    public void run(String... args) throws Exception{
        Produto p1 = new Produto();
        p1.setNome("caneta");
        p1.setCodigo("0001");
        p1.setUnidade(Unidade.UND);


        produtoRepository.saveAll(List.of(p1));
    }
}

