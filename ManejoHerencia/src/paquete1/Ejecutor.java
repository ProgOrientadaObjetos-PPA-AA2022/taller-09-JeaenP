/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int op; String cadena = "";
        System.out.println("Elija una opcion");
        System.out.println("1) Ingresar un prestamo para automovil");
        System.out.println("2) Ingresar un prestamo Educativo");
        System.out.println("0) Salir");
        op = sc.nextInt();
        sc.nextLine();
        while (op != 0) {
            System.out.println("Ingreese el nombre del beneficiario");
            String nombreBeneficiario = sc.nextLine();
            System.out.println("Ingrese los apellidos del beneficiario");
            String apellidosBeneficiario = sc.nextLine();
            System.out.println("Ingrese el username del beneficiario");
            String username = sc.nextLine();
            System.out.println("Ingrese el timepo en meses del prestamo");
            int tiempo = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese la ciudad del prestamo");
            String ciudad = sc.nextLine();
            Persona beneficiario = new Persona(nombreBeneficiario, apellidosBeneficiario, username);
            if (op == 1) {
                System.out.println("Ingrese el tipo de automovil");
                String tipo = sc.nextLine();
                System.out.println("Ingrese la marca del automovil");
                String marca = sc.nextLine();
                System.out.println("Ingrese el nombre del garante");
                String nombreGarante = sc.nextLine();
                System.out.println("Ingrese los apellidos del garante");
                String apellidosGarante = sc.nextLine();
                System.out.println("Ingrese el username del garante");
                String userGarante = sc.nextLine();
                System.out.println("Ingrese el valor del automovil");
                double valor = sc.nextDouble();
                sc.nextLine();
                Persona garante = new Persona(nombreGarante, apellidosGarante, userGarante);
                PrestamoAutomovil p = new PrestamoAutomovil(tipo, marca, garante, valor, beneficiario, tiempo, ciudad);
                p.calcularValorMensual();
                cadena = String.format("%s%s%s\n", cadena, p, "-------------------------------------");
                
            } else {
                System.out.println("Ingrese el nivel de estudio");
                String nivel = sc.nextLine();
                System.out.println("Ingrese el nombre del centro educativo");
                String nombreCentro = sc.nextLine();
                System.out.println("Ingrese las siglas del centro educativo");
                String siglas = sc.nextLine();
                System.out.println("Ingrese el valor de la carrera");
                double valorCarrera = sc.nextDouble();
                sc.nextLine();
                InstitucionEducativa i = new InstitucionEducativa(nombreCentro, siglas);
                PrestamoEducativo pe = new PrestamoEducativo(nivel, i, valorCarrera, beneficiario, tiempo, ciudad);
                pe.calcularValorMensual();
                cadena = String.format("%s%s%s\n", cadena, pe, "-------------------------------------");
            }
            System.out.println("Desea ingresar otro prestamo?");
            System.out.println("1) si");
            System.out.println("0) no");
            op = sc.nextInt();
            sc.nextLine();
            if (op != 1) {
                break;
            }
            System.out.println("Elija una opcion");
            System.out.println("1) Ingresar un prestamo para automovil");
            System.out.println("2) Ingresar un prestamo Educativo");
            System.out.println("0) Salir");
            op = sc.nextInt();
            sc.nextLine();
        }
        System.out.println(cadena);
    }
}
