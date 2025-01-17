class Agenda {
    private Contacto[] contactos;
    private int numContactos;
    private static final int MAX_CONTACTOS = 100;
    
    public Agenda() {
        contactos = new Contacto[MAX_CONTACTOS];
        numContactos = 0;
    }
    
    public boolean añadirContacto(Contacto c) {
        if (numContactos >= MAX_CONTACTOS) {
            return false;
        }
        
        if (!existeContacto(c.getNombre())) {
            contactos[numContactos] = c;
            numContactos++;
            return true;
        }
        return false;
    }
    
    public boolean eliminarContacto(String nombre) {
        int pos = buscaContacto(nombre);
        if (pos >= 0) {
            for (int i = pos; i < numContactos - 1; i++) {
                contactos[i] = contactos[i + 1];
            }
            contactos[numContactos - 1] = null;
            numContactos--;
            return true;
        }
        return false;
    }
    
    public boolean existeContacto(String nombre) {
        return buscaContacto(nombre) >= 0;
    }
    
    public void listarContactos() {
        if (numContactos == 0) {
            System.out.println("La agenda está vacía");
            return;
        }
        System.out.println("Lista de contactos:");
        for (int i = 0; i < numContactos; i++) {
            System.out.println(contactos[i]);
        }
    }
    
    public int buscaContacto(String nombre) {
        for (int i = 0; i < numContactos; i++) {
            if (contactos[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
}