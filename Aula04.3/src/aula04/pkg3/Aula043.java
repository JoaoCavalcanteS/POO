/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04.pkg3;

import java.util.Scanner;
public class Aula043 {

    public static void main(String[] args) {
        int []vetor = {10, 20, 0};
        int soma;
        soma = somarNumeros(vetor);

        System.out.println("A soma é:"+soma);
    }
    static int somarNumeros(int []vetor){
        int soma=0;
        for(int i=0; i <vetor.length; i++){
            soma += vetor[i];
        }
        return soma;
    }
   
}
