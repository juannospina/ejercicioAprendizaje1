/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package ejercicioaprendizaje1;

import java.util.Scanner;

public class EjercicioAprendizaje1 {
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Ingresa otro número: ");
        num2 = entrada.nextInt();
        
        System.out.println("La suma de ambos números es de: "+(num1+num2));
        
    }
    
}
