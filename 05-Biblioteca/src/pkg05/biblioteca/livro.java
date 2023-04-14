
package pkg05.biblioteca;

public class livro {
    String tipo;
    String pag;
    String lingua;
    
    public String imprimir(){
        return "Tipo:" + tipo + "\nN° páginas:" + pag + "\nLingua:" + lingua;
    }
}
