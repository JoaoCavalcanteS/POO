
package gerencia;

public class funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public funcionario(){};
    
    public funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public double aumentarSalario(double percentual){
        return this.salario=salario*percentual/100;
    }
    
        public String imprimir(){       
        return ",nome:"+nome+
                ",salario:"+String.format("%.2f", salario)
                ;

    }
}
