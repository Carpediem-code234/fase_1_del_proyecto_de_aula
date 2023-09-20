package almacen;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class AlertaStockBajo {

//    private String id;
    private Producto producto;
    private String mensaje;
    private Date fecha;

    public AlertaStockBajo( Producto producto, Date fecha) {
//        this.id = id;
        this.producto = producto;
        this.fecha = fecha;
        // Determinar el mensaje según la cantidad de stock
         if (producto.getCantidadEnStock() == 10) {
            this.mensaje = "Stock bajo";
        } else if(producto.getCantidadEnStock()<10) {
            this.mensaje = "Stock muy bajo";
        }else{
            this.mensaje= "Stock suficiente";
        }
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        if (producto.getCantidadEnStock() == 10) {
            this.mensaje = "Stock bajo";
        } else if(producto.getCantidadEnStock()<10) {
            this.mensaje = "Stock muy bajo";
        }
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void mostrarInformacion() {
        Locale locale = new Locale("es", "ES");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", locale);
        System.out.println("ID del Producto: " + producto.getId());
        System.out.println("Nombre del Producto: " + producto.getNombre());
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Fecha: " + formatoFecha.format(fecha) );
    }
   
}
