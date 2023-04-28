
package aula07;

import java.util.Scanner;
public class Aula07 {

    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            Hero listaHero[] = new Hero[1];
            Hero hero; //referencia para classe Hero
            
            int i;
            String nome, poder;
            
            for(i = 0; i < listaHero.length; i++){
                System.out.println("==> Dados do Hero "+(i+1)+":");
                System.out.println("Heroi? ");
                nome = entrada.nextLine();
                System.out.println("Poder? ");
                poder = entrada.nextLine();
                //chama o construtor com parâmetros
                hero = new Hero(nome, poder);
                //armazena a referencia do objeto no vetor
                listaHero[i] = hero;
            }
            System.out.println("=== HEROIS CADASTRADOS ===");
            for(Hero h : listaHero){
            System.out.println( h.imprimir() + "\n");
            }

            ParImpar modulo[] = new ParImpar[10];
            ParImpar parImpar; //referencia para classe Hero
            
            int m;
            int numero;
            
            for(m = 0; m < modulo.length; m++){
                System.out.println("==> Dados do Hero "+(m+1)+":");
                System.out.println("Diga um número");
                numero = 1;
                //chama o construtor com parâmetros
                parImpar = new ParImpar(numero);
                //armazena a referencia do objeto no vetor
                modulo[m] = parImpar;
            }
            System.out.println("=== NUMEROS A BAIXO ===");
            for(ParImpar n : modulo){
                System.out.println( n.verificarPar() + "\n");
            }
            
//            Nesta classe definir um vetor para armazenar até 10
//            objetos da classe ParImpar
//            – Investigar no vetor a quantidade de números que são pares
//            – O percentual de números ímpares cadastrados no vetor
            AppParImpar modulos[] = new AppParImpar[10];
            modulos[]={1,2,3,4,5,6,7,8,9,10};
            AppParImpar appparImpar;
            
            for(m = 0; m < modulo.length; m++){
                System.out.println("==> Dados do Hero "+(m+1)+":");
                
                numero = 1;
                //chama o construtor com parâmetros
                parImpar = new ParImpar(numero);
                //armazena a referencia do objeto no vetor
                modulo[m] = parImpar;
            }
            System.out.println("=== NUMEROS A BAIXO ===");
            for(ParImpar n : modulo){
                System.out.println( n.verificarPar() + "\n");
            }
            
          
       
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            //        int vetor[] = {1,2,3,4,5,6,7,8,9,10};
//        int somatorio = 0;
//        for(int i : vetor){
//            somatorio += i;
//        }
//        System.out.println(somatorio);
//        String city[] = {"São Paulo","Rio de Janeiro", "Itú","Florianápolis","Bahia","Ceará"};
//        for(String e : city){
//            System.out.println(e);
//        }
        
    }
    
}
