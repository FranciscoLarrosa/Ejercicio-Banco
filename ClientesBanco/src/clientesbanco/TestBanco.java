package clientesbanco;

public class TestBanco {

    public static void main(String[] args) {
        
        //TODO HARCODEADO PORQUE TENIA FIACA...FIN =) <3
        Cliente c = new Cliente("Juan", "Perez", 22);
        Cliente d = new Cliente("Pedro", "Fernandes", 20);
        Cliente e = new Cliente("Marcos", "Chacon", 30);
        CuentaCorriente cuenta = new CuentaCorriente(c, 123);
        CuentaCorriente otraCuenta = new CuentaCorriente(d, 123, 10.000);
        CuentaAhorro ahorro = new CuentaAhorro(c, 123);
        CuentaAhorro ahorro2 = new CuentaAhorro(d, 123, 0.2);
        CuentaAhorro ahorro3 = new CuentaAhorro(e, 223, 100, 0.5);

        //IMPRIMIENDO DATOS DE CUENTAS CREADAS...
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());

        //COMPARANDO CUENTAS... 
        if (cuenta.equals(otraCuenta)) {
            System.out.println("Mismo numero de Cuentas");
        } else {
            System.out.println("No tienen el mismo numero de Cuenta");

        }

        if (ahorro.equals(ahorro2)) {
            System.out.println("Son iguales ");
        } else {
            System.out.println("No son iguales ");
        }

        if ((ahorro2.equals(ahorro3))) {
            System.out.println("Son iguales");

        } else {
            System.out.println("No son iguales");

        }

        if ((ahorro3.equals(ahorro))) { 
            System.out.println("Son iguales");

        } else {
            System.out.println("No son iguales");
        }
        //CALCULANDO EL INTERES DE UNA INSTANCIA DE CUENTA DE AHORRO...
        
        System.out.println(ahorro3.calcularInteres(0.155));
            //supongamos que lo hice bien...
    }

}
