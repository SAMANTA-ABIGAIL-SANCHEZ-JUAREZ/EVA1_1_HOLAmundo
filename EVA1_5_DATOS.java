/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_5_datos;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA1_5_DATOS {

    public static void main(String[] args) {
          // TODO code application logic here
        String marca;
        String modelo;
        int year;
        double precio;
        //Como se captura?
        //SCANNER(LECTOR)
        //Herramienta --> Clase: nos proporciona muchas herramientas
        Scanner captu;//declaramis la herramienta, previamente
                      //hay que importarla (hacer un impot)
        captu = new Scanner(System.in);//crear la herramienta
        
        //Hay queindicar al usuarios a capturar
        System.out.println("Introduce la marca del vehiculo:");
        //Capturamos --> una asignacion
        marca = captu.nextLine(); //les regresa todo el texto hasta cuando
        //se presiona le tecla "enter"
        
        System.out.println(marca);
        modelo = captu.nextLine();
        System.out.println("Introduce el a o:");
        year = captu.nextInt();
        System.out.println("Introduce el precio:");
        precio = captu.nextDouble();
        
        System.out.println("DATOS CAPTURADOS------------------");
            System.out.println(marca);
                System.out.println(modelo);
                    System.out.println(precio);
                        System.out.println(year);
    }
}
