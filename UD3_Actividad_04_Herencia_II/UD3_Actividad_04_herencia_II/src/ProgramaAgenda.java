public class ProgramaAgenda extends Agenda{
    public static void main(String[] args) {
        
        // Creamos una agenda
        Agenda agenda = new Agenda(null, null, null, null, null);
        
        // Probamos añadir contactos
        System.out.println("Añadiendo contactos:");
        System.out.println(agenda.añadirContacto(new Contacto("Juan", "123456789")));
        System.out.println(agenda.añadirContacto(new Contacto("María", "987654321")));
        System.out.println(agenda.añadirContacto(new Contacto("Juan", "111111111"))); // Debe retornar false
        
        // Listamos los contactos
        System.out.println("\nListando contactos:");
        agenda.listarContactos(buscaContacto);
        
        // Buscamos un contacto
        System.out.println("\nBuscando contacto 'María':");
        System.out.println("Posición: " + agenda.buscaContacto("María"));
        
        // Verificamos si existe un contacto
        System.out.println("\nVerificando si existe 'Pedro':");
        System.out.println();
        
        // Eliminamos un contacto
        System.out.println("\nEliminando contacto 'Juan':");
        System.out.println(agenda.eliminarContacto("Juan"));
        
        // Listamos los contactos actualizados
        System.out.println("\nListando contactos actualizados:");
        agenda.listarContactos(buscaContacto);
    }

    public ProgramaAgenda(String nombre, String telefono, String buscaContacto, String listarContactos, String existeContacto) {
        super(nombre, telefono, buscaContacto, listarContactos, existeContacto);
    }
}

