/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavete.logica;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Dario
 */
@Entity
public class Articulo implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id; // Identificador único del artículo
    
    @Column(name = "nombre", length = 255, nullable = false)
    private String nombre; // Nombre del artículo
    
    @Column(name = "precio_actual", nullable = false)
    private double precioActual; // Precio actual del artículo
    
    @Column(name = "stock_actual", nullable = false)
    private int stockActual; // 

    // Constructores, getters y setters

    public Articulo() {
    }

    public Articulo(String nombre, double precioActual, int stockActual) {
        this.nombre = nombre;
        this.precioActual = precioActual;
        this.stockActual = stockActual;
    }

   

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

  
    
}
