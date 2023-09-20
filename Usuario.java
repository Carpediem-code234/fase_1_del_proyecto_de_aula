package almacen;

public class Usuario {

    private String id;
    private String nombre;
    private String correoElectronico;
    private String password;
    private String nivelAcceso;

    public Usuario(String id, String nombre, String correoElectronico, String password, String nivelAcceso) {
        this.id=id;
        this.nombre=nombre;
        this.correoElectronico=correoElectronico;
        this.password=password;
        this.nivelAcceso=nivelAcceso;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setId(String id) {
        this.id=id;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico=correoElectronico;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso=nivelAcceso;
    }
    
    public void mostraUsuario(){
        System.out.println("Documento identidad: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Correo electronico: "+correoElectronico);
        System.out.println("Contraseña: "+password);
        
    }
    
}
