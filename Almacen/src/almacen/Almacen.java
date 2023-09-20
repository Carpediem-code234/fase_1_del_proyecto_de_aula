/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen;


import java.util.Date;
/**
 *
 * @author Grupo C
 */


public class Almacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        

        // Crear dos objetos Producto
        Producto producto1 = new Producto("1", "Producto A", "Descripción del Producto A", "Categoría A", 10.99, 9);
        Producto producto2 = new Producto("2", "Producto B", "Descripción del Producto B", "Categoría B",  15.99, 30);

        System.out.println("producto ");
        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        System.out.println("------------------------------");
        System.out.println("  ");
        
        // Crear dos objetos Proveedor
        Proveedor proveedor1 = new Proveedor("23", "santiago","calle 30", 3023498 );
        Proveedor proveedor2 = new Proveedor("26", "camilo","kr 15", 3134957 );
                
        System.out.println("  ");
        System.out.println("proveedores : ");
        proveedor1.mostrarInformacion();
        proveedor2.mostrarInformacion();
        System.out.println("------------------------------");
        
        // Crear dos objetos usuarios
        
        Usuario usuario1 = new Usuario("1","juanito","juanito@gmail.co","1213gf","admin");
        Usuario usuario2 = new Usuario("2","andrea","anderea23@gmail.com","12e3124cvhj","A1" );
       
        System.out.println("  ");
        System.out.println("Información de los Usuarios:");
        usuario1.mostraUsuario();
        usuario2.mostraUsuario();
        System.out.println("------------------------------");
        
        // Crear dos objetos transaccion
                
        Transaccion transaccion1 = new Transaccion("26", "granos", 5, new Date());
        Transaccion transaccion2 = new Transaccion("27", "otros", 10, new Date());
        
        System.out.println("  ");
        System.out.println("Transaccion : ");
        transaccion1.mostrarInformacion();
        transaccion2.mostrarInformacion();
        System.out.println("------------------------------");
        
        // Crear dos objetos informe
        Informe informe1 = new Informe("1", "Informe de Ventas", "Informe mensual de ventas", new Date());
        Informe informe2 = new Informe("2", "Informe de Stock", "Informe semanal de inventario", new Date());
        
        System.out.println("  ");
        System.out.println("Informe 1: ");
        informe1.mostrarInformacion();
        System.out.println("------------------------------");
        System.out.println("Informe 2: ");
        informe2.mostrarInformacion();
        System.out.println("------------------------------");
        
        // Crear dos objetos copia de segurida 
        CopiaSeguridad copia1 = new CopiaSeguridad("1", "Copia de Seguridad 1",  new Date(), "Contenido de la copia 1");
        CopiaSeguridad copia2 = new CopiaSeguridad("2", "Copia de Seguridad 2", new Date(), "Contenido de la copia 2");

        System.out.println("  ");
        System.out.println("Copia de Seguridad 1: ");
        copia1.mostrarCopia();
        System.out.println("------------------------------");
        System.out.println("Copia de Seguridad 2: ");
        copia2.mostrarCopia();
        System.out.println("------------------------------");
        
        //Crear dos objeto registro de acceso
        // Crea un objeto Registro de Acceso para el inicio de sesión
        RegistroAcceso inicioSesion = new RegistroAcceso(usuario1, new Date(), "Inicio de Sesión");

        // Mostrar información del registro de acceso de inicio de sesión
        System.out.println("Registro de Acceso - Inicio de Sesión:");
        inicioSesion.mostrarInformacion();

        
        // Crea un objeto Registro de Acceso para el cierre de sesión
        RegistroAcceso cierreSesion = new RegistroAcceso(usuario2, new Date(), "Cierre de Sesión");

        // Mostrar información del registro de acceso de cierre de sesión
        System.out.println("\nRegistro de Acceso - Cierre de Sesión:");
        cierreSesion.mostrarInformacion();
        
        // Crear una alerta de stock bajo para el producto
        AlertaStockBajo alerta1 = new AlertaStockBajo(producto1, new Date());
        AlertaStockBajo alerta2 = new AlertaStockBajo(producto2, new Date());
        // Mostrar la información de la alerta
        System.out.println(" ");
        System.out.println("Mensaje 1 : ");
        alerta1.mostrarInformacion();
        System.out.println("Mensaje 2 : ");
        alerta2.mostrarInformacion();
        
        
    }

   
    
}