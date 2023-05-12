
package aula09.pkg1;

public class motor {
    private String torque;
    private int cilindros;
    private int litragem;
    private boolean ligado;

    public String getTorque() {
        return torque;
    }
    public int getCilindros() {
        return cilindros;
    }
    public int getLitragem() {
        return litragem;
    }
    
    public motor(){
        
    }
    
    public motor(String torque, int cilindros, int litragem, boolean ligado) {
        this.torque = torque;
        this.cilindros = cilindros;
        this.litragem = litragem;
        this.ligado = ligado;
    }
    public boolean ligarDesligar(){
            ligado = !ligado;
            return ligado;
        
    }
    public String imprimir(){
        String funcionando = (ligado ?"motor ligado":"motor desligado");
        return "Motor{"+
                ",cilindros:"+cilindros+
                ",torque:"+torque+
                ",litragem:"+litragem+
                ","+funcionando+
                "}";

    }   
    
}
