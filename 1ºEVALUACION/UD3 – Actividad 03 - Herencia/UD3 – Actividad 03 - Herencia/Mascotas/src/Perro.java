 class Perro extends Mascotas {
    private String raza;
    private int pulgas;
    
    public Perro(String nombrerel, int edad, String estado, String fechaNacimiento, 
                 String raza, int pulgas) {
        super(nombrerel, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
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

