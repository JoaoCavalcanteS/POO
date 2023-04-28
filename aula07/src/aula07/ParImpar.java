
package aula07;


public class ParImpar {
    private int numero;
    private boolean modulo;
    
    public ParImpar(){};
    public ParImpar(int numero){
        this.numero = numero;
    }
     public int getNum(){
        return numero;
    }
    public void setNum(int numero){
        this.numero = numero;
    }
 
    public boolean verificarPar(){
        if(numero%2 == 0){
            modulo = true;
        }
        else{
            modulo = false;
        }
        return modulo;
    }
}
