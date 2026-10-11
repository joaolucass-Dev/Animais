package animais_api.Animal;

public class Cachorro extends Animais {

    // 1. Construtor vazio (NECESSÁRIO para o Spring Boot conseguir ler o JSON do @RequestBody)
    public Cachorro() {
        super();
    }

    // 2. O seu construtor original que exige o nome
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " está latindo: Au Au!");
    }
}