public class ContactoPersona extends Contacto {
    
    String cumple;

    public ContactoPersona(String nombre, String telefono, String cumple) {
        super(nombre, telefono);
        this.cumple = cumple;
    }

    public String getCumple() {
        return cumple;
    }

    public String infoContacto(){
        String infoContacto = String.format("Nombre: %s, Telefono: %d, Cumpleaños: %s", getNombre(), telefono, cumple);
        return infoContacto;
    }
    
    

    
   
    

}