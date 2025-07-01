package com.essj.warehouse.entities;


import javax.xml.crypto.Data;
import java.util.Date;

public abstract class Cliente {

    private Long id;

    private String nome;
    private String telefone;
    private String email;
    private Date dataCasdastro;

    public Cliente() {
    }

    public Cliente(Long id, String nome, String telefone, String email, Date dataCasdastro) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataCasdastro = dataCasdastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCasdastro() {
        return dataCasdastro;
    }

    public void setDataCasdastro(Date dataCasdastro) {
        this.dataCasdastro = dataCasdastro;
    }
}
