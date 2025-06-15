package com.essj.warehouse.entities;


import com.essj.warehouse.entities.enums.Unidade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String código;
    private String nome;
    private String ean;
    private boolean ativo;
    private String codigoFornecedor;
    private String marca;
    private String modelo;
    private String localizador;
    private Long quantidadeEmbalagem;

    private int quantidade;
    private BigDecimal preco;

    private double peso;
    private Long estoqueMaximo;
    private Long estoqueMinimo;

    private String grupo;
    private String classificacaoFiscal;
    private String tipoDeProduto;

    private Unidade unidade;


    public Produto() {
    }

    public Produto(Long id, String código, String nome, Unidade unidade) {
        this.id = id;
        this.código = código;
        this.nome = nome;
        this.unidade = unidade;
    }

    public Produto(Long id, String código, String nome, String ean, boolean ativo, String codigoFornecedor, String marca, String modelo, String localizador, Long quantidadeEmbalagem, int quantidade, BigDecimal preco, double peso, Long estoqueMaximo, Long estoqueMinimo, String grupo, String classificacaoFiscal, String tipoDeProduto, Unidade unidade) {
        this.id = id;
        this.código = código;
        this.nome = nome;
        this.ean = ean;
        this.ativo = ativo;
        this.codigoFornecedor = codigoFornecedor;
        this.marca = marca;
        this.modelo = modelo;
        this.localizador = localizador;
        this.quantidadeEmbalagem = quantidadeEmbalagem;
        this.quantidade = quantidade;
        this.preco = preco;
        this.peso = peso;
        this.estoqueMaximo = estoqueMaximo;
        this.estoqueMinimo = estoqueMinimo;
        this.grupo = grupo;
        this.classificacaoFiscal = classificacaoFiscal;
        this.tipoDeProduto = tipoDeProduto;
        this.unidade = unidade;
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

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getLocalizador() {
        return localizador;
    }

    public void setLocalizador(String localizador) {
        this.localizador = localizador;
    }

    public Long getQuantidadeEmbalagem() {
        return quantidadeEmbalagem;
    }

    public void setQuantidadeEmbalagem(Long quantidadeEmbalagem) {
        this.quantidadeEmbalagem = quantidadeEmbalagem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Long getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(Long estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }

    public Long getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(Long estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getClassificacaoFiscal() {
        return classificacaoFiscal;
    }

    public void setClassificacaoFiscal(String classificacaoFiscal) {
        this.classificacaoFiscal = classificacaoFiscal;
    }

    public String getTipoDeProduto() {
        return tipoDeProduto;
    }

    public void setTipoDeProduto(String tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id) && Objects.equals(código, produto.código);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, código);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", código='" + código + '\'' +
                ", nome='" + nome + '\'' +
                ", ean='" + ean + '\'' +
                ", ativo=" + ativo +
                ", codigoFornecedor='" + codigoFornecedor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", localizador='" + localizador + '\'' +
                ", quantidadeEmbalagem=" + quantidadeEmbalagem +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", peso=" + peso +
                ", estoqueMaximo=" + estoqueMaximo +
                ", estoqueMinimo=" + estoqueMinimo +
                ", grupo='" + grupo + '\'' +
                ", classificacaoFiscal='" + classificacaoFiscal + '\'' +
                ", tipoDeProduto='" + tipoDeProduto + '\'' +
                ", unidade=" + unidade +
                '}';
    }
}
