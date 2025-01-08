class Canario extends Aves {
    private String color;
    private boolean canta;
    
    public Canario(String nombrerel, int edad, String estado, String fechaNacimiento, 
                   String pico, boolean vuela, String color, boolean canta) {
        super(nombrerel, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }
    public void muestra() {
        System.out.println("Soy un canario y me llamo " + nombrerel);
    }
    @Override
    void volar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'volar'");
    }
    @Override
    void cumpleaños() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cumpleaños'");
    }
    @Override
    void morir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'morir'");
    }
    @Override
    void habla() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'habla'");
    }
}