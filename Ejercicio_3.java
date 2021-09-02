/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos_diagnostico;

import java.util.Scanner;

/**
 *
 * @author Judith Ramales 
 */
public class Ejercicio_3 {
    
    public void Marco(){
    Scanner teclado= new Scanner(System.in);
        
        System.out.print("Introducir el tamaño de la matriz: ");
        int n= teclado.nextInt();
                 
        if(n>= 0){ 
            //Para formar la linea superior del marco de asteriscos 
            for(int i=0; i<n; i++){//Si se cumple la condición del ciclo muestre el asterisco  
               System.out.print("*"); // Se imprime astericos
        }
        System.out.println(); //Para salto de linea
        //Centro de la forma
        for(int i=0; i<n-2; i++){//Si "n" es el alto y tenemos echa la parte superior y la inferior, la parte de en medio debemos de restarle menos las 2 lineas
            System.out.print("*"); // Se imprime astericos
            for(int j=0; j<n-2; j++){ //Deben de mostrarse el espacio en blaco donde no hay asteriscos por ello se creaz otra variable  
            System.out.print(" "); // Se imprimen dos espacios en blanco 
            }
            System.out.println("*");//Se imprime la continucación de la linea de asterisco
             
        }
        //Para formar la linea inferior
        for(int i=0; i<n; i++){ //Si se cumple la condición del ciclo muestre el asterisco  
               System.out.print("*"); // Se imprime astericos
               
            }
        }
        System.out.println();
    }
    
}
