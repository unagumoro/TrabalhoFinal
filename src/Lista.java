import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static List<Pergunta> lista(String[] args) {
        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
                "\nPergunta 1: Você geralmente prefere tomar decisões do dia-a-dia...",
                "Quando surgem", Personalidade.P,
                "Com o devido planejamento", Personalidade.J));

        perguntas.add(new Pergunta(
                "\nPergunta 2: Existe mais gratificação em...",
                "Resolver um assunto", Personalidade.J,
                "Discutir um assunto", Personalidade.P));

        perguntas.add(new Pergunta(
                "\nPergunta 3: Você costuma ser mais...",
                "Quieto", Personalidade.I,
                "Falante", Personalidade.E));

        perguntas.add(new Pergunta(
                "\nPergunta 4: Você diria que se sente atraído por um trabalho que é mais...",
                "Concreto", Personalidade.S,
                "Técnico", Personalidade.N));
        
        perguntas.add(new Pergunta(
                "\nPergunta 5: Você se considera uma pessoa que gosta de focar mais em...",
                "O que é", Personalidade.I,
                "O que poderia ser", Personalidade.E));

        perguntas.add(new Pergunta(
                "\nPergunta 6: Você acha que fazer novos contatos pessoais é...",
                "Um pouco desajeitado ou desgastante", Personalidade.I,
                "Revigorante", Personalidade.E));

        perguntas.add(new Pergunta(
                "\nPergunta 7: Você costuma ser mais...",
                "Sentimental", Personalidade.F,
                "Analítico", Personalidade.T));

        perguntas.add(new Pergunta(
                "\nPergunta 8: Te dá mais satisfação no trabalho...",
                "Ir com o fluxo", Personalidade.P,
                "Manter organização", Personalidade.J));

        perguntas.add(new Pergunta(
                "\nPergunta 9: Sonhar para você é...",
                "Inspirador e esclarecedor", Personalidade.N,
                "Uma perda de tempo e energia, a menos que haja um propósito prático", Personalidade.S));

        perguntas.add(new Pergunta(
                "\nPergunta 10: Você se sente mais atraído por um trabalho que você pode...",
                "Imaginar e inventar", Personalidade.N,
                "Ver e tocar", Personalidade.S));
        
        perguntas.add(new Pergunta(
                "\nPergunta 11: Você costuma ser mais...",
                "Direto", Personalidade.E,
                "Reflexivo", Personalidade.I));

        perguntas.add(new Pergunta(
                "\nPergunta 12: É mais provável que você conduza uma reunião de maneira...",
                "Planejada", Personalidade.J,
                "Improvisada", Personalidade.P));
                
        perguntas.add(new Pergunta(
                "\nPergunta 13: Você considera pior falta de...",
                "Emoção", Personalidade.F,
                "Razão", Personalidade.T));

        perguntas.add(new Pergunta(
                "\nPergunta 14: Você foi designado para entender melhor um problema que aconteceu no trabalho. Sua primeira ação é...",
                "Investigar os fatos e dados", Personalidade.T,
                "Assistir ao vídeo das pessoas envolvidas contando como se sentiram", Personalidade.F));

        perguntas.add(new Pergunta(
                "\nPergunta 15: Em uma reunião você costuma mais...",
                "Falar bastante", Personalidade.E,
                "Ficar quieto e escutar", Personalidade.I));

        return perguntas;
    }

    public static void apresentarPerguntas(List<Pergunta> perguntas) {
        for (Pergunta pergunta : perguntas) {
            System.out.println(pergunta.getPergunta());
            System.out.println("A) " + pergunta.getOpcao1());
            System.out.println("B) " + pergunta.getOpcao2());
            System.out.println("Responda com " + pergunta.getPersonalidade1() + " ou " + pergunta.getPersonalidade2() + ": ");
            String resposta = Console.lerString();
    
            if (resposta.equals(pergunta.getPersonalidade1().toString())) {
                pergunta.getPersonalidade1().incrementarPontuacao();
            } else if (resposta.equals(pergunta.getPersonalidade2().toString())) {
                pergunta.getPersonalidade2().incrementarPontuacao();
            }   
        }

    }
}