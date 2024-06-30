/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavete.persistencia;

import com.mycompany.sistemavete.logica.Articulo;
import com.mycompany.sistemavete.logica.Cita;
import com.mycompany.sistemavete.logica.Cliente;
import com.mycompany.sistemavete.logica.HistoriaClinica;
import com.mycompany.sistemavete.logica.Mascota;
import com.mycompany.sistemavete.logica.TipoUsuario;
import com.mycompany.sistemavete.logica.Usuario;
import com.mycompany.sistemavete.persistencia.exceptions.NonexistentEntityException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class ControladoraPersistencia {

private EntityManagerFactory emf = Persistence.createEntityManagerFactory("VeterinariaPU");
ClienteJpaController clienteJpa = new ClienteJpaController();
MascotaJpaController mascoJpa = new MascotaJpaController();
TipoUsuarioJpaController tipoJpa = new TipoUsuarioJpaController();
UsuarioJpaController usuJpa = new UsuarioJpaController();
CitaJpaController citaJpa = new CitaJpaController();
HistoriaClinicaJpaController HistoriaCJpa = new HistoriaClinicaJpaController();
InventarioJpaController InventarioCJpa = new InventarioJpaController();
ArticuloJpaController articuloJpa = new ArticuloJpaController();

// Guarda un nuevo cliente
public void guardar(Cliente cliente) {
    clienteJpa.create(cliente);
}

// Guarda una nueva mascota
public void guardarMascota(Mascota m) {
    mascoJpa.create(m);
}

// Busca un cliente por su DNI
public Cliente buscarCliente(String dni) {
    return clienteJpa.findClienteByDni(dni);
}

// Trae todos los clientes
public List<Cliente> traerClientes() {
    return clienteJpa.findClienteEntities();
}

// Trae las mascotas por su nombre
public List<Mascota> traerMascotasPorNom(String nombre) {
    return mascoJpa.findMascotasPorNombre(nombre);
}

// Trae todas las mascotas
public List<Mascota> traerMascotas() {
    return mascoJpa.findMascotaEntities();
}

// Elimina un cliente por su DNI
public void eliminarCliente(String dni) throws NonexistentEntityException {
    this.clienteJpa.destroy(dni);
}

// Trae las mascotas por el ID del cliente
public List<Mascota> traerMascotasPorIdCli(int id) {
    return this.mascoJpa.findMascotaEntities(id);
}

// Elimina todas las mascotas por el ID del cliente
public void eliminarListaMascPorIdCli(int id) throws NonexistentEntityException {
    this.mascoJpa.destroyByClienteId(id);
}

// Elimina un cliente por su ID
public void eliminarClientePorId(int id) {
    try {
        this.clienteJpa.destroy(id);
    } catch (NonexistentEntityException ex) {
        JOptionPane.showMessageDialog(null, "El cliente con id " + id + " no existe.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

// Elimina una mascota por su ID
public void eliminarMascota(int id) {
    try {
        this.mascoJpa.destroy(id);
        JOptionPane.showMessageDialog(null, "Mascota Eliminada");
    } catch (NonexistentEntityException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
}

// Crea un nuevo tipo de usuario
public void crearTipo(TipoUsuario tipo) {
    this.tipoJpa.create(tipo);
}

// Trae todos los tipos de usuario
public List<TipoUsuario> TraerTipo() {
    return tipoJpa.findTipoUsuarioEntities();
}

// Busca un tipo de usuario por su nombre
public TipoUsuario buscarTipoxNOM(String tipo) {
    return tipoJpa.findTipoUsuarioByNombre(tipo);
}

// Guarda un nuevo usuario
public void guardarUsuario(Usuario usu) {
    usuJpa.create(usu);
    JOptionPane.showMessageDialog(null, "Usuario Creado");
}

// Busca un usuario por su nombre de usuario
public Usuario buscarUsuario(String text) {
    return usuJpa.findUsuarioByNombre(text);
}

// Edita un usuario existente
public void editarUsu(Usuario u) throws Exception {
    usuJpa.edit(u);
    JOptionPane.showMessageDialog(null, "Usuario editado");
}

// Trae todos los usuarios
public List<Usuario> TraerUsuarios() {
    return usuJpa.findUsuarioEntities();
}

// Edita un cliente existente
public void editarCliente(Cliente cliente) throws Exception {
   clienteJpa.edit(cliente);
}

// Trae una mascota por su ID
public Mascota traerMascota(int id) {
    return mascoJpa.findMascota(id);
}

// Crea una nueva cita
public void crearCitas(Cita c) {
   this.citaJpa.create(c);
}

// Crea una nueva historia clínica
public void crearHistC(HistoriaClinica h) {
    this.HistoriaCJpa.create(h);
}

// Crea un nuevo artículo
public void crearArticulo(Articulo a) {
    this.articuloJpa.create(a);
}

// Trae todos los artículos
public List<Articulo> traerArticulos() {
    return this.articuloJpa.findArticuloEntities();
}

// Busca un usuario por su ID
public Usuario buscarUsuarioxId(int seleccionado) {
    return this.usuJpa.findUsuario(seleccionado);
}

// Trae un artículo por su ID
public Articulo traerArticuloxId(int seleccionado) {
    return this.articuloJpa.findArticulo(seleccionado);
}

// Edita un artículo existente
public void editarArticulo(Articulo a) {
    try {
        this.articuloJpa.edit(a);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
}

// Elimina un artículo
public void eliminarArt(Articulo u) {
    try {
        this.articuloJpa.destroy(u.getId());
    } catch (NonexistentEntityException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
}

// Busca un artículo por su nombre
public Articulo traerArticuloxNom(String text) {
    return this.articuloJpa.findArticuloByName(text);
}

// Edita un tipo de usuario existente
public void editarTipoUsu(TipoUsuario tipoUsuario) throws Exception {
    this.tipoJpa.edit(tipoUsuario);
}

// Elimina un tipo de usuario por su ID
public void eliminarTipo(int id) throws NonexistentEntityException {
    this.tipoJpa.destroy(id);
}

// Elimina un usuario por su ID
public void eliminarUsu(int id_Usu) throws NonexistentEntityException {
    this.usuJpa.destroy(id_Usu);
}

// Edita una mascota existente
public void editarM(Mascota mascotaSeleccionada) throws Exception {
    this.mascoJpa.edit(mascotaSeleccionada);
}

// Busca una cita por mascota y fecha
public Cita buscarCita(Mascota m, Date fechaSeleccionada) {
    return this.citaJpa.buscarCita(m,fechaSeleccionada);
}

// Elimina una cita por su ID
public void eliminarCita1(int id) throws NonexistentEntityException {
    this.citaJpa.destroy(id);
}

// Trae una cita por mascota y fecha
public Cita traerCita(Mascota m, Date fechaSeleccionada) {
    return this.citaJpa.buscarCita(m, fechaSeleccionada);
}

// Edita una cita existente
public void editarCita(Cita citaExistente) throws Exception {
    this.citaJpa.edit(citaExistente);
}

// Trae las citas por una lista de mascotas
public List<Cita> traerCita2(List<Mascota> m) {
    return this.citaJpa.buscarCitaPorMascotas(m);
}

// Busca una historia clínica por mascota y fecha
public HistoriaClinica buscarHistoriaClinicaPorMascotaYFecha(Mascota m, Date fecha) {
    return this.HistoriaCJpa.buscarHistoriaClinicaPorMascotaYFecha(m,fecha);
}

// Crea una nueva historia clínica
public void crearHistoriaClinica(HistoriaClinica historia) {
    this.HistoriaCJpa.crearHistoriaClinica(historia);
}

// Actualiza una historia clínica existente
public void actualizarHistoriaClinica(HistoriaClinica historia) {
    this.HistoriaCJpa.actualizarHistoriaClinica(historia);
}

// Elimina una historia clínica existente
public void eliminarHistoriaClinica(HistoriaClinica historia) {
    this.HistoriaCJpa.eliminarHistoriaClinica(historia);
}

// Trae una lista de historias clínicas por nombre de mascota
public List<HistoriaClinica> traerlistaH(String text) {
    return this.HistoriaCJpa.traerHistoriasClinicasPorNombreMascota(text);
}

// Trae todas las historias clínicas
public List<HistoriaClinica> traerlistaH2() {
    return this.HistoriaCJpa.findHistoriaClinicaEntities();
}
}
