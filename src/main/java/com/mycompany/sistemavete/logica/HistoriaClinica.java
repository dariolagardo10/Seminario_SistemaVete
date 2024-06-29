/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavete.logica;

/**
 *
 * @author Dario
 */
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class HistoriaClinica implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id; // Identificador único de la historia clínica
    
    @ManyToOne
    @JoinColumn(name = "id_mascota")
    private Mascota mascota; // Referencia a la mascota asociada a la historia clínica
    
    
    @Column(name = "fecha")
    private Date fecha; // Fecha de la historia clínica
    @Column(name = "motivo", length = 1000)
    private String motivo; // motivo de la historia clínica
    @Column(name = "descripcion", length = 1000)
    private String descripcion; // Descripción de la historia clínica

    // Constructores, getters y setters
    
    public HistoriaClinica() {
    }

    public HistoriaClinica(Mascota mascota, Date fecha, String motivo, String descripcion) {
        this.mascota = mascota;
        this.fecha = fecha;
        this.motivo = motivo;
        this.descripcion = descripcion;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}

