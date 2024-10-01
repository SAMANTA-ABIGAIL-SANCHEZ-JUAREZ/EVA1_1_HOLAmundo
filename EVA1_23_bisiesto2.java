/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_23_bisiesto2;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA1_23_bisiesto2 {

    public static void main(String[] args) {
        int year;
        Scanner captu = new Scanner(System.in);
        year = captu.nextInt();
        captu.nextLine();
        
        
       int modulo4 = year % 4;
       if(modulo4 == 0){
           //No debe ser divicible entre 100
           int modulo100 = year % 100;
           if (modulo100 != 0){
               //Tiene que ser divicible entre 400
               int modulo400 = year % 400;
               if(modulo400 == 0){
                   System.out.println("Es año bisiesto");
               }else{
                   System.out.println("No es año bisiesto");
               }
           }else{
                System.out.println("No es año bisiesto");  
           }
       }else{
            System.out.println("No es año bisiesto");
       }
    }
}

    