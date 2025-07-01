package com.essj.warehouse.services;


import com.essj.warehouse.dto.ProdutoMinDTO;
import com.essj.warehouse.entities.MovimentacaoProduto;
import com.essj.warehouse.entities.Produto;
import com.essj.warehouse.entities.enums.TipoMovimentacao;
import com.essj.warehouse.repositories.MovimentacaoProdutoRepository;
import com.essj.warehouse.repositories.ProdutoRepository;
import jakarta.transaction.TransactionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private MovimentacaoProdutoRepository movimentacaoProdutoRepository;

    @Transactional
    public List<ProdutoMinDTO> findAll(){
        List<Produto> list = produtoRepository.findAll();
        return list
                .stream()
                .map(ProdutoMinDTO::toMinDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    public ProdutoMinDTO findByCodigo(String codigo){
        Produto result = produtoRepository.findByCodigo(codigo);
        if (result != null){
            return ProdutoMinDTO.toMinDTO(result);
        }
        return null;
    }
    public ProdutoMinDTO salvar(ProdutoMinDTO produtoMinDTO){
        Produto produto = produtoRepository.save(Produto.fromMinDTO(produtoMinDTO));
        return  ProdutoMinDTO.toMinDTO(produto);
    }


    @Transactional
    public void registrarMovimentacao(Long produtoId, int quantidade, TipoMovimentacao tipo) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }

        Produto produto = produtoRepository.findById(produtoId)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        if (tipo == TipoMovimentacao.SAIDA && produto.getQuantidade() < quantidade) {
            throw new RuntimeException("Estoque insuficiente");
        }

        // Atualiza estoque
        if (tipo == TipoMovimentacao.ENTRADA) {
            produto.setQuantidade(produto.getQuantidade() + quantidade);
        } else {
            produto.setQuantidade(produto.getQuantidade() - quantidade);
        }

        produtoRepository.save(produto);

        // Salva movimentação
        MovimentacaoProduto mov = new MovimentacaoProduto();
        mov.setProduto(produto);
        mov.setQuantidadeMovimentada(quantidade);
        mov.setTipo(tipo);
        mov.setDataHora(LocalDateTime.now());
        mov.setObservacao(""); // ou permitir passar como parâmetro

        movimentacaoProdutoRepository.save(mov);
    }


    public void delete(Long id){
        produtoRepository.deleteById(id);
    }

}
