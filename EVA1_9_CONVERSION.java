/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_9_conversion;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA1_9_CONVERSION {

    public static void main(String[] args) {
        double far, cent;
      Scanner captu = new Scanner(System.in);
      System.out.println("Temperatura en grados fahrenheit: ");
      far = captu.nextDouble();
      cent = (far - 32) / 1.8;
      System.out.println( "°C = " + cent);
      //°F = °C * 1.8 +32
      //CONVERTIR AHORA DE CENTIGRADOS A FAHRENHEIT
      
      captu = new Scanner(System.in);
      System.out.println("De centigrados a fahrenheit: ");
      cent = captu.nextDouble();
      far = (cent*1.8+32);
       System.out.println( "°F = " + cent);
       //CONVERTIR AHORA DE CENTIGRADOS A KELVIN
       //Celsius a Kelvin: K = °C + 273.15
       
       System.out.println("centigrados a kelvin: ");
        cent= captu.nextDouble();
        double kel = cent + 273.15;
         System.out.println( "°C = " + kel);
       
    }
}
