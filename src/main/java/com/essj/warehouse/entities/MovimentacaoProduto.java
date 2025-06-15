package com.essj.warehouse.entities;

import com.essj.warehouse.entities.enums.TipoMovimentacao;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MovimentacaoProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Produto produto;

    private int quantidadeMovimentada;

    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipo;

    private LocalDateTime dataHora;

    private String observacao;

    public MovimentacaoProduto(){}

    public MovimentacaoProduto(Long id, Produto produto, int quantidadeMovimentada, TipoMovimentacao tipo, LocalDateTime dataHora, String observacao) {
        this.id = id;
        this.produto = produto;
        this.quantidadeMovimentada = quantidadeMovimentada;
        this.tipo = tipo;
        this.dataHora = dataHora;
        this.observacao = observacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeMovimentada() {
        return quantidadeMovimentada;
    }

    public void setQuantidadeMovimentada(int quantidadeMovimentada) {
        this.quantidadeMovimentada = quantidadeMovimentada;
    }

    public TipoMovimentacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimentacao tipo) {
        this.tipo = tipo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    @Override
    public String toString() {
        return "MovimentacaoProduto{" +
                "id=" + id +
                ", produto=" + produto +
                ", quantidadeMovimentada=" + quantidadeMovimentada +
                ", tipo=" + tipo +
                ", dataHora=" + dataHora +
                ", observacao='" + observacao + '\'' +
                '}';
    }
}