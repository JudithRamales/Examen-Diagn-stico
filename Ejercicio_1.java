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
public class Ejercicio_1 {

 public void FormadeEquis(){
 
        // TODO code application logic here
    Scanner teclado= new Scanner (System.in);
    
    System.out.println("Introducir el tamaño de la matriz: ");
    int cantidad = teclado.nextInt();

    char [][]arreglo = new char[cantidad][cantidad]; //Especificar que se utilizara caracteres

    for ( int i=0; i < arreglo.length ;i++){ //Si se cumple la condición de tamaño de los renglones
          for (int j=0;  j<arreglo.length;j++){ //Si se cumple la condición del ciclo muestre el asterisco
                int x = i + 1;
                if((i==j)  ||  (j == (cantidad - x))){ //Si se cumple la condición de tamaño de las columnas
                    arreglo[i][j] = ('*'); //Se imprime astericos
                    System.out.print(arreglo[i][j] + " ");
                }
                else{
                   arreglo[i][j] = (' '); //Se imprime espacios en blanco
                   System.out.print(arreglo[i][j] + " ");
                }
          }  
           System.out.println();
        }
    }
    private static void escribirCaracter(char c, int cont){  //Se utiliza caracteres
    }
}