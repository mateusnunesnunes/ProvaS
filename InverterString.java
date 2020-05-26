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
public class InverterString {
    static String inverter(String str) {
        String [] string = str.split("");//realizando as operacoes usando apenas uma estrutura
        int tamanho = (string.length % 2 == 0)?string.length/2 : string.length;
        for(int index = 0; index < tamanho;index++){
            int indexReverso = string.length - 1 - index;
            String elemento =  string[index];
            String elementoReverso = string[indexReverso];
            if(index == indexReverso){
                return String.join("", string);
            }
            string[indexReverso] = elemento;
            string[index] = elementoReverso;
        }
        return String.join("", string);
    }
}
