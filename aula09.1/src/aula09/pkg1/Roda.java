
package aula09.pkg1;


public class Roda {
    private int aro;
    private String marca;
    private String largura;
    private boolean enchimento;
    
    public Roda(){
    
    }

    public Roda(int aro, String marca, String largura, boolean enchimento) {
        this.aro = aro;
        this.marca = marca;
        this.largura = largura;
        this.enchimento = enchimento;
        
    }

    public int getAro() {
        return aro;
    }
    public String getMarca() {
        return marca;
    }
    public String getLargura() {
        return largura;
    }
      public boolean encher(){
            enchimento = !enchimento;
            return enchimento;
        
    }
    public String imprimir(){
    String estadoPneu = (enchimento ?"Pneu cheio":"Pneu vazio");
    return "Roda{"+
           ",aro:"+aro+
           ",marca:"+marca+
           ",largura:"+largura+
           ","+estadoPneu+
           "}";

    } 

}
