public class Producto {

//Atributos
    private int codigo;
    private String nombre;
    private  int cantidad;
    private int precio;
    private static int contador = 0;

    public Producto(int cantidad, String nombre, int precio) {
        this.cantidad = cantidad;
        this.codigo = contador;
        this.contador ++;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public static int getContador() {
        return contador;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public static void setContador(int contador) {
        Producto.contador = contador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto");
        sb.append(", NOMBRE = ").append(nombre);
        sb.append(", CANTIDAD = ").append(cantidad);
        sb.append(", PRECIO = ").append(precio);
        sb.append(", CODIGO = ").append(codigo);
        return sb.toString();
    }

    

}
