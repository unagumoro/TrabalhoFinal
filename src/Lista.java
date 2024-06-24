import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Pergunta> perguntas = new ArrayList<>();
        // Adicionar todas as 60 perguntas
        perguntas.add(new Pergunta(
            "Pergunta 1: Você prefere trabalhar com dados ou pessoas?",
            "Dados", Personalidade.DADOS,
            "Pessoas", Personalidade.PESSOAS
        ));
        perguntas.add(new Pergunta(
            "Pergunta 2: Você gosta de atividades criativas?",
            "Sim", Personalidade.CRIATIVIDADE,
            "Não", Personalidade.TECNICA
        ));
        // Continue adicionando todas as perguntas da mesma forma
        // ...
        perguntas.add(new Pergunta(
            "Pergunta 60: Você gosta de resolver problemas técnicos?",
            "Sim", Personalidade.TECNICA,
            "Não", Personalidade.PESSOAS
        ));

        Quiz quiz = new Quiz(perguntas);
        quiz.iniciarQuiz();
    }
}
