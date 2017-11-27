/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import com.google.gson.annotations.Expose;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Miau
 */

@Table
@Entity(name="producto")
public class Producto {
    
    @Expose
    @Id @GeneratedValue
    @Column(name="idFormulariodeGarantia")
    private int idFormulario;
    
    @Expose
    @Column(name="nombredelProducto")
    private String nombreProducto;
    
    @Expose
    @Column(name="nombredeusuario")
    private String nombreUsuario;
    
    @Expose
    @Column(name="numerodeSerie")
    private String numeroSerie;
    
    @Expose
    @Column(name="descripcion")
    private String descripcion;
    
    @Expose
    @Column(name="fecha")
    private String fecha;
    
    public Producto(){
        
    }
    
      public Producto(int idFormulario, String nombreP, String nombreU, 
              String numeroS, String descrip, String fecha){
        this.idFormulario = idFormulario;
        this.nombreUsuario = nombreU;
        this.nombreProducto = nombreP;
        this.numeroSerie = numeroS;
        this.descripcion = descrip;
        this.fecha = fecha;
    }

    /**
     * @return the idFormulario
     */
    public int getIdFormulario() {
        return idFormulario;
    }

    /**
     * @param idFormulario the idFormulario to set
     */
    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }

    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the numeroSerie
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }

    /**
     * @param numeroSerie the numeroSerie to set
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
