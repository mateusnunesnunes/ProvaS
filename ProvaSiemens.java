/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provasiemens;
import java.util.Scanner;

/**
 *
 * @author mateusnunes
 */
public class ProvaSiemens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Descomentar linha 20 para rodar Fibonacci
        //fibonacci();
        //Descomentar linha 22 para rodar Contador de string
        //contarString();
        pesquisaLinear();
    }
    
    public static void pesquisaLinear(){
        System.out.println("Existe uma fila de militares, eles são nomeados por\n"
                + "números, ao todo são 9 militares e eles estão desorganizados em uma fila,\n"
                + "os superiores precisam realizar a chamada para verificar se o militar está presente,\n"
                + "e precisa saber sua posição na fila, para que ele possa organizar a fila mais tarde."
                + "");
        System.out.println("Fila de militares: 12,32,54,21,8,89,2,64,6");
        int[] vetor = {12,32,54,21,8,89,2,64,6};//número dos militares 
        System.out.println("Chamando militar 12");
        int resultado = PesquisaLinear.pesquisar(vetor,vetor.length,12);//realizando chamada
        System.out.println((resultado == -1) ? "Militar não encontrado" : "Militar está na posição "+resultado);
        //outra execucão
        System.out.println("Chamando militar 34");
        int resultado2 = PesquisaLinear.pesquisar(vetor,vetor.length,34);//realizando chamada
        System.out.println((resultado2 == -1) ? "Militar não encontrado" : "Militar está na posição "+resultado2);
        
    }
    
    
    
    public static void contarString(){
        Scanner scanner = new Scanner(System.in);
      	System.out.print("Escreva a string que você quer contar: ");
        String string = scanner.next();
        System.out.print("O tamanho de "+string+" é: " + CalculaTamanho.calculaTamanho(string)+"\n");
        
    }
    
    public static void fibonacci(){
        
        Scanner scanner = new Scanner(System.in);
      	System.out.print("Digite o número que deseja saber: ");
        int numero = scanner.nextInt();
        System.out.print("(O numero escolhido foi: "+numero+"): " + Fibonacci.fibonacci(numero)+"\n");
        
    }
    
}
