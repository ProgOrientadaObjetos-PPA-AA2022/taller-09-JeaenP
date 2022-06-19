/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete6;

/**
 *
 * @author jpvpv
 */
public class InstitucionEducativa {
    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }
}
