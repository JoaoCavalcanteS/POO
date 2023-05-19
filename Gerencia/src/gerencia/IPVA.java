
package gerencia;

public class IPVA {
    private double valorBase;
    private int quantidadeCavalos;
    
    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public int getQuantidadeCavalos() {
        return quantidadeCavalos;
    }

    public void setQuantidadeCavalos(int quantidadeCavalos) {
        this.quantidadeCavalos = quantidadeCavalos;
    }
    
    public IPVA(){
    }
    
    public IPVA(double valorBase, int quantidadeCavalos) {
        this.valorBase = valorBase;
        this.quantidadeCavalos = quantidadeCavalos;
    }
    public double calcularIPVA(){
   
        return valorBase*quantidadeCavalos;
    }
    public  String imprimir(){
        return "Valor base:"+valorBase+
                "\n quantidade de cavalos:"+quantidadeCavalos;
    }
}
