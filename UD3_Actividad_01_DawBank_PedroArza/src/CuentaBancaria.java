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
    public boolean crearMovimiento(Movimiento m1){

        boolean isAdd = false;
        if(m1 != null)
        {
        this.movimientos[nElementosActuales] = m1;
        this.nElementosActuales++;
        isAdd =true;
        }
        return isAdd;
        }
//Metodo
        
    public String infoMovimiento(){

        String info = String.format("Movimiento - iban %s, titular %s, saldo %s", this.iban, this.titular, this.saldo);
            return info;

    String infoColeccion(){
        String result ="";
        if (this.nElementosActuales>0){
            for(Movimiento 1 : this.movimientos){
                if(1 !=null){
                    result += 1.infoMovimiento()+ "/n";
                }
            }
        }
        else{
            result= "no hay ningun movimiento";
        }
        return result;
    }

    }

}