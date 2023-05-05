
package aula08;
import java.util.ArrayList;

public class ListaDeHerois {
    private static ArrayList<Hero>listaHero = new ArrayList<>();
    
    static void adicionar(Hero h) {
        listaHero.add(h);
    }
    static void adicionar(Hero h, int index) {
        listaHero.add(index, h);
    }

    public static ArrayList<Hero> getListaHero() {
        return listaHero;
    }
    static String listar (){
        
    String saida = "";
    
    for(Hero h : listaHero){
        saida += h.imprimir()+"\n";
    }
        return saida;
    }
    //Método para listar herois cadastrados na lista

    //Método para buscar elemento no vetor - indexOf
    static int buscarElemento(Hero hero){
    //compara a referência do objeto
        return listaHero.indexOf(hero);
    }
    //Método para buscar objeto pelo "poder"
    static Hero buscarElemento(String poder){
        for(Hero h : listaHero){
            if(h.getPoder().equalsIgnoreCase(poder))
            return h;
        }
        return null;
    }
    //Método para remover heroi pelo indice
    static void remover(int index){
        listaHero.remove(index);
    }
}
