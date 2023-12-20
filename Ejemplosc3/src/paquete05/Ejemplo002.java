/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int[][] arreglo = {{10, 41, 40}, {1, 2, 3}, {1, 12, 4}};
        // Declaramos el arreglo bidimensinal y le damos valores 
        int suma = 0;
        // Declaramos la variable y la inicializamos en cero
        for (int fila = 0; fila < arreglo.length; fila++) {
            for (int col = 0; col < arreglo[fila].length; col++) {
                /* Usamos un ciclo repetitivo  para ir recorriendo las 
                posicioones del arreglo 
                 */
                if (fila == col) {
                    // Condicion de si fila es igual a columna
                    suma = suma + arreglo[fila][col];
                    // Se suma los valores de las posiciones deacuerdo a la condicion    
                }
            }
        }
        System.out.println(suma);
        // Se prsenta la suma en pantalla de los valores 
    }/* Primero declaramos las variables arreglo y suma le dimos valores luego 
    usamos un ciclo repetitivo para ir recorriendo loas posicionesdel arreglo y 
    utilizamos una condicion de si fila era igual a columna se sumaban los 
    valores de dichas posiciones y por ultimo se presenta la suma 
    
    */
}
