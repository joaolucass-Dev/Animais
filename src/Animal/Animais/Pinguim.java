package Animal.Animais;

public class Pinguim extends Aves{

    public Pinguim(String nome) {
        super(nome);
    }
    
    @Override 
    public void fazerSom() {
        System.out.println(getNome() + " faz som de pinguim!");
    }
    // O pinguim não tem o método voar(), logo, não voa!
}
