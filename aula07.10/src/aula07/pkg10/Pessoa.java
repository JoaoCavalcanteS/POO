
package aula07.pkg10;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private Endereco end;

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public Endereco getEnd() {
        return end;
    }
    
    public Pessoa(){
        this.end = new Endereco();
    }
    public String imprimir(){
                return "Nome:"+nome
                +"\n Idade:"+idade
                +"\n Sexo:"+sexo
                +"\n Enderec: "+end.imprimir();
    }
}
