package com.web.trabalho.Entidade;
// Generated 01/10/2018 01:57:15 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private Integer cod;
     private Date data;
     private String total;

    public Pedido() {
    }

    public Pedido(Date data, String total) {
       this.data = data;
       this.total = total;
    }
   
    public Integer getCod() {
        return this.cod;
    }
    
    public void setCod(Integer cod) {
        this.cod = cod;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public String getTotal() {
        return this.total;
    }
    
    public void setTotal(String total) {
        this.total = total;
    }




}

