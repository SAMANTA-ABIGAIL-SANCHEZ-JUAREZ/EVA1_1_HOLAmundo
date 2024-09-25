/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_rango;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA1_17_RANGO {

    public static void main(String[] args) {
        int calif;
        Scanner captu = new Scanner(System.in);
        System.out.println("Introduce una calificacion: ");
        calif = captu.nextInt();
        captu.nextLine();
        if(calif >= 0 || calif <= 100){
            System.out.println("calificacion valida");
        }else{
        
        System.out.println("calificacion no valida");
        
    }
}
}
