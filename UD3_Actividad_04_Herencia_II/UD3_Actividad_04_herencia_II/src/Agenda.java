public class Agenda extends Contacto {

private String buscaContacto;
private String listarContactos;
private String existeContacto;

public Agenda(String nombre, String telefono, String buscaContacto, String listarContactos, String existeContacto) {
    
    super(nombre, telefono);

    this.buscaContacto = buscaContacto;
    this.listarContactos = listarContactos;
    this.existeContacto = existeContacto;
}


}
