public class Planeta extends Astro {
    private double distanciaSol;
    
    public Planeta(String nombre, double radioEcuatorial, double rotacion, 
                  double masa, double temperatura, double gravedad, double distanciaSol) {
        super(nombre, radioEcuatorial, rotacion, masa, temperatura, gravedad);
        this.distanciaSol = distanciaSol;

    }

    public void agregarSatelite(Satelite luna) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregarSatelite'");
    }
    
}