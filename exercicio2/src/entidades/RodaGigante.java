package entidades;


import java.util.ArrayList;
import java.util.List;

public class RodaGigante {
    private Gondola quant;
    private Gondola[] gondolas = new Gondola[20];


    public RodaGigante() {

    }


    public void embarcar(int indice, Pessoa assento1, Pessoa assento2) {
        this.gondolas[indice - 1] = new Gondola(assento1, assento2);
    }


    public void status() {
            for (int i = 0; i < gondolas.length; i++) {
                if (gondolas[i] == null) {
                    System.out.println((i + 1) + " Vazio");
                } else {
                    System.out.println((i + 1) + " " + gondolas[i].getAssento1().getNome() + " and " + gondolas[i].getAssento2().getNome());
                }
            }
    }




}
