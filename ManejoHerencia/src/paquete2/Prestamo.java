/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete5.Persona;
/**
 *
 * @author reroes
 */
public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoMeses;
    protected String ciudad;
    
    
    public Prestamo(Persona beneficiario, int tiempoMeses, String ciudad) {
        this.beneficiario = beneficiario;
        this.tiempoMeses = tiempoMeses;
        this.ciudad = ciudad;
    }

    public void estabelcerBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public void estabelcerTiempoMeses(int tiempoMeses) {
        this.tiempoMeses = tiempoMeses;
    }

    public void estabelcerCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoMeses() {
        return tiempoMeses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }
    
}
