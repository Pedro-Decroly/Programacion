public class AvisarHaciendaException extends Exception {

    String titular;
    String iban;
    Movimiento movimiento;

    
    public void AvisarHaciendaExcepcion(String mensaje,String titular, String iban, Movimiento movimiento) {
        this.titular = titular;
        this.iban = iban;
        this.movimiento = movimiento;
    }
    
    public String getTitular() {
        return titular;
    }


    public String getIban() {
        return iban;
    }


    public Movimiento getMovimiento() {
        return movimiento;
    }

    
}