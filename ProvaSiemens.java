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
        fibonacci();
        //Descomentar linha 22 para rodar Contador de string
        //contarString();
        //Descomentar linha 23 para rodar Pesquisa Linear
        //pesquisaLinear();
        //Descomentar linha 26 para rodar Inversor Caracteres
        //inverter();
    }
    
    public static void inverter(){
        Scanner scanner = new Scanner(System.in);
      	System.out.print("Escreva a string que você quer inverter: ");
        String string = scanner.next();
        System.out.println(InverterString.inverter(string));
        
    }
    
    public static void pesquisaLinear(){
        //verificar qual é o termo de fibonacci, mandando seu resultado
        
        Scanner scanner = new Scanner(System.in);
      	System.out.print("Digite o termo que deseja saber através do resultado em fibonacci\nlembre-se mantemos em nossos dados até o termo 12: ");
        int numero = scanner.nextInt();        
        int[] vetor = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int resultado = PesquisaLinear.pesquisar(vetor,vetor.length,numero);//realizando chamada
        System.out.println((resultado == -1) ? "Número não se encontra nos registros" : "O resultado "+numero+" possui o termo "+resultado);
        
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
