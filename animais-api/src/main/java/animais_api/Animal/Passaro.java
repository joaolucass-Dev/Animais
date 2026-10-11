package animais_api.Animal;

import animais_api.Animal.interfaces.Voador;

public class Passaro extends Aves implements Voador {

    public Passaro(String nome) {
        super(nome);
    }

    @Override 
    public void voar(){
        System.out.println(getNome() + " está voando alto!");
    }
    
}
