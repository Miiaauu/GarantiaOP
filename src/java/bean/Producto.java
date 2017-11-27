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
    @Column(name="nombredeusuario")
    private String nombreUsuario;
    
    @Expose
    @Column(name="apellidodelUsuario")
    private String apellidoUsuario;
    
    @Expose
    @Column(name="numerodeSerie")
    private String numeroSerie;
    
    @Expose
    @Column(name="descripcion")
    private String descripcion;
    
    @Expose
    @Column(name="correo")
    private String correo;
    
    @Expose
    @Column(name="fecha")
    private String fecha;
    
    public Producto(){
        
    }
    
      public Producto(int idFormulario, String apellidoU, String nombreU, 
              String numeroS, String descrip, String fecha, String correo){
        this.idFormulario = idFormulario;
        this.nombreUsuario = nombreU;
        this.apellidoUsuario = apellidoU;
        this.numeroSerie = numeroS;
        this.descripcion = descrip;
        this.fecha = fecha;
        this.correo = correo;
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
     * @return the apellidoUsuario
     */
    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    /**
     * @param apellidoUsuario the apellidoUsuario to set
     */
    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
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
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
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
