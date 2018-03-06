
package clientesbanco;


public class CuentaAhorro extends CuentaCorriente {

    private double interes = 2.5;


    public CuentaAhorro(Cliente unCliente, int numCuenta, double saldo, double interes) {
        super(unCliente,numCuenta,saldo);
        this.interes = interes;
    }

    public CuentaAhorro(Cliente unCliente, int numCuenta,  double interes) {
        super(unCliente,numCuenta,interes);
        this.interes = interes;
        super.saldo = 0;
    }

    public CuentaAhorro(Cliente unCliente, int numCuenta){
        super(unCliente,numCuenta);
    }

    public void setInteres(double inte) {
        this.interes = inte;
    }

    public double getInteres() {
        return this.interes;
    }

    public double calcularInteres(double uninteres) {
        return super.getsaldo() * (1 + uninteres);
    }

    @Override
    public String toString() {
        return super.toString() + "\n Interes : "+this.interes;                                          
    }

    
    
}
