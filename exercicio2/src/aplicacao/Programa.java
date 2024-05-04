package aplicacao;


import entidades.Adulto;
import entidades.Crianca;
import entidades.RodaGigante;

public class Programa {


    public static void main(String[] args) {
        RodaGigante rodaGigante = new RodaGigante();
        Adulto paulo = new Adulto("Paulo", 42);
        // Paulo's children
        Crianca joao = new Crianca("Joao", 5, paulo);
        Crianca maria = new Crianca("Maria", 12, paulo); r
        // Child without defined father
        Crianca pedro = new Crianca("Pedro", 13);
        Crianca henrique = new Crianca("Henrique", 10);

        rodaGigante.embarcar(2, joao);
        rodaGigante.embarcar(2, joao, maria);
        rodaGigante.embarcar(3, maria);
        rodaGigante.embarcar(13, pedro);
        rodaGigante.embarcar(16, henrique);
        rodaGigante.status();

    }
}