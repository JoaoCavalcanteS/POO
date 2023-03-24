/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author joao.vcsouza16
 */
import java.util.Scanner;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        somar(13,22);
        frase();
        exibirAsterisco();
        exibirMes(1);
        
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int n1 = pergunta.nextInt();
        
        System.out.println("Digite o segundo número:");
        int n2 = pergunta.nextInt();
         
        int maiorNumero = encontrarMax(n1, n2);
        System.out.println("O maior número:"+maiorNumero);
    }
    static void somar(int n1, int n2){
        int resultado;
        resultado = n1 + n2;
        System.out.println("A soma é:"+resultado);
    }
    static void frase(){
        System.out.println("\n Este é o meu primeiro método em JAVA");
        exibirAsterisco();
        System.out.println("\n Fiz uma chaada ao método exibirAsterisco()");
        exibirAsterisco();
        System.out.println("\n Fiz outra chamada!!");
    }
    ///somente print fica tudo em uma linha
    static void exibirAsterisco(){
        for(int i=0;i<=50;i++){
            System.out.print('*');
        }
    }
    static void exibirMes(int mes){
        switch(mes){
            case 1 :
                System.out.println("Janeiro");
            break;
             case 2 :
                System.out.println("Fevereiro");
            break;
            
        }
    }
    static void encontrarMax(int num1, int num2){
       int maior = 0;

       if(num1 > num2){
           maior = num1;
           return maior; 
       }   
    }
//    static void encontrarMax(int num1, int num2){
//        if(num1 > num2){
//            System.out.println("O número "+num1+" é maior");
//        }else{
//            if(num2>num1){
//                System.out.println("O número "+num2+" é maior");
//            }else{
//                System.out.println("Os números são iguais ou nulos");
//            }
//        }
//    }
}
