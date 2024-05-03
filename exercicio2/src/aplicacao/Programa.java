package aplicacao;


import entidades.Adulto;
import entidades.Crianca;
import entidades.Pessoa;
import entidades.RodaGigante;

public class Programa {


    public static void main(String[] args) {
        RodaGigante rodaGigante = new RodaGigante(); // Creating a new Ferris wheel
        Adulto paulo = new Adulto("Paulo", 42); // Adult named Paulo
        // Paulo's children
        Crianca joao = new Crianca("Joao", 5, paulo); // New child with Paulo as the father
        Crianca maria = new Crianca("Maria", 12, paulo); // This is Paulo's daughter


        rodaGigante.embarcar(1, joao, maria);


        rodaGigante.status();

    }
}