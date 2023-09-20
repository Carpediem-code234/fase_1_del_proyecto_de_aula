
package almacen;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CopiaSeguridad {

    private String id;
    private String nombre;
    private Date fechaCreacion;
    private String contenido;

    public CopiaSeguridad(String id, String nombre, Date fechaCreacion, String contenido) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.contenido = contenido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
    public void mostrarCopia() {
        Locale locale = new Locale("es", "ES");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", locale);
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Creación: " + formatoFecha.format(fechaCreacion));
        System.out.println("Contenido: " + contenido);
    }
    
    
}
