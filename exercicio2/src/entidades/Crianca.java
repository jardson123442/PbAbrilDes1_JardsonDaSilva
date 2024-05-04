package entidades;



public class Crianca extends Pessoa {
    private Adulto responsavel;


    public Crianca(String nome, int idade) {
        super(nome, idade);


    }


    public Crianca(String nome, int idade, Adulto responsavel) {
        super(nome, idade);
        this.responsavel = responsavel;
    }
    public boolean validacaoCrianca(Crianca crianca) {
        if(crianca.getIdade() < 12) {
            return true;
        }
        return false;
    }

    public Adulto getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Adulto responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String toString() {
        return getNome() + " Idade: " + getIdade() + " Responsavel: " + getResponsavel();
    }
}
