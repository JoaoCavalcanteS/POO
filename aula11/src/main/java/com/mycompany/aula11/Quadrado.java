
package com.mycompany.aula11;


public class Quadrado extends FormaGeometrica{
    
    private double lado;

    public double getLado() {
        return lado;
    }
    
    public Quadrado(){
        super();
    }
    public Quadrado(String nome, double lado){
        super(nome);
        this.lado = lado;
    }
    public double calcularArea(){
        return lado*lado;
    }

    public String Imprimir() {
        return super.imprimir()+
                "lados{"+lado +
                ", area=" + calcularArea();
    }
    
    
}
