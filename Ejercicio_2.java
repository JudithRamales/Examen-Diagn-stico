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
public class Ejercicio_2 {
    
    public void MitadDeMatriz(){
     Scanner teclado= new Scanner (System.in);
    
        System.out.print("Introducir el tamaño de la matriz: ");
        int numFilas = teclado.nextInt();
         
        for(int j = 0, i=numFilas; j<=numFilas; j++, i--){ //Si se cumple la función del aumento y descenso del asterisco de la matriz, repetir el ciclo 
            escribirCaracter('*', i); //Especificar que debe de imprimir asterisco
            escribirCaracter(' ', j); //Especificar que debe de dejar espacios en blanco donde no aparezca el asterisco
            System.out.println();
        }
        teclado.close();
    }
     private static void escribirCaracter(char c, int cont){
    
        for(int j = 0; j<cont; j++){
            System.out.print(c); //Ejecutar las acciones ya indicadas al programar para los caracteres  
        }
    }
}
    
    

