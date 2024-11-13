public class CuentaBancaria {

//Atributos
    private String iban;
    private String titular;
    private String saldo;


//Coleccion de Movimientos
    private Movimiento [] movimientos;
    private int nElementosActuales;

//Contructor 
    public CuentaBancaria(String iban, String titular, String saldo, String moviento, int nMovimientos){
        this.iban = iban;
        this.titular = titular;
        this.saldo = saldo;
        this.movimientos = new Movimiento[nMovimientos];
        this.nElementosActuales = 0;
        }

        public String getiban(){
            return this.iban;
        }

        public String gettitular(){
            return this.titular;
        }

        public String getsaldo(){
            return this.saldo;
        }

//Creaccion de Movimiento
        public boolean crearMovimiento(Movimiento l1){

        boolean isAdd = false;
        if(l1 != null){
            this.movimientos[nElementosActuales] = l1;
            this.nElementosActuales++;
            isAdd =true;

        }
        return isAdd;
        }
//Metodo
        
}
