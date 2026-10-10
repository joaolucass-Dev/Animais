package Animal.Animais;

public class Gato extends Animais{
    

    public Gato(String nome) {
        super(nome);
    }

    // Aqui usamos o @Override para sobrescrever 
    // uma função q já existe, mas dando uma nova ação
    @Override
    public void fazerSom() {
        System.out.println(getNome() + " fez Miau!");
    }
}
