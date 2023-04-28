
package AULA71;

import AULA71.Endereco;

public class Pessoa {
    private String nome;
    private int idade ;
    private char sexo;
    private Endereco end;
    
    public Pessoa(){
        this.end = new Endereco();
    }
    
    public String imprimir(){
        return "Nome:"+nome+
                "\nIdade:"+idade+
                "\nSexo:"+sexo+
                "\Endereço:"+ end.imprimir();
                           
    }
}
