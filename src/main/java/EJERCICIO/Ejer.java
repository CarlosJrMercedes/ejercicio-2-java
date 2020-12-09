/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJERCICIO;

/**
 *
 * @author BAKIJR
 */
public class Ejer {
    
    public static void main(String[] args) {
        
        
        int ini = 1;
        int fin = 0;
        int result = 0;
        int cont = 1;
        for (int i = 0; i < 100; i++) {
            
            result = ini + fin;
            fin = ini;
            ini = result;
            
            if (cont == 47) {
                System.out.println("El número de la posición " + cont + " es : " + result);
                break;
            }
            
            cont++;
        }
        
        
        
        
    }
    
    
    
}
