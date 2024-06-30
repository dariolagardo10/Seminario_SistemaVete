
package com.mycompany.sistemavete.logica;

import com.mycompany.sistemavete.persistencia.ControladoraPersistencia;
import com.mycompany.sistemavete.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Dario
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    // Crea un nuevo artículo con el nombre y precio dados
    public void crearArt(String nom, Double p) {
        Articulo a = new Articulo();
        a.setNombre(nom);
        a.setPrecioActual(p);
        this.controlPersis.crearArticulo(a);
    }

    // Devuelve una lista de todos los artículos
    public List<Articulo> listaArticulo() {
        return this.controlPersis.traerArticulos();
    }

    // Busca un usuario por su ID
    public Usuario buscarUsuxId(int seleccionado) {
        return this.controlPersis.buscarUsuarioxId(seleccionado);
    }

    // Busca un artículo por su ID
    public Articulo buscarArtxId(int seleccionado) {
        return this.controlPersis.traerArticuloxId(seleccionado);
    }

    // Edita un artículo existente
    public void editarArt(Articulo a) {
        this.controlPersis.editarArticulo(a);
    }

    // Elimina un artículo existente
    public void eliminarArt(Articulo u) {
        this.controlPersis.eliminarArt(u);
    }

    // Busca un artículo por su nombre
    public Articulo buscarArtxNom(String text) {
        return this.controlPersis.traerArticuloxNom(text);
    }

    // Busca un cliente por su DNI
    public Cliente obtenerClientePorDni(String dni) {
        return controlPersis.buscarCliente(dni);
    }

    // Devuelve una lista de todos los clientes
    public List<Cliente> listaClientes() {
        return controlPersis.traerClientes();
    }

    // Devuelve una lista de mascotas por nombre
    public List<Mascota> listaMascotasxNom(String nombre) {
        return controlPersis.traerMascotasPorNom(nombre);
    }
    
    // Devuelve una lista de todas las mascotas
    public List<Mascota> listaMascotas() {
        return controlPersis.traerMascotas();
    }

    // Devuelve una lista de mascotas por ID del cliente
    public List<Mascota> listaMascotas(int id_cliente) {
        return controlPersis.traerMascotasPorIdCli(id_cliente);
    }
    
    // Agrega una nueva mascota
    public void agregarMascota(Mascota mascota) {
        Mascota m = new Mascota();
        m.setNombre(mascota.getNombre());
        m.setEdad(mascota.getEdad());
        m.setRaza(mascota.getRaza());
        m.setUnDuenio(mascota.getUnDuenio());
        controlPersis.guardarMascota(m);
    }

    // Guarda un nuevo cliente
    public void guardarCliente(String nombre, int edad, String email, String dni, String localidad, String nacionalidad) {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setNacionalidad(nacionalidad);
        cliente.setLocalidad(localidad);
        cliente.setEmail(email);
        cliente.setEdad(edad);
        cliente.setDni(dni);
        controlPersis.guardar(cliente);
    }

    // Elimina todas las mascotas por ID del cliente
    public void eliminarListaMascPorC(int id) throws NonexistentEntityException {
        controlPersis.eliminarListaMascPorIdCli(id);
        JOptionPane.showMessageDialog(null, "Mascotas eliminadas");
    }

    // Elimina un cliente por su ID
    public void eliminarClientePorId(int id) {
        controlPersis.eliminarClientePorId(id);
    }

    // Devuelve una lista de mascotas por ID del cliente
    public List<Mascota> listaMascotasPorIdC(int id) {
        return this.controlPersis.traerMascotasPorIdCli(id);
    }

    // Elimina una mascota por su ID
    public void eliminarMascotaPorId(int id) {
        this.controlPersis.eliminarMascota(id);
    }

    // Guarda un nuevo tipo de usuario
    public void guardarTipo(String nombre) {
        TipoUsuario tipo = new TipoUsuario();
        tipo.setNombre(nombre);
        this.controlPersis.crearTipo(tipo);
    }

    // Devuelve una lista de todos los tipos de usuario
    public List<TipoUsuario> traerTipo() {
        return controlPersis.TraerTipo();
    }

    // Busca un tipo de usuario por su nombre
    public TipoUsuario buscarTipo(String tipo) {
        return controlPersis.buscarTipoxNOM(tipo);
    }

    // Guarda un nuevo usuario
    public void guardarUsu(String nombre, String contra, String apellido, String tipo, TipoUsuario tipousu) {
        Usuario usu = new Usuario();
        usu.setUsuario(tipo);
        usu.setTipoDeUsuario(tipousu);
        usu.setNombre(nombre);
        usu.setContrasena(contra);
        usu.setApellido(apellido);
        controlPersis.guardarUsuario(usu);
    }

    // Busca un usuario por su nombre de usuario
    public Usuario buscarUsu(String text) {
        return controlPersis.buscarUsuario(text);
    }

    // Edita un usuario existente
    public void editarUsu(Usuario u) throws Exception {
        controlPersis.editarUsu(u);
    }

    // Devuelve una lista de todos los tipos de usuario
    public List<TipoUsuario> mostrarTipo() {
        return controlPersis.TraerTipo();
    }

    // Devuelve una lista de todos los usuarios
    public List<Usuario> traerUsuarios() {
        return controlPersis.TraerUsuarios();
    }

    // Busca un cliente por su DNI
    public Cliente buscarClientePorDni(String dni) {
        return controlPersis.buscarCliente(dni);
    }

    // Edita un cliente existente
    public void editarCliente(Cliente c) throws Exception {
        this.controlPersis.editarCliente(c);
    }

    // Busca una mascota por su ID
    public Mascota buscarMascotaxId(int id) {
        return controlPersis.traerMascota(id);
    }

    // Crea una nueva cita para una mascota
    public void crearCita(Mascota m, Date fechaSeleccionada) {
        Cita c = new Cita();
        c.setFechaCita(fechaSeleccionada);
        c.setMascota(m);
        this.controlPersis.crearCitas(c);
    }

    // Crea una nueva historia clínica para una mascota
    public void crearHistoriaClinica(String text, String texto, Mascota m, Date fechaSeleccionada) {
        HistoriaClinica h = new HistoriaClinica();
        h.setDescripcion(texto);
        h.setFecha(fechaSeleccionada);
        h.setMascota(m);
        h.setMotivo(text);
        this.controlPersis.crearHistC(h);
    }

    // Busca un tipo de usuario por su nombre
    public TipoUsuario buscarTipoUsuarioPorTipo(String text) {
        return this.buscarTipo(text);
    }

    // Busca un tipo de usuario por su ID
    public TipoUsuario buscarTipoUsuarioPorId(int id) {
        return this.buscarTipoUsuarioPorId(id);
    }

    // Edita un tipo de usuario existente
    public void editarTipoUsuario(TipoUsuario tipoUsuario) throws Exception {
        this.controlPersis.editarTipoUsu(tipoUsuario);
    }

    // Elimina un tipo de usuario por su ID
    public void eliminarTipoUsuarioPorId(int id) throws NonexistentEntityException {
        this.controlPersis.eliminarTipo(id);
    }

    // Devuelve una lista de todos los tipos de usuario
    public List<TipoUsuario> listaTiposUsuario() {
        return this.controlPersis.TraerTipo();
    }

    // Elimina un usuario por su ID
    public void eliminarUsu(int id_Usu) throws NonexistentEntityException {
        this.controlPersis.eliminarUsu(id_Usu);
    }

    // Actualiza la información de una mascota
    public void actualizarMascota(Mascota mascotaSeleccionada) throws Exception {
        this.controlPersis.editarM(mascotaSeleccionada);
    }

    // Busca una cita por mascota y fecha
    public Cita buscarCitaPorMascotaYFecha(Mascota m, Date fechaSeleccionada) {
        return this.controlPersis.buscarCita(m, fechaSeleccionada);
    }

    // Elimina una cita existente
    public void eliminarCita(Cita citaExistente) throws NonexistentEntityException {
        this.controlPersis.eliminarCita1(citaExistente.getId());
    }

    // Verifica si existe una cita para una mascota en una fecha específica
    public Cita existeCitaParaMascotaEnFecha(Mascota m, Date fechaSeleccionada) {
        return this.controlPersis.traerCita(m, fechaSeleccionada);
    }

    // Agrega una nueva cita
    public void agregarCita(Cita nuevaCita) {
        this.controlPersis.crearCitas(nuevaCita);
    }

    // Actualiza una cita existente
    public void actualizarCita(Cita citaExistente) throws Exception {
        this.controlPersis.editarCita(citaExistente);
    }

    // Verifica si existen citas para una lista de mascotas
    public List<Cita> existeCitaParaMascota(List<Mascota> m) {
        return this.controlPersis.traerCita2(m);
    }

    // Verifica si existe una historia clínica para una mascota en una fecha específica
    public HistoriaClinica existeHistoriaClinicaParaMascotaEnFecha(Mascota m, Date fecha) {
        return this.controlPersis.buscarHistoriaClinicaPorMascotaYFecha(m, fecha);
    }

    // Agrega una nueva historia clínica
    public void agregarHistoriaClinica(HistoriaClinica historia) {
        controlPersis.crearHistoriaClinica(historia);
    }

    // Busca una historia clínica por mascota y fecha
    public HistoriaClinica buscarHistoriaClinicaPorMascotaYFecha(Mascota m, Date fecha) {
        return this.controlPersis.buscarHistoriaClinicaPorMascotaYFecha(m, fecha);
    }

    // Actualiza una historia clínica existente
    public void actualizarHistoriaClinica(HistoriaClinica historia) {
        controlPersis.actualizarHistoriaClinica(historia);
    }

    // Elimina una historia clínica existente
    public void eliminarHistoriaClinica(HistoriaClinica historia) {
        controlPersis.eliminarHistoriaClinica(historia);
    }

    // Devuelve una lista de historias clínicas por un criterio específico
    public List<HistoriaClinica> traerListaHistoriaC(String text) {
        return this.controlPersis.traerlistaH(text);
    }

    // Devuelve una lista de todas las historias clínicas
    public List<HistoriaClinica> traerListaHistoriaC2() {
        return this.controlPersis.traerlistaH2();
    }
}
    
        
    

   

