/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
import paquete2.Prestamo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;
/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private InstitucionEducativa institucionEducativa;
    private double valorCarrera;
    private double valorMensual;
    
    public PrestamoEducativo(
            String nivelEstudio, InstitucionEducativa institucionEducativa, double valorCarrera, Persona beneficiario, int tiempoMeses, String ciudad) {
        super(beneficiario, tiempoMeses, ciudad);
        this.nivelEstudio = nivelEstudio;
        this.institucionEducativa = institucionEducativa;
        this.valorCarrera = valorCarrera;
        
    }

    public void establecerCiudad(String ciudad) {
        this.ciudad = ciudad.toUpperCase();
    }
    
    public void establecerNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public void establecerInstitucionEducativa(InstitucionEducativa institucionEducativa) {
        this.institucionEducativa = institucionEducativa;
    }

    public void establecerValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
    }

    public void calcularValorMensual() {
        this.valorMensual = (this.valorCarrera / this.tiempoMeses) - ((this.valorCarrera / this.tiempoMeses) * 0.1);
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerInstitucionEducativa() {
        return institucionEducativa;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("PRESTAMO EDUCATIVO\n"
                + "Beneficiario: \n"
                + "\tNombre: %s\n"
                + "\tApellido: %s\n"
                + "\tUserNama: %s\n"
                + "Tiempo de prestamo: %d meses\n"
                + "Ciudad: %s\n"
                + "Nivel de estudio: %s\n"
                + "Centro educativo: \n"
                + "\tNombre: %s\n"
                + "\tSiglas: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor mensual del prestamo: %.2f\n",
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                beneficiario.obtenerUsername(),
                tiempoMeses,
                ciudad,
                nivelEstudio,
                institucionEducativa.getNombre(),
                institucionEducativa.getSiglas(),
                valorCarrera,
                valorMensual);
        return cadena;
    }
}
