/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuprojecto;

/**
 *
 * @author usuario
 */
public class arreglos_arraylist {
     private String nombre;
    private int cuenta;
    private String comida;
    private String bebida;
    private int precio;
    private String apellido;

    public arreglos_arraylist() {
    }

    public arreglos_arraylist(String nombre, int cuenta, String comida, String bebida, int precio, String apellido) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.comida = comida;
        this.bebida = bebida;
        this.precio = precio;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    

}
