/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retonum1112;

/**
 *
 * @author user
 */
import java.util.*;
public class RetoNum1112 {

    public static void main(String[] args) {
        //  1) Escriba un programa en java que calcule la suma de todos los numeros que son multiplos de 3 o 5 y que sean menores que un numero dado N
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("hola!, Ingrese un valor numerico:  ");
        int resultado = scanner.nextInt();
        int valor  = 3;
        int suma = valor + 2;
        
        switch (resultado){
            case 1 :
                System.out.println("No hay valores para sumar!");
            case 2:
                System.out.println(" hay valores para sumar");
            case 3:
                System.out.println("Su valor es:" + valor);
            case 4:
                System.out.println("su valor es: " + valor);
            case 5:
                System.out.println("su valor es:" + valor + suma);
            case 6:
                System.out.println("su valor es: " +valor+ valor + suma);
            case 7:
                System.out.println("su valor es: " + valor + valor + suma);
            case 8:
                System.out.println("su valor es: " +valor + valor + suma);
                
            case 9:
                System.out.println("su valor es: " +valor + valor + valor+ suma);
                
        }
        
        
    }
}

























