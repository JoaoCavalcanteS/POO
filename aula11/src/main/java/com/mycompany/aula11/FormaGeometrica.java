
package com.mycompany.aula11;


public abstract class FormaGeometrica {
    private String nome;
    public FormaGeometrica(){};
    
    public FormaGeometrica(String nome){
        this.nome = nome;
    }
    public abstract double calcularArea();
    
    public String imprimir() {
        return "FormaGeometrica:nome='}"+nome;
    }
    
}
