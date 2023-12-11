/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class exerciseTwo {
     public static void main(String[] args) {
    // Escribe un programa que valide una contraseña 
         Scanner scanner = new Scanner(System.in);
        while (true){
         System.out.println("Ingrese una clave de longitud de 8 caracteres: ");
         int contrasenya = scanner.nextInt();
         if (contrasenya > length(8)){
             System.out.println("Error!, no puedes tener mas de 8 caracteres!");
         }else {
             System.out.println("Error en syntaxis!");
         }

    
         
    System.out.println("Contraseña completada! :D");

}
     }

    private static int length(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
