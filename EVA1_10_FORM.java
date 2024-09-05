/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_form;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA1_10_FORM {

    public static void main(String[] args) {
       double vo, a, t, d;
       Scanner captu = new Scanner (System.in);
       
       System.out.println("Velocidad inicial: ");
       vo = captu.nextDouble();
       System.out.println("Tiempo: ");
       t = captu.nextDouble();
       System.out.println("Aceleracion: ");
       a = captu.nextDouble();
       d = vo * t + (a * t * t)/2;
       System.out.println("Distancia = " + d);
    }
}
