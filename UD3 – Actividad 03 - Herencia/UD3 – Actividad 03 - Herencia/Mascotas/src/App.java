public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("adios");
        class Inventario {
            private Mascotas[] animales;
            private int numAnimales;
            private static final int MAX_ANIMALES = 100;
            
            public Inventario() {
                animales = new Mascotas[MAX_ANIMALES];
                numAnimales = 0;
            }
            
            // Mostrar lista de animales (tipo y nombre)
            public void mostrarListaAnimales() {
                for (int i = 0; i < numAnimales; i++) {
                    System.out.println(animales[i].getClass().getSimpleName() + ": " + 
                                     animales[i].getNombre());
                }
            }
            
// Mostrar datos de un animal específico
        public void mostrarAnimal(String nombre) {
            for (int i = 0; i < numAnimales; i++) {
                    if (animales[i].getNombre().equals(nombre)) {
                        System.out.println("Nombre: " + animales[i].getNombre());
                        System.out.println("Edad: " + animales[i].getEdad());
                        System.out.println("Estado: " + animales[i].getEstado());
                        System.out.println("Fecha de nacimiento: " + animales[i].getFechaNacimiento());
                        return;
                    }
                }
                System.out.println("Animal no encontrado");
            }
            
// Mostrar datos de todos los animales
            public void mostrarTodosAnimales() {
                for (int i = 0; i < numAnimales; i++) {
                    System.out.println("\nAnimal " + (i+1) + ":");
                    mostrarAnimal(animales[i].getNombre());
                }
            }
            
            // Insertar animal
            public void insertarAnimal(Mascotas animal) {
                if (numAnimales < MAX_ANIMALES) {
                    animales[numAnimales++] = animal;
                    System.out.println("Animal agregado correctamente");
                } else {
                    System.out.println("Inventario lleno");
                }
            }
            
            // Eliminar animal
            public void eliminarAnimal(String nombre) {
                for (int i = 0; i < numAnimales; i++) {
                    if (animales[i].getNombre().equals(nombre)) {
                        // Mover todos los elementos una posición hacia atrás
                        for (int j = i; j < numAnimales - 1; j++) {
                            animales[j] = animales[j + 1];
                        }
                        numAnimales--;
                        System.out.println("Animal eliminado correctamente");
                        return;
                    }
                }
                System.out.println("Animal no encontrado");
            }
            
            // Vaciar inventario
            public void vaciarInventario() {
                numAnimales = 0;
                System.out.println("Inventario vaciado");
            }
        }
    }
}

