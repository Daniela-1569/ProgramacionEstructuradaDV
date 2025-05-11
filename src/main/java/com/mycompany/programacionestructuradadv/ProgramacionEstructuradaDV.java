/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacionestructuradadv;

import java.util.Scanner;

/**
 *
 * @author PC01
 */
public class ProgramacionEstructuradaDV {
    
    public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in);

     
        System.out.println("promedio de 3 notas");
        
        System.out.println("Ingrese el valor de num_1");
        float num1 = scanner.nextFloat();
         System.out.println("Ingrese el valor de num_2");
        float num2 = scanner.nextFloat();
         System.out.println("Ingrese el valor de num_3");
        float num3 = scanner.nextFloat();
        float promedio =(num1+num2+num3)/3 ;
        
         System.out.println("El promedio es: " + promedio);
    }
}
