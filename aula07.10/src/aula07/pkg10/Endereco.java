/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula07.pkg10;

/**
 *
 * @author joao.vcsouza16
 */

public class Endereco {

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    private String logradouro;
    private String complemento;
    private int numero;
    private String cep;

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getNumero() {
        return numero;
    }

    public String getCep() {
        return cep;
    }
    
    public String imprimir(){
        return "\n Logradouro:"+logradouro
                +"\n Complemento:"+complemento
                +"\n Numero:"+numero
                +"\n Cep:"+cep;
    }
    
}
