package com.essj.warehouse.dto;

import com.essj.warehouse.entities.Produto;
import com.essj.warehouse.entities.enums.Unidade;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;

public class ProdutoDTO {

    @NotBlank
    private String codigo;

    @NotBlank
    private String nome;

    @NotBlank
    private String ean;
    private boolean ativo;
    private String codigoFornecedor;
    private String marca;
    private String modelo;
    private String localizador;
    private Long quantidadeEmbalagem;

    private int quantidade;

    @NotNull
    private BigDecimal preco;

    private double peso;
    private Long estoqueMaximo;
    private Long estoqueMinimo;

    private String grupo;
    private String classificacaoFiscal;
    private String tipoDeProduto;

    @Enumerated(EnumType.STRING)
    private Unidade unidade;

    private Date dataCadastro;

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

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public static ProdutoDTO convert(Produto produto){
        ProdutoDTO produtoDTO = new ProdutoDTO();
        produtoDTO.setCodigo(produto.getCodigo());
        produtoDTO.setNome(produto.getNome());
        produtoDTO.setEan(produto.getEan());
        produtoDTO.setAtivo(produto.isAtivo());
        produtoDTO.setCodigoFornecedor(produto.getCodigoFornecedor());
        produtoDTO.setMarca(produto.getMarca());
        produtoDTO.setModelo(produto.getModelo());
        produtoDTO.setLocalizador(produto.getLocalizador());
        produtoDTO.setQuantidadeEmbalagem(produto.getQuantidadeEmbalagem());
        produtoDTO.setQuantidade(produto.getQuantidade());
        produtoDTO.setPreco(produto.getPreco());
        produtoDTO.setPeso(produto.getPeso());
        produtoDTO.setEstoqueMaximo(produto.getEstoqueMaximo());
        produtoDTO.setEstoqueMinimo(produto.getEstoqueMinimo());
        produtoDTO.setGrupo(produto.getGrupo());
        produtoDTO.setClassificacaoFiscal(produto.getClassificacaoFiscal());
        produtoDTO.setTipoDeProduto(produto.getTipoDeProduto());
        produtoDTO.setUnidade(produto.getUnidade());
        produtoDTO.setDataCadastro(produto.getDataCadastro());

        return produtoDTO;
    }


}
