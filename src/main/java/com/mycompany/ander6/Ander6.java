/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ander6;

import java.util.Scanner;

/**
 *
 * @author ItsqmetEstudiantes
 */
public class Ander6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        double precio;
        double descuento;
        System.out.println("Ingresar precio del producto");
        precio = teclado.nextDouble();
        
        if (precio >= 100){
            descuento = precio - (0.2 * precio);
            System.out.println("EL precio con descuento del 20% es: "+descuento);
        }else{
            descuento = precio - (0.1 * precio);
            System.out.println("El precio con descuento del 10% es "+descuento);
        }
        */
        // ejercicio 8
        char letra;
        System.out.println("Ingrese una letra");
        letra = teclado.nextLine().charAt(0);
        switch (letra){
            case 'a':
                System.out.println("Es una vocal");
                
                break;
                
            case 'e':
                System.out.println("Es una vocal ");
                
                break;
                
            case 'i':
                System.out.println("Es una vocal ");
                
                break;
                
            case 'o':
                System.out.println("Es una vocal ");
                
                break; 
                
            case 'u':
                System.out.println("Es una vocal ");
                
            default: 
                System.out.println("Es una consonante");
                    
        }
    }
}
