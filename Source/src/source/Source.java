/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

import java.util.Scanner;

/**
 *
 * @author reginamjr.14
 */
public class Source {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
    Scanner entrada = new Scanner (System.in);
    
        String clave = "12345";
        String usuario = "Regi";
        String miclave = "";
        String miusuario = "";
        int bandera = 0;
        int contador = 0;
        
        int numero1=0, numero2=0, numero3=0, menor=0;
        System.out.println("Ingrese el primer número  -> ");
        numero1=entrada.nextInt();
        System.out.println("Ingresa el segundo número  -> ");
        numero2=entrada.nextInt();
        System.out.println("Ingresa el tercer número  -> ");
        numero3=entrada.nextInt();
        
        menor=numero1;
        if(numero2<menor) {
            menor=numero2;
            if(numero3<menor) {
            menor=numero3;   
            
        }
         System.out.printf("Entre %d, %d y %d el número menor es %d\n",numero1,numero2,numero3,menor);
       
    }
  
        
    
}
    
 

}
    
    

