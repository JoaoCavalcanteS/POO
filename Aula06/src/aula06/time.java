
package aula06;

public class time {
//Variáveis de instância - Atributos
    int hora;
    int minuto;
    int segundo;
//Construtor
    public time(int hora, int minuto, int segundo){
        if(hora >= 0 && hora < 24){
            this.hora = hora;
            if(minuto >= 0 && minuto < 60)
            this.minuto = minuto;
            if(segundo >= 0 && segundo < 60)
            this.segundo = segundo;
        }
    }
//métodos da classe
    public String imprimir(){
        return hora+":"+minuto+":"+segundo;
    }
}
