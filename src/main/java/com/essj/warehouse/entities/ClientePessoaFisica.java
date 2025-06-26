package com.essj.warehouse.entities;

import java.util.Objects;

public class ClientePessoaFisica extends Cliente{

    private String cpf;

    public ClientePessoaFisica() {
    }



    public ClientePessoaFisica(Long id, String nome, String telefone, String email, String cpf) {
        super(id, nome, telefone, email);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClientePessoaFisica that = (ClientePessoaFisica) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cpf);
    }
}
