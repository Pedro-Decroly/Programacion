import java.util.ArrayList;

class Agenda {
    private ArrayList<Contacto> contactos;
    
    public Agenda() {
        contactos = new ArrayList<>();
    }
    
    public boolean añadirContacto(Contacto c) {
        if (!existeContacto(c.getNombre())) {
            contactos.add(c);
            return true;
        }
        return false;
    }
    
    public boolean eliminarContacto(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                contactos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public boolean existeContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos en la agenda");
        } else {
            System.out.println("Lista de contactos:");
            for (Contacto c : contactos) {
                System.out.println(c);
            }
        }
    }
    
    public int buscaContacto(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
}