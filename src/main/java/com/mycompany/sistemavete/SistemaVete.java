
package com.mycompany.sistemavete;

import com.mycompany.sistemavete.logica.Cliente;
import com.mycompany.sistemavete.logica.Controladora;
import com.mycompany.sistemavete.logica.Mascota;
import com.mycompany.sistemavete.logica.TipoUsuario;
import com.mycompany.sistemavete.logica.Usuario;
import com.mycompany.sistemavete.persistencia.exceptions.NonexistentEntityException;
import com.mycompany.sistemavete.views.FrmPrincipal;
import com.mycompany.sistemavete.views.FrmUsuario;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class SistemaVete {
    private Controladora ctrl = new Controladora();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //SistemaVete sistema = new SistemaVete();
       // sistema.ejecutar();
       FrmPrincipal frm = new FrmPrincipal();
       frm.setVisible(true);
       
    }

  /*  public void ejecutar() throws Exception {
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu Principal:");
            System.out.println("1. Filtrar Lista de Usuarios");
            System.out.println("2. Crear Tipo de Usuario");
            System.out.println("3. Gestionar Usuarios");
            System.out.println("4. Gestionar Mascotas");
            System.out.println("5. Gestionar Clientes");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (option) {
                case 1:
                    filtrarLista();
                    break;
                case 2:
                    crearTipoUsuario();
                    break;
                case 3:
                    gestionarUsuarios();
                    break;
                case 4:
                    gestionarMascotas();
                    break;
                case 5:
                    gestionarClientes();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }

    private void filtrarLista() {
        List<TipoUsuario> tipos = ctrl.traerTipo();
        if (tipos.isEmpty()) {
            System.out.println("No hay tipos de usuario para mostrar.");
        } else {
            System.out.println("Lista de Tipos de Usuario:");
            for (TipoUsuario tipo : tipos) {
                System.out.println(tipo.getNombre());
            }
        }
    }

    private void crearTipoUsuario() {
        System.out.print("Ingrese el nombre del tipo de usuario: ");
        String nombre = scanner.nextLine();

        if (!nombre.isEmpty()) {
            ctrl.guardarTipo(nombre);
            System.out.println("Se creó un Tipo Usuario");
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    private void gestionarUsuarios() throws Exception {
        String opcion;
        do {
            mostrarMenuUsuarios();
            opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    agregarUsuario();
                    break;
                case "2":
                    editarUsuario();
                    break;
                case "3":
                    buscarUsuario();
                    break;
                case "4":
                    mostrarUsuarios();
                    break;
                case "5":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (!opcion.equals("5"));
    }

    private void mostrarMenuUsuarios() {
        System.out.println("\nMenú de opciones de Usuario:");
        System.out.println("1. Agregar Usuario");
        System.out.println("2. Editar Usuario");
        System.out.println("3. Buscar Usuario");
        System.out.println("4. Mostrar Usuarios");
        System.out.println("5. Volver al Menú Principal");
        System.out.print("Selecciona una opción: ");
    }

    private void agregarUsuario() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Contraseña: ");
        String contra = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Nombre de Usuario: ");
        String nombreusu = scanner.nextLine();
        System.out.println("Tipos de Usuario disponibles: ");
        List<TipoUsuario> tipos = ctrl.traerTipo();
        for (TipoUsuario tipo : tipos) {
            System.out.println("- " + tipo.getNombre());
        }
        System.out.print("Tipo de Usuario: ");
        String tipo = scanner.nextLine();
        TipoUsuario tipousu = ctrl.buscarTipo(tipo);

        if (tipousu != null) {
            ctrl.guardarUsu(nombre, contra, apellido, nombreusu, tipousu);
            System.out.println("Usuario agregado exitosamente.");
        } else {
            System.out.println("Tipo de Usuario no encontrado.");
        }
    }

    private void editarUsuario() throws Exception {
        System.out.print("Nombre de Usuario a editar: ");
        String nombreusu = scanner.nextLine();
        Usuario u = ctrl.buscarUsu(nombreusu);

        if (u != null) {
            System.out.print("Nuevo Nombre (actual: " + u.getNombre() + "): ");
            String nombre = scanner.nextLine();
            System.out.print("Nueva Contraseña (actual: " + u.getContrasena() + "): ");
            String contra = scanner.nextLine();
            System.out.print("Nuevo Apellido (actual: " + u.getApellido() + "): ");
            String apellido = scanner.nextLine();
            System.out.println("Tipos de Usuario disponibles: ");
            List<TipoUsuario> tipos = ctrl.traerTipo();
            for (TipoUsuario tipo : tipos) {
                System.out.println("- " + tipo.getNombre());
            }
            System.out.print("Nuevo Tipo de Usuario (actual: " + u.getTipoDeUsuario().getNombre() + "): ");
            String tipo = scanner.nextLine();
            TipoUsuario tipousu = ctrl.buscarTipo(tipo);

            if (tipousu != null) {
                u.setNombre(nombre);
                u.setContrasena(contra);
                u.setApellido(apellido);
                u.setTipoDeUsuario(tipousu);
                ctrl.editarUsu(u);
                System.out.println("Usuario actualizado exitosamente.");
            } else {
                System.out.println("Tipo de Usuario no encontrado.");
            }
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private void buscarUsuario() {
        System.out.print("Nombre de Usuario a buscar: ");
        String nombreusu = scanner.nextLine();
        Usuario u = ctrl.buscarUsu(nombreusu);

        if (u != null) {
            System.out.println("Usuario encontrado:");
            System.out.println("Nombre: " + u.getNombre());
            System.out.println("Apellido: " + u.getApellido());
            System.out.println("Nombre de Usuario: " + u.getUsuario());
            System.out.println("Tipo de Usuario: " + u.getTipoDeUsuario().getNombre());
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    private void mostrarUsuarios() {
        List<Usuario> usuarios = ctrl.traerUsuarios();
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Usuarios registrados:");
            for (Usuario u : usuarios) {
                System.out.println("Nombre: " + u.getNombre() + ", Usuario: " + u.getUsuario() + ", Tipo: " + u.getTipoDeUsuario().getNombre());
            }
        }
    }

    private void gestionarClientes() throws Exception {
        String opcion;
        do {
            mostrarMenuClientes();
            opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    agregarCliente();
                    break;
                case "2":
                    editarCliente();
                    break;
                case "3":
                    buscarCliente();
                    break;
                case "4":
                    mostrarClientes();
                    break;
                case "5":
                    eliminarCliente();
                    break;
                case "6":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (!opcion.equals("6"));
    }

    private void mostrarMenuClientes() {
        System.out.println("\nMenú de opciones de Cliente:");
        System.out.println("1. Agregar Cliente");
        System.out.println("2. Editar Cliente");
        System.out.println("3. Buscar Cliente");
        System.out.println("4. Mostrar Clientes");
        System.out.println("5. Eliminar Clientes");
        System.out.println("6. Volver al Menú Principal");
        System.out.print("Selecciona una opción: ");
    }

    private void agregarCliente() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Localidad: ");
        String localidad = scanner.nextLine();
        System.out.print("Nacionalidad: ");
        String nacionalidad = scanner.nextLine();
        System.out.print("DNI: ");
        String dni = scanner.nextLine();
        
        if (!nombre.isEmpty() && !email.isEmpty() && !localidad.isEmpty()) {
            ctrl.guardarCliente(nombre, edad, email, dni, localidad, nacionalidad);
            System.out.println("Cliente agregado exitosamente.");
        } else {
            System.out.println("Los campos nombre, email y localidad no pueden estar vacíos.");
        }
    }

   private void editarCliente() {
    System.out.print("Ingrese el DNI del cliente: ");
    String dni = scanner.nextLine();
    
    if (dni != null && !dni.isEmpty()) {
        Cliente c = ctrl.buscarClientePorDni(dni);

        if (c != null) {
            System.out.print("Ingrese el nuevo nombre del cliente (actual: " + c.getNombre() + "): ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la nueva edad del cliente (actual: " + c.getEdad() + "): ");
            String edadStr = scanner.nextLine();
            System.out.print("Ingrese el nuevo email del cliente (actual: " + c.getEmail() + "): ");
            String email = scanner.nextLine();
            System.out.print("Ingrese la nueva localidad del cliente (actual: " + c.getLocalidad() + "): ");
            String localidad = scanner.nextLine();
            System.out.print("Ingrese la nueva nacionalidad del cliente (actual: " + c.getNacionalidad() + "): ");
            String nacionalidad = scanner.nextLine();

            try {
                int edad = Integer.parseInt(edadStr);
                c.setNombre(nombre);
                c.setEdad(edad);
                c.setEmail(email);
                c.setLocalidad(localidad);
                c.setNacionalidad(nacionalidad);

                ctrl.editarCliente(c);
                System.out.println("Cliente editado exitosamente.");
            } catch (NumberFormatException ex) {
                System.out.println("Error: La edad debe ser un número entero.");
            } catch (Exception ex) {
                Logger.getLogger(SistemaVete.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Ocurrió un error al editar el cliente.");
            }
        } else {
            System.out.println("No se encontró un cliente con el DNI proporcionado.");
        }
    } else {
        System.out.println("El DNI no puede estar vacío.");
    }
}


    private void buscarCliente() {
        System.out.print("Dni del cliente a buscar: ");
        String dni = scanner.nextLine();
        Cliente cliente = ctrl.obtenerClientePorDni(dni);
        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Apellido: " + cliente.getDni());
            System.out.println("Correo electrónico: " + cliente.getEmail());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    private void mostrarClientes() {
        List<Cliente> clientes = ctrl.listaClientes();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            System.out.println("Clientes registrados:");
            for (Cliente cliente : clientes) {
                System.out.println("Nombre: " + cliente.getNombre() + ", Dni: " + cliente.getDni() + ", Email: " + cliente.getEmail());
            }
        }
    }

    private void eliminarCliente() {
        System.out.print("Ingrese el DNI del cliente a eliminar: ");
        String dni = scanner.nextLine();

        Cliente clienteSeleccionado = ctrl.obtenerClientePorDni(dni);

        if (clienteSeleccionado != null) {
            List<Mascota> mascotas = ctrl.listaMascotas(clienteSeleccionado.getId_cliente());

            if (mascotas != null) {
                try {
                    ctrl.eliminarListaMascPorC(clienteSeleccionado.getId_cliente());
                    System.out.println("Mascotas asociadas al cliente eliminadas exitosamente.");
                } catch (NonexistentEntityException ex) {
                    System.out.println(ex.getMessage());
                }
            }

            try {
                ctrl.eliminarClientePorId(clienteSeleccionado.getId_cliente());
                System.out.println("Cliente eliminado exitosamente.");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("El cliente con el DNI proporcionado no existe.");
        }
    }

    private void gestionarMascotas() {
        boolean exit = false;

        while (!exit) {
            System.out.println("\nMenú de opciones de Mascotas:");
            System.out.println("1. Agregar Mascota");
            System.out.println("2. Buscar Mascota por Cliente");
            System.out.println("3. Listar Todas las Mascotas");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Selecciona una opción: ");

            String opcion = scanner.nextLine();
            switch (opcion) {
                case "1":
                    agregarMascota();
                    break;
                case "2":
                    buscarMascotaPorCliente();
                    break;
                case "3":
                    listarTodasLasMascotas();
                    break;
                case "4":
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        }
    }

    private void agregarMascota() {
        System.out.print("Nombre de la mascota: ");
        String nombre = scanner.nextLine();
        System.out.print("Raza de la mascota: ");
        String raza = scanner.nextLine();
        System.out.print("Edad de la mascota: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.print("DNI del cliente: ");
        String dni = scanner.nextLine();

        Cliente c = ctrl.obtenerClientePorDni(dni);

        if (c != null) {
            Mascota mascota = new Mascota(0, nombre, raza, edad, c);
            ctrl.agregarMascota(mascota);
            System.out.println("Mascota agregada exitosamente.");
        } else {
            System.out.println("No existe un cliente con ese DNI.");
        }
    }

    private void buscarMascotaPorCliente() {
        System.out.print("Ingrese el DNI del cliente para buscar mascotas: ");
        String dni = scanner.nextLine();

        Cliente c = ctrl.obtenerClientePorDni(dni);

        if (c != null) {
            List<Mascota> mascotas = ctrl.listaMascotasPorIdC(c.getId_cliente());
            if (mascotas.isEmpty()) {
                System.out.println("No hay mascotas asociadas a este cliente.");
            } else {
                System.out.println("Mascotas del cliente:");
                for (Mascota mascota : mascotas) {
                    System.out.println("Nombre: " + mascota.getNombre() + ", Raza: " + mascota.getRaza() + ", Edad: " + mascota.getEdad());
                }
            }
        } else {
            System.out.println("No se encontró ningún cliente con el DNI proporcionado.");
        }
    }

    private void listarTodasLasMascotas() {
        List<Mascota> mascotas = ctrl.listaMascotas();

        if (mascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas.");
        } else {
            System.out.println("Lista de Mascotas:");
            for (Mascota mascota : mascotas) {
                System.out.println("Nombre: " + mascota.getNombre() + ", Raza: " + mascota.getRaza() + ", Edad: " + mascota.getEdad() + ", Dueño: " + mascota.getUnDuenio().getNombre());
            }
        }
    }
*/
}
