public class CuentaBancaria {



//Atributos
    private String iban;
    private String titular;
    private int saldo;
    
    
//Coleccion de Movimientos
    private Movimiento [] movimientos;
    private int nElementosActuales;
    
//Contructor 
    public CuentaBancaria(String iban, String titular, int saldo, int nMovimientos){
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new Movimiento[nMovimientos];
        this.nElementosActuales = 100;
            }
    
        public String getiban(){
            return this.iban;
            }
    
        public String gettitular(){
            return this.titular;
            }
    
        public int getsaldo(){
            return this.saldo;
            }
    
//Creaccion de Ingreso
    public boolean ingreso(Movimiento m1){
    
        boolean isAdd = false;
            if(m1 != null)
            {
            this.movimientos[nElementosActuales] = m1;
            this.nElementosActuales++;
            this.saldo += m1.getCantidad();
            isAdd =true;
            }
            return isAdd;
            }
//Creacion de Retirada
    public boolean retirada (Movimiento m1){

        boolean isRemoved = false;
            if (m1 !=null){
                    int index = -1;
                    for(int i = 0; i <this.movimientos.length; i++){
                        if(this.movimientos[i] !=null){
                            index =i;
                        }
                    }
            }
        return isRemoved;
    }

    public char[] infoCuenta() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'infoCuenta'");
    }

    public char[] infoMovimiento() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'infoMovimiento'");
    }
    
}
