
package mainbanco;


public class CuentaCorriente {

    private Cliente titular;
    private int nroCuenta;
    private double saldo;
    private double plata;

    public CuentaCorriente(Cliente titular, int nroCuenta, double saldo) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Cliente titular, int nroCuenta) {
        this.titular = titular;
        this.nroCuenta = nroCuenta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double depositar(double monto) {
        plata = saldo + monto;
        return plata;
    }

    public double extraer(double monto) {
        plata = saldo - monto;
        return plata;
    }

    @Override
    public String toString() {
        return "nombre : " + titular.getNombre() + " apellido : " + titular.getApellido() + " edad : " + titular.getEdad();
    }
    
    public String compararCuentas(CuentaCorriente unaCuenta){
        if  (unaCuenta.getNroCuenta() == this.nroCuenta){
            return "Son iguales ";
        }
        else{
            return "no son iguales ";
        }
    }
}
