public class Trabajador {

    private int numeroSs;
    private String emailEmpresa;
    private int salario;
    private String departamento;

    public Trabajador(int numeroSs, String emailEmpresa, int salario, String departamento) {
        this.numeroSs = numeroSs;
        this.emailEmpresa = emailEmpresa;
        this.salario = salario;
        this.departamento = departamento;
    }

    public int getNumeroSs() {
        return numeroSs;
    }

    public void setNumeroSs(int numeroSs) {
        this.numeroSs = numeroSs;
    }

    public String getEmailEmpresa() {
        return emailEmpresa;
    }

    public void setEmailEmpresa(String emailEmpresa) {
        this.emailEmpresa = emailEmpresa;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String mostrarInfoTrabajador() {
        return "Trabajador{" +
                "numeroSs=" + numeroSs +
                ", emailEmpresa='" + emailEmpresa + '\'' +
                ", salario=" + salario +
                ", departamento='" + departamento + '\'' +
                '}';
    }

    public void remove(Trabajador trabajador) {
    }
}
