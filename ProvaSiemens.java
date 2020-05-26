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
        
        fibonacci();
           
    }
    
    
    
    public static void fibonacci(){
        
        Scanner scanner = new Scanner(System.in);
      	System.out.print("Digite o número que deseja saber: ");
        int numero = scanner.nextInt();
        System.out.print("(O numero escolhido foi: "+numero+"): " + Fibonacci.fibonacci(numero)+"\n");
        
    }
}
