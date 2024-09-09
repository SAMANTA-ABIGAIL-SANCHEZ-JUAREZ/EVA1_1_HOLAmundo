/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_if;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA1_11_IF {

    public static void main(String[] args) {
       //CONDICIONAL
       //LOGICA BOOLEANA --> OPERACIONES DE VERDADERO Y FALSO
       //SOLICITAR LA EDAD EN AÑOS
      
       int edad;
        Scanner captu = new Scanner(System.in);
       System.out.println("CAPTURA DE LA EDAD:");
             edad = captu.nextInt();
             //DETERMINA SI ES UN ADULTO O NO
             //LAS OPERACIONES LOGICAS SOLO GENERAN COMO
             //RESULTADO UN VERDADERO UN FALSO
            // SI SON VARIAS INSTRUCCIONES LLAVES {}
             if(18>=edad) {//BLOQUE PARA EL VERDADERO
             System.out.println("ES ADULTO");
    }else{//BLOQUE PARA EL FALSO
     System.out.println("MAYOR DE EDAD!!");
}

    }
}