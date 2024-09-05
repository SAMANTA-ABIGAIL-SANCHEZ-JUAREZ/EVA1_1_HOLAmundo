/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_8_operaciones2;

/**
 *
 * @author sanch
 */
public class EVA1_8_OPERACIONES2 {

    public static void main(String[] args) {
        String nombre = "Samanta Abigail";
        String apellido = "Sanchez Juarez";
        String nombreCom;
        //Cadenas de texto, la operacion se llama 
        //contatenacion --> unir cadenas de texto
        //El operqdor de contenacion es el +
        //cuando un simbolo tiene varias funciones
        //se le llaa sobrecarga (de operaciones)
        nombreCom = nombre + " " + apellido;
        System.out.println("El nombre es: "+nombre);
        System.out.println("El apellido es: "+apellido);
        System.out.println("El nombre completo es:"+nombreCom);
    }
}
