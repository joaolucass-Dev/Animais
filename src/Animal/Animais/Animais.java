package Animal.Animais;

public class Animais {
    private  String nome;

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
