package entidades;

public class Pessoa {
    private String nome;
    private String conjugue;
    private String filho;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Pessoa conjugue) {
        this.nome = nome;
        this.conjugue = conjugue.getNome();
    }

    public void adicionarConjugue(String conjugue) {
        this.conjugue = conjugue;
    }

    public Pessoa(String nome, String conjugue, String filho) {
        this.nome = nome;
        this.conjugue = conjugue;
        this.filho = filho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConjugue() {
        return conjugue;
    }


    public String getFilho() {
        return filho;
    }

    public void adicionarFilho(String filho) {
        this.filho = filho;
    }

    public void imprimirArvore() {

        System.out.print(nome + " -- ");
        if (conjugue != null) {
            System.out.print("Conjugue de: " + conjugue);
        }
        if (filho != null) {
            System.out.print(" -- Filho: \n" + filho);
        }
    }
}
