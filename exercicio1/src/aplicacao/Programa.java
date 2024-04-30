package aplicacao;

import entidades.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos");
        marcos.adicionarConjugue("Maria");
        Pessoa filho = new Pessoa("João");
        marcos.adicionarFilho(filho.getNome());


        marcos.imprimirArvore();
    }
}