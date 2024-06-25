import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pergunta> perguntas = Lista.lista(args);
        Sistema.executar(perguntas);
    }
}