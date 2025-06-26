package com.essj.warehouse.entities;

import java.util.Objects;

public class ClientePessoaJuridica extends Cliente{
    
    private String cnpj;

    public ClientePessoaJuridica() {
    }



    public ClientePessoaJuridica(Long id, String nome, String telefone, String email, String cnpj) {
        super(id, nome, telefone, email);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ClientePessoaJuridica that = (ClientePessoaJuridica) o;
        return Objects.equals(cnpj, that.cnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cnpj);
    }
}
