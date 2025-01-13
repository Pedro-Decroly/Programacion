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

    public void buscaContacto(String buscaContacto) {
        this.buscaContacto = buscaContacto;
    }

    public void listarContactos(String listarContactos) {
        this.listarContactos = listarContactos;
    }

    public void existeContacto(String existeContacto) {
        this.existeContacto = existeContacto;
    }


}
