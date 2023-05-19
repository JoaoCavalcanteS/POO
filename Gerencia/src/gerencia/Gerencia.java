
package gerencia;
import java.util.Scanner;

public class Gerencia {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
//        System.out.print("Digite o seu nome:");
//        String nome = entrada.nextLine();
//        System.out.print("Digite o salário:");
//        double salario = entrada.nextDouble();
//        System.out.print("Digite o número de funcionários:");
//        int numeroFuncionarios = entrada.nextInt();
//        
//        gerente jose = new gerente(nome, salario, numeroFuncionarios);
//        
//        jose.aumentarSalario(10);
//        System.out.print(jose.imprimir());
        
        
        
        System.out.print("Digite o valor:");
        double valor = entrada.nextDouble();
        System.out.print("Digite a qt de cavalos:");
        int qtCavalos = entrada.nextInt();

        IPVA carro = new IPVA(valor, qtCavalos);
        
        carro.calcularIPVA();
        System.out.print(carro.imprimir());
    }
    
}
