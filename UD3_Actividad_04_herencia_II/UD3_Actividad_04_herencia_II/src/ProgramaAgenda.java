public class ProgramaAgenda {
    public static void main(String[] args) {
        // Crear una agenda
        Agenda agenda = new Agenda();
        
        // Pruebas de funcionalidad
        System.out.println("Añadiendo contactos...");
        System.out.println(agenda.añadirContacto(new Contacto("Juan", "123456789")));
        System.out.println(agenda.añadirContacto(new Contacto("María", "987654321")));
        System.out.println(agenda.añadirContacto(new Contacto("Juan", "111111111"))); // No debería añadirse
        
        System.out.println("\nListando contactos:");
        agenda.listarContactos();
        
        System.out.println("\nBuscando contacto 'María':");
        System.out.println("Posición: " + agenda.buscaContacto("María"));
        
        System.out.println("\nComprobando si existe 'Pedro':");
        System.out.println(agenda.existeContacto("Pedro"));
        
        System.out.println("\nEliminando contacto 'Juan':");
        System.out.println(agenda.eliminarContacto("Juan"));
        
        System.out.println("\nListado final de contactos:");
        agenda.listarContactos();
    }
}