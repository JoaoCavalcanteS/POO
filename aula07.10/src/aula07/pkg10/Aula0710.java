
package aula07.pkg10;

import java.util.Scanner;

public class Aula0710 {
   
    public static void main(String[] args) {
        
        Pessoa objPessoa = new Pessoa();
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        System.out.println("Digite o nome");
        String nome = entradaString.nextLine();
        objPessoa.setNome(nome);

        System.out.println("Digite a idade");
        int idade = entrada.nextInt();
        objPessoa.setIdade(idade);

        System.out.println("Digite o sexo");
        char sexo = entrada.next().charAt(0);
        objPessoa.setSexo(sexo);

        Endereco endPessoa = new Endereco();

        System.out.println("Digite o logradouro");
        String logradouro = entradaString.nextLine();
        endPessoa.setLogradouro(logradouro);

        System.out.println("Digite o numero");
        int numero = entrada.nextInt();
        endPessoa.setNumero(numero);

        System.out.println("Digite o complemento");
        String complemento = entradaString.nextLine();
        endPessoa.setComplemento(complemento);

        System.out.println("Digite o cep");
        String cep = entradaString.nextLine();
        endPessoa.setCep(cep);

        objPessoa.setEnd(endPessoa);
        System.out.println(objPessoa.imprimir());
        
        
    }
    
}
