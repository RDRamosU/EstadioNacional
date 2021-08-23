/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Interfaces.Ingreso_Datos;

/**
 *
 * @author Usuario
 */
public class Cliente extends Ingreso_Datos {

    //Propiedades
    String Nombre;
    String Apellido;
    String Cedula;
    String Boletos;
    String Monto;

    public Cliente(String Nombre, String Apellido, String Cedula, String Boletos, String Monto) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Boletos = Boletos;
        this.Monto = Monto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getBoletos() {
        return Boletos;
    }

    public void setBoletos(String Boletos) {
        this.Boletos = Boletos;
    }

    public String getMonto() {
        return Monto;
    }

    public void setMonto(String Monto) {
        this.Monto = Monto;
    }

}
