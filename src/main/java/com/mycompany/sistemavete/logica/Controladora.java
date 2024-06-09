
package com.mycompany.sistemavete.logica;

import com.mycompany.sistemavete.persistencia.ControladoraPersistencia;
import com.mycompany.sistemavete.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class Controladora {
   
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
   
    
    public static ArrayList<Cliente> listaCliente = new ArrayList<>();
    public static ArrayList<Mascota> listaMascota = new ArrayList<>();
   
   
   

   
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
     
     
}
