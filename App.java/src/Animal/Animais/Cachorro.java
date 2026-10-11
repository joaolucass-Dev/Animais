package Animal.Animais;

public class Cachorro extends Animais{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está latindo: Au Au!");
    }
}
