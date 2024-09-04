/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_7_operaciones;

/**
 *
 * @author sanch
 */
public class EVA1_7_OPERACIONES {

    public static void main(String[] args) {
        //OPERACIONES ARITMETICAS
        int X = 10;//declaracion de asignacion
        int y=5;
        int suma, resta, division, multiplicacion, potencia, raiz;
        int x = 0;
        
      //Suma y resta
      suma = x + y; //operador de suma + 1
      System.out.println("Suma de x +´y: ");
      System.out.println(suma);
      
      resta = x-y; //operador de diferencia -
      System.out.println("Resta de x - y");
      System.out.println(resta);
      
      //Multiplicacion *
      multiplicacion = x * y; //operdor de multiplicacion
      System.out.println("Multiplicacion de x * y");
      System.out.println(multiplicacion);
      
      //DIVICION--> EL MANEJO DE TIPO DE DATOS
      //Si dividimos, java da como resultado un entero
      x=7;
      y=3;
      division = x/ y;
      System.out.println("Division de x(7)/y(3)");
      System.out.println(division);
      
      double val1 = 11;
      double val2 = 3;
      double diviD;
      diviD = val1/val2;
      System.out.println("Division entre # decimales");
      System.out.println(diviD);
      
      //cambiamos los valores de x y
      
      
    }
}
