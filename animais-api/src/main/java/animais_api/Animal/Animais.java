package animais_api.Animal;

public class Animais {
    private String nome;

    // 1. Construtor vazio (Necessário para o Spring conseguir instanciar via JSON)
    public Animais() {
    }

    // 2. Seu construtor original que recebe o nome
    public Animais(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    void fazerSom(){
        System.out.println(getNome() + " faz algum som.");
    }
}