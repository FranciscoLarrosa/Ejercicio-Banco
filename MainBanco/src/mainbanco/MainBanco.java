/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainbanco;

/**
 *
 * @author Satoru
 */
public class MainBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente p1 = new Cliente("pedro","suares",20);
        Cliente p2 = new Cliente("fran","peres",30);
        CuentaCorriente a = new CuentaCorriente(p1, 22);
        CuentaCorriente b = new CuentaCorriente(p2, 22, 1000);
        CuentaAhorro c = new CuentaAhorro(p1, 22);
        CuentaAhorro d =  new CuentaAhorro(p2, 22, 1.10);
        CuentaAhorro f =  new CuentaAhorro(p2, 22, 1000, 1.20);
        System.out.println(a.toString());
        System.out.println(b.toString());
        a.compararCuentas(b);
    }
    
}
