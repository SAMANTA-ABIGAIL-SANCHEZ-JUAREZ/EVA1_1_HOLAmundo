/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_pelicula;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA1_6_PELICULA {

    public static void main(String[] args) {
        String nombre;
        String genero;
        int duracion;
        String reparto;
        String clasificacion;
        
        Scanner captu;
        captu = new Scanner(System.in);
   
        nombre = captu.nextLine();
        System.out.println("INTRODUCE EL NOMBRE DE LA PELICULA");
          genero = captu.nextLine();
        System.out.println("INTRODUCE EL GENERO DE LA PELICULA");
         duracion = captu.nextInt();
        System.out.println("INTRODUCE LA DURACION DE LA PELICULA");
          reparto = captu.nextLine();
        System.out.println("INTRODUCE EL REPARTO");
         clasificacion = captu.nextLine();
         System.out.println("INTRODUCE LA CLASIFICACION");
         
          System.out.println("DATOS CAPTURADOS________________________");
           System.out.println(nombre);
           System.out.println(genero);
           System.out.println(duracion);
           System.out.println(reparto);
           System.out.println(clasificacion);
   
    }
}
