/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_califas2;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA1_22_CALIFAS2 {

    public static void main(String[] args) {
            int califa;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cual es tu calificacion: ");
        califa = captu.nextInt();
        captu.nextLine();
        
        
        if(califa >=90 && califa <= 100){
            System.out.println("tu caificacion es A");
        }else if(califa >= 80 && califa <= 89){
            System.out.println("tu caificacion es B");
        }else if(califa >= 70 && califa <= 79){
            System.out.println("tu caificacion es C");
        }else if(califa >= 60 && califa <= 69){
            System.out.println("tu caificacion es D");
        }else if(califa >= 0 && califa <= 59){
            System.out.println("tu caificacion es F");
        }else{
             System.out.println("No es calificacion valida");

        }
    }
    
}