/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import.inti
package aula09.pkg1;

/**
 *
 * @author joao.vcsouza16
 */
public class Carro {
    private String marca;
    private String modelo;
    private ArrayList<Roda>rodas = new ArrayList<>(5);
    private motor motor;

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getRodas() {
        return rodas;
    }
    public String getMotor() {
        return motor;
    }
    public Carro(){
        
    }
    public acelerar(){
        
    }

    public Carro(String marca, String modelo, String rodas, String motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.rodas = rodas;
        this.motor = motor;
    }
    
}
