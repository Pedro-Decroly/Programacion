class Contacto {
    private String nombre;
    private String telefono;
    
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Contacto) {
            Contacto otro = (Contacto) obj;
            return this.nombre.equals(otro.nombre);
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono;
    }
}