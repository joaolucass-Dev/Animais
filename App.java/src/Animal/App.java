package Animal;

import java.util.ArrayList;
import java.util.List;

import Animal.Animais.Cachorro;
import Animal.Animais.Gato;
import Animal.Animais.Passaro;
import Animal.Animais.Pinguim;

public class App {
    public static void main(String[] args){
        //cria a lista do cachorro
        List <Cachorro> listaDeCachorros = new ArrayList<>();
        Cachorro c1 = new Cachorro("Max");
        Cachorro c2 = new Cachorro("Branco");

        //aqui add na lista
        listaDeCachorros.add(c1);
        listaDeCachorros.add(c2);

        //cria a lista do gato
        List <Gato> listaDeGatos = new ArrayList<>();
        Gato g1 = new Gato("Jully");
        Gato g2 = new Gato("Laranjinha");

        //add na lista dos gatos
        listaDeGatos.add(g1);
        listaDeGatos.add(g2);

        //cria lista de passaros
        List <Passaro> listaDePassaros = new ArrayList<>();
        Passaro p1 = new Passaro("José");
        Passaro p2 = new Passaro("Piupiu");

        //add na lista de passaros
        listaDePassaros.add(p1);
        listaDePassaros.add(p2);

        //cria lista de pinguim
        List <Pinguim> listaDePinguim = new ArrayList<>();
        Pinguim pg1 = new Pinguim("Happy Fee");
        Pinguim pg2 = new Pinguim("Capitão");

        //add na lista de pinguim
        listaDePinguim.add(pg1);
        listaDePinguim.add(pg2);

        System.out.println("--- LISTA DE CACHORROS NO ABRIGO ---");
        for (Cachorro c : listaDeCachorros) {
            c.fazerSom(); // Aqui o polimorfismo ou comportamento de cada objeto age na lista
        }

        System.out.println("--- LISTA DE GATOS NO ABRIGO ---");
        for (Gato g : listaDeGatos) {
            g.fazerSom(); // Aqui o polimorfismo ou comportamento de cada objeto age na lista
        }

        System.out.println("--- LISTA DE PASSAROS NA GAIOLA ---");
        for (Passaro p : listaDePassaros) {
            p.fazerSom(); // Aqui o polimorfismo ou comportamento de cada objeto age na lista
            p.botarOvos();
            p.voar();
        }

        System.out.println("--- LISTA DE PINGUINS NO ZOOLOGICO ---");
        for (Pinguim pg : listaDePinguim) {
            pg.fazerSom(); // Aqui o polimorfismo ou comportamento de cada objeto age na lista
            pg.botarOvos();
        }
    }
}
 