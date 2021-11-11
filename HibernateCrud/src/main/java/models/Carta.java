/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author juanl
 */
@Entity
@Table(name="Carta")
public class Carta implements Serializable{
    
   @OneToMany(mappedBy = "carta", fetch = FetchType.EAGER) 
    private List<Pedido> pedido;  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column (name="idProducto")
    private String idProducto;
    
    @Column (name="estadoPedido")
    private String estadoPedido;
    
    @Column (name="precioProd")
    private Integer precioProd;
    
    public Carta() {
    }

    public Carta(Integer id, String idProducto, String estadoPedido, Date fecha) {
        this.id = id;
        this.idProducto = idProducto;
        this.estadoPedido = estadoPedido;
        this.precioProd = precioProd;
    }

    


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Integer getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(Integer precioProd) {
        this.precioProd = precioProd;
    }

    @Override
    public String toString() {
        return "Carta{" + "id=" + id + ", idProducto=" + idProducto + ", estadoPedido=" + estadoPedido + ", precioProd=" + precioProd + '}';
    }

    public void setPrecioProd(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
