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
public class Cliente {

    public Cliente(String nombre,String apellido,int edad) {
        this.apellido = apellido;
        this.edad = edad;
        this.nombre =  nombre; 
    }
    private String nombre, apellido;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
