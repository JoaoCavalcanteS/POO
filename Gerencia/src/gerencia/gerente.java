
package gerencia;


public class gerente extends funcionario {
    
    private int numeroFuncionario;

    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public void setNumeroFuncionario(int numeroFuncionario) {
        this.numeroFuncionario = numeroFuncionario;
    }
    
    
    public gerente(){
        //se for extends de uma classe, voce deve instanciar a classe pai, usando super()
        super();
    }

    public gerente(String nome,double salario, int numeroFuncionario) {
        super(nome, salario);
        this.numeroFuncionario=numeroFuncionario;
    }
    public double aumentarSalario(double percentual){
        return super.aumentarSalario(percentual+20);
    }
    
    public String imprimir(){
        return super.imprimir()+". numero funcionarios"+numeroFuncionario;
                
    }
}
