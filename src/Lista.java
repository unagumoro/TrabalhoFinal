import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static List<Pergunta> lista(String[] args) {
        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
                "Pergunta 1: Você prefere trabalhar com dados ou pessoas?",
                "Dados (E)", Personalidade.P1,
                "Pessoas (I)", Personalidade.P2));

        perguntas.add(new Pergunta(
                "Pergunta 2: Você gosta de atividades criativas?",
                "Sim", Personalidade.P3,
                "Não", Personalidade.P4));

        perguntas.add(new Pergunta(
                "Pergunta 60: Você gosta de resolver problemas técnicos?",
                "Sim", Personalidade.P4,
                "Não", Personalidade.P2));
        
        return perguntas;
    }

    public static void apresentarPerguntas(List<Pergunta> perguntas) {
        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta.getPergunta());
            System.out.println("Responda com " + pergunta.getPersonalidade1() + " ou " + pergunta.getPersonalidade2() + ": ");
            String resposta = Console.lerString();
    
            if (resposta.equals(pergunta.getResposta1())) {
                pergunta.getPersonalidade1().incrementarPontuacao();
            } else if (resposta.equals(pergunta.getResposta2())) {
                pergunta.getPersonalidade2().incrementarPontuacao();
            }   
        }

    }
}