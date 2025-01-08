public class Satelite extends Astro {
    private double distanciaPlaneta;
    private Planeta planeta;
    
    public Satelite(String nombre, double radioEcuatorial, double rotacion, 
                   double masa, double temperatura, double gravedad, 
                   double distanciaPlaneta, Planeta planeta) {
        super(nombre, radioEcuatorial, rotacion, masa, temperatura, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.planeta = planeta;
    }
}