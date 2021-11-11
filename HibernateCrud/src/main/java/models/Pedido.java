/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author juanl
 */
@Entity
@Table(name="pedido")
public class Pedido implements Serializable {
    
   @ManyToOne()
   @JoinColumn(name = "idProducto", insertable = false, updatable = false)
   
    private Carta carta;  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProd;
    
    @Column (name="nombreProd")
    private String nombreProd;
    
    @Column (name="estadoProd")
    private String estadoProd;
    
    @Column (name="precioProd")
    private Date fechaProd;
    
    public Pedido() {
    }

    public Pedido(Integer idProd, String nombreProd, String estadoProd, Integer precioProd) {
        this.idProd = idProd;
        this.nombreProd = nombreProd;
        this.estadoProd = estadoProd;
        this.fechaProd = fechaProd;
    }

    public Integer getIdProd() {
        return idProd;
    }

    public void setIdProd(Integer idProd) {
        this.idProd = idProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getEstadoProd() {
        return estadoProd;
    }

    public void setEstadoProd(String estadoProd) {
        this.estadoProd = estadoProd;
    }

    public Date getFechaProd() {
        return fechaProd;
    }

    public void setFechaProd(Date fechaProd) {
        this.fechaProd = fechaProd;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idProd=" + idProd + ", nombreProd=" + nombreProd + ", estadoProd=" + estadoProd + ", fechaProd=" + fechaProd + '}';
    }
    
}
