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
        contarString();
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
