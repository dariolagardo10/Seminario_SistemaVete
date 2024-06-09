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


@Entity
public class Cliente implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_cliente;
    private String nombre;
    private int edad;
    private String email;
    private String dni;
    private String localidad;
    private String nacionalidad;
    
    public Cliente() {
    }

    public Cliente(int id_cliente, String nombre, int edad, String email, String dni, String localidad, String nacionalidad) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
        this.dni = dni;
        this.localidad = localidad;
        this.nacionalidad = nacionalidad;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    
    
    
}
