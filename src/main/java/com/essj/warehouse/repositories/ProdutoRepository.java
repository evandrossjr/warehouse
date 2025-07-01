package com.essj.warehouse.repositories;

import com.essj.warehouse.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public Produto findByCodigo(String codigo);

}

