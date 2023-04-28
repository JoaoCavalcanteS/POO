
package AULA71;

public class Endereco {
    private String logradouro;
    private String complemento ;
    private int numero;
    private String cep;
    
    public String imprimir(){
        return "Logradouro:"+logradouro+
                "\ncomplemento:"+complemento+
                "\nnumero:"+numero+
                "\ncep:"+ cep;
                }
}
