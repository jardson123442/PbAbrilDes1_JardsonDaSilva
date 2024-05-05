package entidades;

public class SentimentoEmoticons {
    private String mensagem;
    private int countDivertido;
    private int countChateado;

    public SentimentoEmoticons(String mensagem) {
        this.mensagem = mensagem;
        countDivertido = contarEmoticons(":-)");
        countChateado = contarEmoticons(":-(");
    }

    public String determinarSentimento() {
        if (countDivertido == countChateado) {
            return "neutro";
        } else if (countDivertido > countChateado) {
            return "divertido";
        } else {
            return "chateado";
        }
    }

    private int contarEmoticons(String emoticon) {
        int contador = 0;
        int ultimoVatolor = 0;

        while (ultimoVatolor != -1) {
            ultimoVatolor = mensagem.indexOf(emoticon, ultimoVatolor);

            if (ultimoVatolor != -1) {
                contador++;
                ultimoVatolor += emoticon.length();
            }
        }

        return contador;
    }
}


