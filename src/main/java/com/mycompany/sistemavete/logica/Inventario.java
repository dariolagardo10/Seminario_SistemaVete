/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavete.logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Dario
 */

@Entity
public class Inventario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id; // Identificador único del inventario

    @ManyToOne
    @JoinColumn(name = "articulo_id", nullable = false)
    private Articulo articulo; // Referencia al artículo asociado

    @Column(name = "fecha")
    private Date fecha; // Fecha de registro o actualización del inventario

    @Column(name = "stock_actual", nullable = false)
    private int stockActual; // Cantidad actual en stock

    // Constructores, getters y setters

    public Inventario() {
    }

    public Inventario(Articulo articulo, Date fecha, int stockActual) {
        this.articulo = articulo;
        this.fecha = fecha;
        this.stockActual = stockActual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

}

