package com.mycompany.sistemavete.logica;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class TipoUsuario implements Serializable   {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Tipo;
    private String nombre;

    public TipoUsuario() {
    }

    public TipoUsuario(String nombre) {
        this.nombre = nombre;
    }

    public int getId_Tipo() {
        return id_Tipo;
    }

    public void setId_Tipo(int id_Tipo) {
        this.id_Tipo = id_Tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
