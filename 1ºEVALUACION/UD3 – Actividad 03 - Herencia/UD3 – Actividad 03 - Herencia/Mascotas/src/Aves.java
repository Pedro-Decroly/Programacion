abstract class Aves extends Mascotas {
    protected String pico;
    protected boolean vuela;
    
    public Aves(String nombrerel, int edad, String estado, String fechaNacimiento, 
                String pico, boolean vuela) {
        super(nombrerel, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }
    
    abstract void volar();
}
