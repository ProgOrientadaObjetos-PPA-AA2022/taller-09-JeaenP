/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author jpvpv
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String username;
    
    public Persona(String nombre, String apellido, String username) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerUsername() {
        return username;
    }

    public void establecerUsername(String username) {
        this.username = username;
    }
}
