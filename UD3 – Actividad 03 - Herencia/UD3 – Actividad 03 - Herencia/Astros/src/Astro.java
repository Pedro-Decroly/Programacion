public abstract class Astro {

    protected String nombre;
    
    protected double radioEcuatorial;

    protected double rotacion;

    protected double masa;

    protected double temperatura;

    protected double gravedad;
    
    public Astro(String nombre, double radioEcuatorial, double rotacion,double masa, double temperatura, double gravedad) {

        this.nombre = nombre;

        this.radioEcuatorial = radioEcuatorial;

        this.rotacion = rotacion;

        this.masa = masa;

        this.temperatura = temperatura;

        this.gravedad = gravedad;
    }
    
    public void muestra() {

        System.out.println("Nombre: " + nombre);

        System.out.println("Radio: " + radioEcuatorial);

        System.out.println("Rotación: " + rotacion);

        System.out.println("Masa: " + masa);

        System.out.println("Temperatura: " + temperatura);

        System.out.println("Gravedad: " + gravedad);

    }
}
   


