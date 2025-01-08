class Loro extends Aves {
    private String origen;
    
    public Loro(String nombrerel, int edad, String estado, String fechaNacimiento, 
                String pico, boolean vuela, String origen) {
        super(nombrerel, edad, estado, fechaNacimiento, pico, vuela);
        this.origen = origen;
    }
    
    public void muestra() {
        System.out.println("Soy un loro y me llamo " + nombrerel);
    }
    
    public void saluda() {
        System.out.println("¡Hola, soy un loro!");
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