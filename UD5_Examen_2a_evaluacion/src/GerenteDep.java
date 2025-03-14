public class GerenteDep {

    private String numeroTrabajadores;
    private int numeroTelefonos;

    public GerenteDep() {
        this.numeroTrabajadores = numeroTrabajadores;
        this.numeroTelefonos = numeroTelefonos;
    }

    public int getNumeroTelefonos() {
        return numeroTelefonos;
    }

    public void setNumeroTelefonos(int numeroTelefonos) {
        this.numeroTelefonos = numeroTelefonos;
    }

    public boolean getNumeroTrabajadores() {
        return numeroTrabajadores;
    }

    public void setNumeroTrabajadores(String numeroTrabajadores) {
        this.numeroTrabajadores = numeroTrabajadores;
    }

    public String mostrarInfoDepartamento() {
        return "GerenteDep{" +
                "numeroTrabajadores='" + numeroTrabajadores + '\'' +
                ", numeroTelefonos=" + numeroTelefonos +
                '}';
    }
    public <Departamentos> void convocarReunionDepartamentos(Departamentos departamentos) {
        departamentosReunion.add(departamentos);
    }
}
