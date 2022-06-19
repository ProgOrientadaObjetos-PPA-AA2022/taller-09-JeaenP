/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;
import paquete2.Prestamo;
import paquete5.Persona;
/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo{
    private String tipo;
    private String marca;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensual;

    public PrestamoAutomovil(String tipo, String marca, Persona garante1, double valorAutomovil, Persona beneficiario, int tiempoMeses, String ciudad) {
        super(beneficiario, tiempoMeses, ciudad);
        this.tipo = tipo;
        this.marca = marca;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
       
    }

    public void establecerCiudad(String ciudad) {
        this.ciudad = ciudad.toLowerCase();
    }
    
    public void establecerTipo(String tipo) {
        this.tipo = tipo;
    }

    public void establecerMarca(String marca) {
        this.marca = marca;
    }

    public void establecerGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public void establecerValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil ;
    }
    
    public void calcularValorMensual() {
        this.valorMensual = this.valorAutomovil/ this.tiempoMeses;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerMarca() {
        return marca;
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    
    
    @Override
    public String toString() {
        String cadena = String.format("PRESTAMO AUTOMOVIL\n"
                + "Beneficiario:\n"
                + "\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "\tUserNama: %s\n"
                + "Tiempo de prestamo: %d meses\n"
                + "Ciudad: %s\n"
                + "Tipo de automovil: %s\n"
                + "Marca del automovil: %s\n"
                + "Garante 1:\n"
                + "\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "\tUserNama: %s\n"
                + "Valor del automovil: %.2f\n"
                + "Valor mensual del prestamo: %.2f\n",
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                beneficiario.obtenerUsername(),
                tiempoMeses,
                ciudad,
                tipo,
                marca,
                garante1.obtenerNombre(),
                garante1.obtenerApellido(),
                garante1.obtenerUsername(),
                valorAutomovil,
                valorMensual);
        return cadena;
    }
}
