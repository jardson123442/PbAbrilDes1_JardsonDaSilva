package entidades;



public class Crianca extends Pessoa {
    private Pessoa pais;


    public Crianca(String nome, int idade, Pessoa pais) {
        super(nome, idade);
        adicionaPais(pais);
    }
    public void adicionaPais(Pessoa mainPais) {
        setPais(mainPais);
    }

    public Crianca(String nome, int idade) {
        super(nome, idade);
    }


    public Pessoa getPais() {
        return pais;
    }

    public void setPais(Pessoa pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return getNome() + " Idade: " + getIdade() + " Pais: " + getPais();
    }
}
