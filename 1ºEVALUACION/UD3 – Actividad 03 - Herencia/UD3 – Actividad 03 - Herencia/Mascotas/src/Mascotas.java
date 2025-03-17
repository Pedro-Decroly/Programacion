public abstract class Mascotas {

    protected String nombrerel;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;
        
    public Mascotas(String nombrerel, int edad, String estado, String fechaNacimiento) {
        this.nombrerel = nombrerel;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
        }
        
    abstract void cumpleaños();
    abstract void morir();
    abstract void habla();
        
//Getters
    public String getNombre() { return nombrerel; }
    public int getEdad() { return edad; }
    public String getEstado() { return estado; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    }