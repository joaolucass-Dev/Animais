package Animal.Animais;

import Animal.Animais.interfaces.Voador;

public class Passaro extends Aves implements Voador {

    public Passaro(String nome) {
        super(nome);
    }

    @Override 
    public void voar(){
        System.out.println(getNome() + " está voando alto!");
    }
    
}
