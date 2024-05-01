package aplicacao;


import entidades.Crianca;
import entidades.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa paulo = new Pessoa("Paulo", 23);
        Crianca carlos = new Crianca("Carlos", 9, paulo);

        System.out.println(carlos);




    }
}