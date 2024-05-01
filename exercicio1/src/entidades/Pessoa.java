package entidades;

import java.util.ArrayList;


public class Pessoa {
    private String name;
    private Pessoa conjugue;
    private ArrayList<Pessoa> filhos = new ArrayList<>();
    private Pessoa pais; // pai/mãe da pessoa atual que está sendo criada

    public Pessoa(String name) {
        this.name = name;
    }

    // Metodo que cria uma pessoa com um pai/mãe
    public Pessoa(String name, Pessoa pais) {
        this.name = name; // nome do filho
        this.pais = pais; // pai/mãe
        pais.adicionarfilho(this); // adiciona o filho ao pai/mãe
    }

    // adiciona filho sendo uma pessoa
    public void adicionarfilho(Pessoa filhoMain) {
        filhos.add(filhoMain); // adiciona o filho a lista de filhos
        filhoMain.pais = this; // adiciona o pai/mãe ao filho
    }


    // Metodo que cria esposo(a) e faz a ligação entre os dois
    public void adicionarConjugue(Pessoa conjugueMain) {
        this.conjugue = conjugueMain; // adiciona o conjugue
        conjugue.conjugue = this; // relaciona o conjugue com a pessoa
    }

    // Metodo para imprimir a arvore genealogica
    public void imprimirArvore(int espacos) {
        espacos(espacos);
        if (conjugue != null) {
            System.out.println(name + "-- Casado(a) com: " + (conjugue != null ? conjugue.name : "") + " -- Filhos: " + filhos.size());
        } else {
            System.out.println(name + "-- Solteiro(a)");
        }
        for (Pessoa filho : filhos) { // percorre a lista de filhos
            filho.imprimirArvore(espacos + 1); // chama o metodo recursivamente para imprimir os filhos, de modo que se o filho tiver filhos, esses filhos também serão impressos
        }
    }

    // adiciona espaços
    private void espacos(int contador) {
        for (int i = 0; i < contador; i++) {
            System.out.print("    ");  // imprime 4 espaços, quando o metodo printFamilyTree é chamado, ele imprime 4 espaços a mais, assim sucessivamente
        }
    }
}