package almacen;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Informe  {

    private String id;
    private String nombre;
    private String contenido;
    private Date fechaCreacion;

    public Informe(String id, String nombre, String contenido, Date fechaCreacion) {
        this.id = id;
        this.nombre = nombre;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
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

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public void mostrarInformacion() {
        Locale locale = new Locale("es", "ES");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", locale);
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Creación: " + formatoFecha.format(fechaCreacion));
        System.out.println("Contenido: " + contenido);
    }
}
