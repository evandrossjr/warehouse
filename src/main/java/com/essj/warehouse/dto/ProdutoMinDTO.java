package com.essj.warehouse.dto;

import com.essj.warehouse.entities.Produto;
import com.essj.warehouse.entities.enums.Unidade;

import java.util.Date;

public class ProdutoMinDTO {


    private String codigo;
    private String nome;
    private Unidade unidade;
    private Date dataCadastro;


    public ProdutoMinDTO(){
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

    public static ProdutoMinDTO toMinDTO(Produto produto) {
        ProdutoMinDTO produtoMinDTO = new ProdutoMinDTO();
        produtoMinDTO.setCodigo(produto.getCodigo());
        produtoMinDTO.setNome(produto.getNome());
        produtoMinDTO.setUnidade(produto.getUnidade());
        produtoMinDTO.setDataCadastro(produto.getDataCadastro());

        return produtoMinDTO;
    }
}


