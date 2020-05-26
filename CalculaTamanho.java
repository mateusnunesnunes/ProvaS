/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provasiemens;

/**
 *
 * @author mateusnunes
 */
public class CalculaTamanho {
    
    
    
    static int calculaTamanho(String string) {
        int contador = 0;
        String[] array = string.split("");
        
        for(String elemento:array){
            contador ++;
        }
        
        
        return contador;
    }
    
    
    
    
    
}
