package com.essj.warehouse.dto;

import com.essj.warehouse.entities.Produto;
import com.essj.warehouse.entities.enums.Unidade;

import java.util.Date;

public class ProdutoMinDTO {


    private Long id;
    private String codigo;
    private String nome;
    private Unidade unidade;
    private Date dataCadastro;


    public ProdutoMinDTO(){
    }

    public ProdutoMinDTO(Produto entity){
        id = entity.getId();
        codigo = entity.getCodigo();
        nome = entity.getNome();
        unidade = entity.getUnidade();
        dataCadastro = entity.getDataCadastro();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}


