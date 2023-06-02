
package com.mycompany.aula11;

public class Circulo extends FormaGeometrica{
    private String nome;
    private final double pi = 3.14159;
    public String getNome() {
        return nome;
    }
    
    private double raio;
    
    public Circulo(){
        super();
    };
    
    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    };
    
    public double calcularArea(){
        return pi*(raio*raio);
    }

    public String imprimir() {
        return super.imprimir()+
                ", raio=" + raio + ", area=" + calcularArea();
    }
    
    
}
