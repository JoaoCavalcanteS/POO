/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04.pkg4;

public class Aula044 {


    public static void main(String[] args) {
        //calcularMedia() – que recebe como parâmetro um vetor de
        //inteiros, calcula a média aritmética e retorna a média
        int []vetor = {10, 20, 10};
        int media;
        media = calcularMedia(vetor);

        System.out.println("A soma é:"+media);
        
    }
    static int calcularMedia(int []vetor){
            int media;
            for(int i=0; i <vetor.length; i++){
                media += vetor[i];
            }
           
            return media/vetor.length;
        
        }
    }
}
