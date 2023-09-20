package almacen;

public class Producto {

    private String id;
    private String nombre;
    private String descripcion;
    private String categoria;
    private double precio;
    private int cantidadStock;

    public Producto(String id, String nombre, String descripcion, String categoria, double precio, int cantidadStock) {
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.categoria=categoria;
        this.precio=precio;
        this.cantidadStock=cantidadStock;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadStock;
    }

    public void setId(String id) {
        this.id=id;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    }

    public void setCategoria(String categoria) {
        this.categoria=categoria;
    }

    public void setPrecio(double precio) {
        this.precio=precio;
    }

    public void setCantidadEnStock(int cantidadStock) {
        this.cantidadStock=cantidadStock;
    }
    
    // Método para mostrar información del producto
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad en Stock: " + cantidadStock);
        
    }
}
