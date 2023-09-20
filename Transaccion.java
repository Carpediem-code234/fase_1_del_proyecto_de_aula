package almacen;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Transaccion {

    private String id;
    private String tipo;
    private int cantidad;
    private Date fecha;

    public Transaccion(String id, String tipo, int cantidad, Date fecha) {
        this.id=id;  
        this.tipo=tipo;
        this.cantidad=cantidad;
        this.fecha=fecha;
    }

    public String getId() {
        return  id;
    }

    public String getTipo() {
        return  tipo;
    }

    public int getCantidad() {
        return  cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void mostrarInformacion() {
        Locale locale = new Locale("es", "ES");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", locale);
        System.out.println("ID de Transacción: " + id);
        System.out.println("Tipo de Transacción: " + tipo);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Fecha de Transacción: " + formatoFecha.format(fecha));
    }
    
}
