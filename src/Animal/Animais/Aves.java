package Animal.Animais;

public class Aves extends Animais{

    public Aves(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " fez seu som de passaro");
    }

    public void botarOvos(){
        System.out.println(getNome() + " botou um ovo!");
    }
    
}
