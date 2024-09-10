/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_califas;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA1_12_CALIFAS {

    public static void main(String[] args) {
        //DECLARART VARIABLE PARA CALIFICACION
        //EVALUAR SI ACREDITAS (MAYOR O IGUAL 70)
        //O NO ACREDITAS (NA--> MENOR A 70)
         int calif;
        Scanner captu = new Scanner(System.in);
       System.out.println("Cual es la calificacion?");
       calif = captu.nextInt();
       if(calif > 70){ //if(calif>=70) e invertir los println 
           System.out.println("NA");
       }else{
        System.out.println( "ACREDITAS!!");
    }
}
}
