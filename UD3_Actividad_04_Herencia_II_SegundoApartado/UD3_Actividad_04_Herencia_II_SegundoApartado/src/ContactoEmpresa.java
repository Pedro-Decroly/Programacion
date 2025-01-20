public class ContactoEmpresa extends Contacto{

    String web;

    public ContactoEmpresa(String nombre, String telefono, String web) {
        super(nombre, telefono);
        this.web = web;
    }

    public String getWeb() {
        return web;
    }

    public String infoContacto(){
        String infoContactoEmpresa = String.format("Nombre: %s, Telefono: %d, Cumpleaños: %s", getNombre(), telefono, web);
        return infoContactoEmpresa;
    }
    
    
}
