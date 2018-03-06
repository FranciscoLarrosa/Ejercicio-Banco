package clientesbanco;

public class CuentaCorriente {

    protected Cliente titular;
    protected int numeroCuenta;
    protected double saldo;

    public CuentaCorriente(Cliente cliente, int numCuenta, double saldo) {
        this.titular = cliente;
        this.numeroCuenta = numCuenta;
        this.saldo = saldo;
    }

    public CuentaCorriente(Cliente cli, int numC) {
        this.titular = cli;
        this.numeroCuenta = numC;
        this.saldo = 0;
    }

    public void setCliente(Cliente Titular) {
        this.titular = Titular;
    }

    public Cliente getClientes() {
        return this.titular;
    }

    public void setNumC(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getnumCuenta() {
        return this.numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public double depositar(double monto) {
        return this.saldo += monto;
    }

    public double extraer(double monto) {
        if (this.saldo < monto) {
            this.saldo = 0;
            return this.saldo;
        } else {
            return this.saldo -= monto;
        }
    }

    @Override
    public String toString() {
        return this.titular.toString() + "\n numero de cuenta : " + this.numeroCuenta + " Saldo : " + this.saldo;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || !(o instanceof CuentaCorriente)) {
            return false;
           }
        
        
        CuentaCorriente a = (CuentaCorriente) o;
        if (a.getnumCuenta() == this.numeroCuenta) {
            return true;

        } else {
            return false;
        }
    }

}
