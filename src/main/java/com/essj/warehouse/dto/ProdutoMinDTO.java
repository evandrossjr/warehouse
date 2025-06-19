package com.essj.warehouse.dto;

import com.essj.warehouse.entities.Produto;

public class ProdutoMinDTO {


    private Long id;
    private String codigo;
    private String nome;
    private String grupo;


    public ProdutoMinDTO(){
    }

    public ProdutoMinDTO(Produto entity){
        id = entity.getId();
        codigo = entity.getCodigo();
        nome = entity.getNome();
        grupo = entity.getGrupo();
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

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}


