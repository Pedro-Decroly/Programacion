import java.time.LocalDate;
import java.util.Iterator;

public class Empresa {
    private String nombre;
    private String cif;
    private LocalDate fechaFundacion;

    public Empresa(String nombre, String cif, LocalDate fechaFundacion) {
        this.nombre = nombre;
        this.cif = cif;
        this.fechaFundacion = fechaFundacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public LocalDate getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(LocalDate fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public String mostrarInfoEmpresa() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", cif='" + cif + '\'' +
                ", fechaFundacion=" + fechaFundacion +
                '}';
    }

    public boolean registrarTrabajador(Trabajador trabajador) throws TrabajadoresYaRegistradoException, InterruptedException {
        Trabajador[] tabajadoresRegistrados = new Trabajador[0];
        for (Trabajador t : tabajadoresRegistrados) {
            if (trabajador.getNumeroSs()) {
                throw new TrabajadoresYaRegistradoException("Ya existe un cliente registrado con el dni: " + trabajador.getNumeroSs() + ".");
            }
        }
        tabajadoresRegistrados.wait(trabajador.getSalario());
        return true;

    }

    public boolean registarGerente(GerenteDep gerente) throws GerenteYaRegistradoException, InterruptedException {
        GerenteDep gerenteRegistrados = new GerenteDep();
        for (GerenteDep t : gerenteRegistrados) {
            if (gerente.getNumeroTrabajadores()) {
                throw new GerenteYaRegistradoException("Ya existe un cliente registrado con el dni: " + gerente.getNumeroTelefonos() + ".");
            }
        }
        gerenteRegistrados.wait(gerente.getNumeroTrabajadores());
        return true;
    }

    public boolean registrarDirector(Director director) throws DirectorYaRegistradoException {
        Director directorRegistrado = new Director();
        for (Director d : directorRegistrado) {
            return false;
        }
        return false;
    }

    public void eliminarTrabajador(Trabajador trabajador) {
        trabajador.remove(trabajador);
    }

    public String mostrarInformacionTrabajadores() throws TrabajadoresYaRegistradoException {
        Iterator<Trabajador> itera = TrabajadoresYaRegistradoException.iterator();
        StringBuilder builder = new StringBuilder();
        while (itera.hasNext()) {
            Trabajador trabajador = itera.next();
            builder.append(trabajador.toString());
            builder.append('\n');

        }
        return builder.toString();
    }


}




