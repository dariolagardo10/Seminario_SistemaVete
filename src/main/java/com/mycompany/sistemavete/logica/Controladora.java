
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
    
     public void crearArt(String nom, Double p) {
        Articulo a = new Articulo();
        a.setNombre(nom);
        a.setPrecioActual(p);
        
        this.controlPersis.crearArticulo(a);
        
    }

    public List<Articulo> listaArticulo() {
        return this.controlPersis.traerArticulos();
    }

    public Usuario buscarUsuxId(int seleccionado) {
        return this.controlPersis.buscarUsuarioxId(seleccionado);
    }

    public Articulo buscarArtxId(int seleccionado) {
        return this.controlPersis.traerArticuloxId(seleccionado);
    }

    public void editarArt(Articulo a) {
        this.controlPersis.editarArticulo(a);
    }

    public void eliminarArt(Articulo u) {
        this.controlPersis.eliminarArt(u);
    }

    public Articulo buscarArtxNom(String text) {
        return this.controlPersis.traerArticuloxNom(text);
    }

 
     public Cliente obtenerClientePorDni(String dni){
        Cliente cliente=controlPersis.buscarCliente(dni);
        return cliente;
    }
     
     public  List<Cliente>listaClientes(){
     return controlPersis.traerClientes();
     }
     
     //Mascota
      public  List<Mascota>listaMascotasxNom(String nombre){
     return controlPersis.traerMascotasPorNom(nombre);
     }
    
public  List<Mascota>listaMascotas(){
     return controlPersis.traerMascotas();
     }
    public List<Mascota> listaMascotas(int id_cliente) {
        return controlPersis.traerMascotas();
    }
     public  List<Mascota>listaMascotasIdCli(int id){
     return controlPersis.traerMascotasPorIdCli(id);
     }
        
     
  public  void agregarMascota(Mascota mascota){
        Mascota m = new Mascota();
        m.setNombre(mascota.getNombre());
        m.setEdad(mascota.getEdad());
        m.setRaza(mascota.getRaza());
        m.setUnDuenio(mascota.getUnDuenio());
        controlPersis.guardarMascota(m);
       
    }

public void guardarMascota(String nombre, int edad, String email, String dni, String localidad, String nacionalidad) {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setNacionalidad(nacionalidad);
        cliente.setLocalidad(localidad);
        cliente.setEmail(email);
        cliente.setEdad(edad);
        cliente.setDni(dni);
        controlPersis.guardar(cliente);
    }   
   

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

    public void eliminarListaMascPorC(int id) throws NonexistentEntityException {
      controlPersis.eliminarListaMascPorIdCli(id);
      JOptionPane.showMessageDialog(null, "Mascotas eliminadas");
    }

    public void eliminarClientePorId(int id) {
      controlPersis.eliminarClientePorId(id);
    }

    public List<Mascota> listaMascotasPorIdC(int id) {
       return this.controlPersis.traerMascotasPorIdCli(id);
    }

    public void eliminarMascotaPorId(int id) {
    this.controlPersis.eliminarMascota(id);
    }
