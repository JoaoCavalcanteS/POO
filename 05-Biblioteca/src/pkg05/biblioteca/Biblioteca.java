
package pkg05.biblioteca;


public class Biblioteca {

    public static void main(String[] args) {
        
        livro objLivro;
        objLivro = new livro();
        
        objLivro.tipo = "Dark Romance";
        objLivro.pag = "636";
        objLivro.lingua = "Português";
        
        System.out.println(objLivro.imprimir());
        
        LivroDeBiblioteca objBiblioteca;
        objBiblioteca = new LivroDeBiblioteca();
    }
    
}
