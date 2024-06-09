/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemavete.persistencia;

import com.mycompany.sistemavete.logica.Cliente;
import com.mycompany.sistemavete.logica.Mascota;
import com.mycompany.sistemavete.logica.TipoUsuario;
import com.mycompany.sistemavete.logica.Usuario;
import com.mycompany.sistemavete.persistencia.exceptions.NonexistentEntityException;
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

    public void guardar(Cliente cliente) {
        clienteJpa.create(cliente);
    }

    public void guardarMascota(Mascota m) {
        mascoJpa.create(m);
    }

    public Cliente buscarCliente(String dni) {
        return clienteJpa.findClienteByDni(dni);
    }

    public List<Cliente> traerClientes() {
        List<Cliente> clientes = clienteJpa.findClienteEntities();
        return clientes;
    }

    public List<Mascota> traerMascotasPorNom(String nombre) {
        List<Mascota> m = mascoJpa.findMascotasPorNombre(nombre);
        return m;
    }

    public List<Mascota> traerMascotas() {
        List<Mascota> m = mascoJpa.findMascotaEntities();
        return m;
    }

    public void eliminarCliente(String dni) throws NonexistentEntityException {
        this.clienteJpa.destroy(dni);
    }

    public List<Mascota> traerMascotasPorIdCli(int id) {
        return this.mascoJpa.findMascotaEntities(id);
    }

    public void eliminarListaMascPorIdCli(int id) throws NonexistentEntityException {
        this.mascoJpa.destroyByClienteId(id);
    }

    public void eliminarClientePorId(int id) {
        try {
            this.clienteJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, "El cliente con id " + id + " no existe.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarMascota(int id) {
        try {
            this.mascoJpa.destroy(id);
            JOptionPane.showMessageDialog(null, "Mascota Eliminada");
        } catch (NonexistentEntityException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public void crearTipo(TipoUsuario tipo) {
        this.tipoJpa.create(tipo);
    }

    public List<TipoUsuario> TraerTipo() {
        return tipoJpa.findTipoUsuarioEntities();
    }

    public TipoUsuario buscarTipoxNOM(String tipo) {
        return tipoJpa.findTipoUsuarioByNombre(tipo);
    }

    public void guardarUsuario(Usuario usu) {
        usuJpa.create(usu);
        JOptionPane.showMessageDialog(null, "Usuario Creado");
    }

    public Usuario buscarUsuario(String text) {
        return usuJpa.findUsuarioByNombre(text);
    }

    public void editarUsu(Usuario u) throws Exception {
        usuJpa.edit(u);
        JOptionPane.showMessageDialog(null, "Usuario editado");
    }

    public List<Usuario> TraerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }

    public void editarCliente(Cliente cliente) throws Exception {
       clienteJpa.edit(cliente);
    }

}
