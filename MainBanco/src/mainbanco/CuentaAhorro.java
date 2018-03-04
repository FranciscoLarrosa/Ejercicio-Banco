package mainbanco;

public class CuentaAhorro extends CuentaCorriente {

    private double interes = 2.5;

    public CuentaAhorro(Cliente titular, int nroCuenta, double saldo, double interes) {
        super(titular, nroCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(Cliente titular, int nroCuenta, double interes) {
        super(titular, nroCuenta);
        this.interes = interes;
        
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    public CuentaAhorro(Cliente titular,int nroCuenta){
        super(titular,nroCuenta);
    }
    
    public double calcularInteres(){
        return super.getSaldo()*this.interes;
    }
    
     public double calcularInteres(double unInteres){
        return super.getSaldo()*unInteres;
    }
    
}
