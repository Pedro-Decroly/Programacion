public class Producto {

    private String referencia;
    private String descripcion;
    private String tipo;
    private int cantidad;
    private double precio;
    private int descuento;
    private int IVA;
    private boolean AplicarDto;

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getIVA() {
        return IVA;
    }

    public void setIVA(int IVA) {
        this.IVA = IVA;
    }

    public boolean isAplicarDto() {
        return AplicarDto;
    }

    public void setAplicarDto(boolean aplicarDto) {
        AplicarDto = aplicarDto;
    }

    public Producto(boolean aplicarDto, int IVA, int descuento, double precio, int cantidad, String tipo, String descripcion, String referencia) {
        AplicarDto = aplicarDto;
        this.IVA = IVA;
        this.descuento = descuento;
        this.precio = precio;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.referencia = referencia;
    }

    public String toString() {
        return "Producto{" +
                "referencia='" + referencia + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", IVA=" + IVA +
                ", AplicarDto=" + AplicarDto +
                '}';
    }
}
