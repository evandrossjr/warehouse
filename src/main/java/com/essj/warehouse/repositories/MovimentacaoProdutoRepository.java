package com.essj.warehouse.repositories;

import com.essj.warehouse.entities.MovimentacaoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoProdutoRepository extends JpaRepository<MovimentacaoProduto, Long> {
}
