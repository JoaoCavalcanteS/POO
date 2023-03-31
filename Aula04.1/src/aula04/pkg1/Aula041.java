/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04.pkg1;


public class Aula041 {

    public static void main(String[] args) {
       int []vetorInteiros = {10, 20, 30, 40, 50};
        for(int i=0; i < vetorInteiros.length; i++){
            System.out.print(vetorInteiros[i]+"");
        }
        modificador(vetorInteiros);
        
        System.out.println("\n=== Vetor após chamada de método ===");
        for(int i=0; i <vetorInteiros.length; i++){
            System.out.print(vetorInteiros[i]+ "");
        }
    }
    static void modificador(int []vetor){
        for(int i=0; i <vetor.length; i++){
            vetor[i] = vetor[i]/2;
         }
    }
    
}
