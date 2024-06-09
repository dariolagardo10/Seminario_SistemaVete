/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavete.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Dario
 */

@Entity
public class Mascota implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Mascota;
    private String nombre;
    private String raza;
    private int edad;
    @ManyToOne
    @JoinColumn(name = "unduenio_id_cliente")
    private Cliente unDuenio;

    public Mascota() {
    }

    public Mascota(int id_Mascota, String nombre, String raza, int edad, Cliente unDuenio) {
        this.id_Mascota = id_Mascota;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.unDuenio = unDuenio;
    }

    public int getId_Mascota() {
        return id_Mascota;
    }

    public void setId_Mascota(int id_Mascota) {
        this.id_Mascota = id_Mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cliente getUnDuenio() {
        return unDuenio;
    }

    public void setUnDuenio(Cliente unDuenio) {
        this.unDuenio = unDuenio;
    }

}
