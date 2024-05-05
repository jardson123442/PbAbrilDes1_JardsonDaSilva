package aplicacao;

import entidades.SentimentoEmoticons;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a mensagem:");
        String mensagem = scanner.nextLine();

        SentimentoEmoticons sentimento = new SentimentoEmoticons(mensagem);
        String resultado = sentimento.determinarSentimento();

        System.out.println(resultado);

        scanner.close();
    }
}
