/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05;

public class Aula05 {

    public static void main(String[] args) {
        
        pessoa objPessoa;
        objPessoa = new pessoa();
        
        objPessoa.nome = "Joao";
        objPessoa.idade = 19;
        objPessoa.sexo = 'M';
        
        lampada objLampada;
        objLampada = new lampada();
        
        objLampada.tipo = "LED";
        objLampada.energia = "60W";
        objLampada.cores = "RGB";
        
        System.out.println(objPessoa.imprimir());
        System.out.println("////////////////////////");
        System.out.println(objLampada.imprimir());
        

    }
    
}
