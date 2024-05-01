package aplicacao;

import entidades.Pessoa;

public class Programa {
    public static void main(String[] args) {
        Pessoa lily = new Pessoa("Lily");
        lily.adicionarConjugue(new Pessoa("Wilhelm"));

        Pessoa opa = new Pessoa("Opa", lily);
        opa.adicionarConjugue(new Pessoa("Oma"));

        Pessoa reinhold = new Pessoa("Reinhold", opa);
        Pessoa wilma = new Pessoa("Wilma", opa);
        Pessoa sigrid = new Pessoa("Sigrid", opa);

        reinhold.adicionarConjugue(new Pessoa("Sonia"));
        Pessoa christian = new Pessoa("Christian", reinhold);
        Pessoa gabrielle = new Pessoa("Gabrielle", reinhold);
        Pessoa sabine = new Pessoa("Sabine", reinhold);

        wilma.adicionarConjugue(new Pessoa("Rodolfo"));
        Pessoa ricardo = new Pessoa("Ricardo", wilma);
        Pessoa rodrigo = new Pessoa("Rodrigo", wilma);

        ricardo.adicionarConjugue(new Pessoa("Debora"));

        christian.adicionarConjugue(new Pessoa("Monica"));
        Pessoa oscar = new Pessoa("Oscar", christian);
        Pessoa lorena = new Pessoa("Lorena", christian);

        sigrid.adicionarConjugue(new Pessoa("Peter"));
        Pessoa martin = new Pessoa("Martin", sigrid);
        Pessoa thomas = new Pessoa("Thomas", sigrid);
        Pessoa claudia = new Pessoa("Claudia", sigrid);
        martin.adicionarConjugue(new Pessoa("Carla"));
        martin.adicionarfilho(new Pessoa("Nicolas"));
        lily.imprimirArvore(0);
    }
}