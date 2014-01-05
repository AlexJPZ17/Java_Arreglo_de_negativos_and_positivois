/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arreglo_de_negativos_and_positivois;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Arreglo_de_negativos_and_positivois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Método Scanner
        Scanner Entrada = new Scanner(System.in);
        //Declaramos las variables de tipo entero
       //Arreglo de 10 posiciones
       //Arrays unidimensional
      int Arreglo[] = new int [10];
      int Suma_positivos = 0, Suma_negativos = 0;
      
      System.out.println("Ingrese los números");
      //Ciclo for que recorre el arreglo
      //length nos va a calcular el número de elementos del array
        for (int i = 0; i < Arreglo.length; i++) {
            //Mensaje que muestra la posición del ciclo for
            System.out.println("Número"+ (i + 1) + ":");
            //Método que obtiene los datos ingresados 
            //y lo almacena en el arreglo
            Arreglo[i]= Entrada.nextInt();
            //Condición que evalúa el arreglo
            if (Arreglo[i]>0) {
                //Operador de asignación += el significado 
                //Suma_Positivos = Suma_Positivos + Arreglo
                Suma_positivos+=Arreglo[i];
            }else{
                Suma_negativos+=Arreglo[i];
            }
        }
        System.out.println("La suma de los positivos es: " + Suma_positivos);
        System.out.println("La suma de los negativos es: " + Suma_negativos);
    }
    
}
