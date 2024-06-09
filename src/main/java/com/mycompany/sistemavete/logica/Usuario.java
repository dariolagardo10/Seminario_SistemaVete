package com.mycompany.sistemavete.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Usu;
    private String nombre;
    private String contrasena;
    private String apellido;
    private String usuario;
 
    @ManyToOne
    @JoinColumn(name = "tipo_de_usuario_id")
    private TipoUsuario tipoDeUsuario;

    public Usuario() {
    }

    public Usuario(int id_Usu, String nombre, String contrasena, String apellido, String usuario, TipoUsuario tipoDeUsuario) {
        this.id_Usu = id_Usu;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.apellido = apellido;
        this.usuario = usuario;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public int getId_Usu() {
        return id_Usu;
    }

    public void setId_Usu(int id_Usu) {
        this.id_Usu = id_Usu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public TipoUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(TipoUsuario tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

   
    
}
