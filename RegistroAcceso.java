package almacen;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class RegistroAcceso {

//    private String id;
    private Usuario usuario;
    private Date fecha;
    private String tipoAccion;

    public RegistroAcceso( Usuario usuario, Date fecha, String tipoAccion) {
//        this.id = id;
        this.usuario = usuario;
        this.fecha = fecha;
        this.tipoAccion = tipoAccion;
    }

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(String tipoAccion) {
        this.tipoAccion = tipoAccion;
    }
    
    public void mostrarInformacion() {
        Locale locale = new Locale("es", "ES");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm", locale);
        
        System.out.println("ID: " + usuario.getId());
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Fecha: " + formatoFecha.format(fecha));
        System.out.println("Tipo de Acción: " + tipoAccion);
    }
}
