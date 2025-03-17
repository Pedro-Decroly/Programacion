import java.util.HashMap;
import java.util.Map;

public class Agenda {

Map<String, Contacto> contacto = new HashMap<String,Contacto>();

//añadirContacto
    public void añadirContacto(String nombre,int telefono, String correo){

        Contacto contacto = new Contacto(nombre, telefono, correo);

        Contacto.put(nombre, telefono, correo);
        
        System.out.println("El contacto se a añadido correctamente.");

        if (contacto.containsKey(nombre)){
            System.out.println("Este contacto ya existe");
        }else{
            this.contacto.put(correo, contacto);
        }
    }
//Eliminar Coche
    public void eliminarContacto(String nombre,int telefono, String correo){

        if(contacto.containsKey(nombre)){
            contacto.remove(nombre);
            System.out.println("El contacto ah sido eliminado");
        }else{
            System.out.println("El nombre no esxiste");
        }
    }

//buscarContacto

    public void buscarContacto(String nombre,int telefono, String correo){

        if(contacto.containsKey(nombre)){
            System.out.println("Contacto encontado");
        }else{
            System.out.println("No existe");
        }

    }

//visualizarAgenda

    public void visualizarAgenda(){

        System.out.println(contacto.keySet());

    }

}
