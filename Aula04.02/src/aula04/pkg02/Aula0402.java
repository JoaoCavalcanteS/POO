/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04.pkg02;

import java.util.Scanner;
public class Aula0402 {

    public static void main(String[] args) {
        int vetor[] = new int [9];
        
        lerVetor(vetor);
    }
    static void lerVetor(int []vetor){
        Scanner pergunta = new Scanner(System.in);
        
         for(int i=0; i <vetor.length; i++){
            System.out.println("Digite o valor da posição:"+vetor[i]);
            vetor[i] = pergunta.nextInt();
         }
    }
}
