package aula08;
import java.util.ArrayList;
import java.util.Scanner;

public class Aula08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            
            Hero hero1 = new Hero("homem-aranha","escalar paredes");
            Hero hero2 = new Hero("homem-aranha","escalar paredes");
            Hero hero3 = new Hero("homem-aranha","escalar paredes");
            Hero hero4 = new Hero("homem-aranha","escalar paredes");
            
            ListaDeHerois.adicionar(hero1);
            ListaDeHerois.adicionar(hero2);
            ListaDeHerois.adicionar(hero3);
            ListaDeHerois.adicionar(hero4);
            
            
//            System.out.println("===HEROIS CADASTRADOS===");
//            System.out.println(listarHerois(listaHero));
            System.out.println("===USO DO get(int index)===");
            System.out.println("Heroi cadastrado na posição:"+(1)+""+listaHero.get(1).getNome());
                
            System.out.println("===TOTAL DE HEROIS CADASTRADOS===");
            System.out.println(ListaDeHerois.listar());
            
            System.out.println("===USO DO indexOf(Object o)===");
            System.out.println("Esta no indice"+buscarElemento(listaHero, hero4));
            
            System.out.println("===BUSCA OBJETO PELO PODER: super força ===");
            Hero h = ListaDeHerois.buscarElemento( "super força");
            if(h!=null){
                 h = ListaDeHerois.buscarElemento("super força");
            }else{
                h = ListaDeHerois.buscarElemento( "super força");
            }
            System.out.println(h.imprimir());
            
            System.out.print("===VERIFICA SE O ARRAY ESTÁ VAZIO===");
            if(ListaDeHerois.isEmpty()){
                System.out.println("Array vazio!");
            }else{
                System.out.println("Tem elementos cadastrados");
            }
    }

    static int buscarElemento(ArrayList<Hero>listaHero, Hero hero){
        return listaHero.indexOf(hero);
    }
    static Hero buscarElemento(ArrayList<Hero>listaHero, String poder){
        for(Hero h : listaHero){
            if(h.getPoder().equalsIgnoreCase(poder)){
                return h;
            }
        }
        return null;
    }
}