//Tipo Usuario
    public void guardarTipo(String nombre) {
        TipoUsuario tipo = new TipoUsuario();
        tipo.setNombre(nombre);
       this.controlPersis.crearTipo(tipo);
    }

    public List<TipoUsuario> traerTipo() {
       return controlPersis.TraerTipo();
    }

    public TipoUsuario buscarTipo(String tipo) {
      return controlPersis.buscarTipoxNOM(tipo);
    }

    public void guardarUsu(String nombre, String contra, String apellido, String tipo, TipoUsuario tipousu) {
     Usuario usu=new Usuario();
     usu.setUsuario(tipo);
     usu.setTipoDeUsuario(tipousu);
     usu.setNombre(nombre);
     usu.setContrasena(contra);
     usu.setApellido(apellido);
     controlPersis.guardarUsuario(usu);
    }

    public Usuario buscarUsu(String text) {
      
      return controlPersis.buscarUsuario(text);
      
     
    }

    public void editarUsu(Usuario u) throws Exception {
        controlPersis.editarUsu(u);
    }

    public List<TipoUsuario> mostrarTipo() {
      return  controlPersis.TraerTipo();
    }

    public List<Usuario> traerUsuarios() {
       return controlPersis.TraerUsuarios();
    }

    public Cliente buscarClientePorDni(String dni) {
       return controlPersis.buscarCliente(dni);
    }

    public void editarCliente(Cliente c) throws Exception {
       this.controlPersis.editarCliente(c);
    }

   

    public Mascota buscarMascotaxId(int id) {
       return controlPersis.traerMascota(id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void crearCita(Mascota m, Date fechaSeleccionada) {
       Cita c = new Cita();
       c.setFechaCita(fechaSeleccionada);
       c.setMascota(m);
       this.controlPersis.crearCitas(c);
    }

    public void crearHistoriaClinica(String text, String texto, Mascota m, Date fechaSeleccionada) {
        HistoriaClinica h = new HistoriaClinica();
        h.setDescripcion(texto);
        h.setFecha(fechaSeleccionada);
        h.setMascota(m);
        h.setMotivo(text);
        
        this.controlPersis.crearHistC(h);
    }

    public TipoUsuario buscarTipoUsuarioPorTipo(String text) {
        return this.buscarTipo(text);
    }

    public TipoUsuario buscarTipoUsuarioPorId(int id) {
        return this.buscarTipoUsuarioPorId(id);
    }

    public void editarTipoUsuario(TipoUsuario tipoUsuario) throws Exception {
        this.controlPersis.editarTipoUsu(tipoUsuario);
    }

    public void eliminarTipoUsuarioPorId(int id) throws NonexistentEntityException {
        this.controlPersis.eliminarTipo(id);
    }

    public List<TipoUsuario> listaTiposUsuario() {
        return this.controlPersis.TraerTipo();
    }

    public void eliminarUsu(int id_Usu) throws NonexistentEntityException {
        this.controlPersis.eliminarUsu(id_Usu);
    }

    public void actualizarMascota(Mascota mascotaSeleccionada) throws Exception {
       this.controlPersis.editarM(mascotaSeleccionada);
    }

    public Cita buscarCitaPorMascotaYFecha(Mascota m, Date fechaSeleccionada) {
        return this.controlPersis.buscarCita(m,fechaSeleccionada);
    }

    public void eliminarCita(Cita citaExistente) throws NonexistentEntityException {
        this.controlPersis.eliminarCita1(citaExistente.getId());
    }

    public Cita existeCitaParaMascotaEnFecha(Mascota m, Date fechaSeleccionada) {
      return this.controlPersis.traerCita(m,fechaSeleccionada);
    }

    public void agregarCita(Cita nuevaCita) {
        this.controlPersis.crearCitas(nuevaCita);
    }

    public void actualizarCita(Cita citaExistente) throws Exception {
        this.controlPersis.editarCita(citaExistente);
    }

    public List<Cita> existeCitaParaMascota(List<Mascota> m) {
         return this.controlPersis.traerCita2(m);
    }

   public HistoriaClinica existeHistoriaClinicaParaMascotaEnFecha(Mascota m, Date fecha) {
    // Implementa la lógica para verificar si ya existe una historia clínica para la mascota en la fecha dada
    return this.controlPersis.buscarHistoriaClinicaPorMascotaYFecha(m, fecha);
}

public void agregarHistoriaClinica(HistoriaClinica historia) {
    // Implementa la lógica para agregar una nueva historia clínica
    controlPersis.crearHistoriaClinica(historia);
}

public HistoriaClinica buscarHistoriaClinicaPorMascotaYFecha(Mascota m, Date fecha) {
    // Implementa la lógica para buscar la historia clínica por mascota y fecha en la base de datos
    return this.controlPersis.buscarHistoriaClinicaPorMascotaYFecha(m, fecha);
}

public void actualizarHistoriaClinica(HistoriaClinica historia) {
    // Implementa la lógica para actualizar la historia clínica en la base de datos
    controlPersis.actualizarHistoriaClinica(historia);
}

public void eliminarHistoriaClinica(HistoriaClinica historia) {
    // Implementa la lógica para eliminar la historia clínica en la base de datos
    controlPersis.eliminarHistoriaClinica(historia);
}

    public List<HistoriaClinica> traerListaHistoriaC(String text) {
        return this.controlPersis.traerlistaH(text);
    }

    public List<HistoriaClinica> traerListaHistoriaC2() {
        return this.controlPersis.traerlistaH2();
    }
   

   
}
    
        
    

   

