import java.util.List;

public class Quiz {
    private List<Pergunta> perguntas;
    private List<Personalidade> personalidades;

    public Quiz(List<Pergunta> perguntas, List<Personalidade> personalidades) {
        this.perguntas = perguntas;
        this.personalidades = personalidades;
    }

    public void iniciarQuiz() {
        // Lógica para iniciar o quiz
        // Por exemplo, iterar sobre as perguntas e coletar as respostas do usuário
    }

    // Outros métodos que você precisar para gerenciar o quiz
}
