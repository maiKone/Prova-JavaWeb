package com.web.trabalho.Entidade;
// Generated 01/10/2018 01:57:15 by Hibernate Tools 4.3.1



/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private Integer codProd;
     private String nome;
     private Double preco;
     private Integer qtd;

    public Produto() {
    }

    public Produto(String nome, Double preco, Integer qtd) {
       this.nome = nome;
       this.preco = preco;
       this.qtd = qtd;
    }
   
    public Integer getCodProd() {
        return this.codProd;
    }
    
    public void setCodProd(Integer codProd) {
        this.codProd = codProd;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return this.preco;
    }
    
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Integer getQtd() {
        return this.qtd;
    }
    
    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }




}


