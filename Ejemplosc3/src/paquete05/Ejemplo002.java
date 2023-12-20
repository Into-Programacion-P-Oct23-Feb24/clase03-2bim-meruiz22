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
        int suma=0;

        for (int fila = 0; fila < arreglo.length; fila++) {
            for (int col = 0; col < arreglo[fila].length; col++) {
                if (fila == col) {
                   suma=suma+arreglo[fila][col];
                }
            }
        }
        System.out.println(suma);
    }
}
