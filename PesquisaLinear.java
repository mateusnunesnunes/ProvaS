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
public class PesquisaLinear {
    static int pesquisar(int[] vetorInteiros,int tamanhoVetor,int chave) {
        if(vetorInteiros.length != 0){         
            for(int index = 0;index < vetorInteiros.length;index++){
                if(vetorInteiros[index] == chave){
                    return index;
                }
            }
        }
        else{
            System.out.println("Vetor vazio");
        }
        return -1;
    }
}
