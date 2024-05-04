package entidades;


public class RodaGigante {
    private Gondola quant;
    private Gondola[] gondolas = new Gondola[20];


    public RodaGigante() {

    }


    public void embarcar(int indice, Pessoa assento1, Pessoa assento2) {
        this.gondolas[indice - 1] = new Gondola(assento1, assento2);
    }

    public void embarcar(int indice, Pessoa assento1) {
        if (assento1 instanceof Crianca) {
            Crianca crianca = (Crianca) assento1; // Converte assento1 para Crianca
            if(!crianca.validacaoCrianca(crianca)){
                this.gondolas[indice - 1] = new Gondola(assento1);
            }

            // Passa a própria instância de crianca como argumento
        }
    }

    public void status() {
        System.out.println("=====================================");
        System.out.println("=====G O N D O L A  S T A T U S =====");
        System.out.println("=====================================");
            for (int i = 0; i < gondolas.length; i++) {
                if (gondolas[i] == null) {
                    System.out.println((i + 1) + " Vazio");
                } else if (gondolas[i].getAssento2() == null) {
                    System.out.println( (i + 1) + " Apenas " + gondolas[i].getAssento1().getNome());
                } else {
                    System.out.println((i + 1) + " " + gondolas[i].getAssento1().getNome() + " and " + gondolas[i].getAssento2().getNome());
                }
            }
    }




}
