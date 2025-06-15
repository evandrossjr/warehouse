package com.essj.warehouse.dto;

import com.essj.warehouse.entities.Produto;

public class ProdutoMinDTO {


    private Long id;
    private String código;
    private String nome;
    private String grupo;


    public ProdutoMinDTO(){
    }

    public ProdutoMinDTO(Produto entity){
        id = entity.getId();
        código = entity.getCódigo();
        nome = entity.getNome();
        grupo = entity.getGrupo();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
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


