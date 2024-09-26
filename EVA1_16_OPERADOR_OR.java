/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA1_16_OPERADOR_OR {

    public static void main(String[] args) {
        int km, meses;
       Scanner captu = new Scanner(System.in);
        System.out.println("Cuanto kilometraje tiene el vehiculo?");
        km = captu.nextInt();
        captu.nextLine();
        System.out.println("Cuanto meses tiene el vehiculo");
        //Con una o dos comparaciones que se cumpla; el if es verdadero
        meses = captu.nextInt();
        captu.nextLine();
        if((km >= 5000) || (meses >= 6 )){
            System.out.println("Cambio de aceite");
        }else{
            System.out.println("vehiculo en buenas condiciones");
        }
    }
}
