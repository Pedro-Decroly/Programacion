import java.util.Map;

import java.util.HashMap;

public class Taller {

Map<String, Coche> coches = new HashMap<String, Coche>();

//Añadir Coche
    public void añadeElemento(String matricula, String marca, String color){

        Coche coche = new Coche(color, marca);

        coches.put(matricula, coche);

        System.out.println("Coche añadido correctamente.");

        if (coches.containsKey(matricula)){
            System.out.println("la matricula ya existe");
        }else{
        this.coches.put(matricula, coche);
        }
    }

//Eliminar Coche
    public void eliminaElemento (String matricula){

        if(coches.containsKey(matricula)){
            coches.remove(matricula);
            System.out.println("El coche ah sido eliminado");
        }else{
            System.out.println("La matricula no existe ");
        }
    }

//visualizaMatriculas 
    public void visualizaMatriculas(){

        System.out.println(coches.keySet());

    }

//visualizaCoches
    public void visualizaCoches(){

    }

//visualizaTaller
    public void visualizaTaller(){

    }
}
