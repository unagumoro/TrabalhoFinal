import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static List<Pergunta> lista(String[] args) {
        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
                "\nPergunta 1: Você geralmente prefere tomar decisões do dia-a-dia...",
                "Quando surgem (P)", Personalidade.P,
                "Com o devido planejamento (J)", Personalidade.J));

        perguntas.add(new Pergunta(
                "\nPergunta 2: Existe mais gratificação em...",
                "Resolver um assunto (J)", Personalidade.J,
                "Discutir um assunto (P)", Personalidade.P));
 
        perguntas.add(new Pergunta(
                "\nPergunta 3: Você costuma ser mais...",
                "Quieto (I)", Personalidade.I,
                "Falante (E)", Personalidade.E));

        perguntas.add(new Pergunta(
                "\nPergunta 4: Você diria que se sente atraído por um trabalho que é mais...",
                "Concreto (S)", Personalidade.S,
                "Técnico (N)", Personalidade.N));
        
        perguntas.add(new Pergunta(
                "\nPergunta 5: Você se considera uma pessoa que gosta de focar mais em...",
                "O que é (I)", Personalidade.I,
                "O que poderia ser (E)", Personalidade.E));

        perguntas.add(new Pergunta(
                "\nPergunta 6: Você acha que fazer novos contatos pessoais é...",
                "Um pouco desajeitado ou desgastante (I)", Personalidade.I,
                "Revigorante (E)", Personalidade.E));

        perguntas.add(new Pergunta(
                "\nPergunta 7: Você costuma ser mais...",
                "Sentimental (T)", Personalidade.T,
                "Analítico (F)", Personalidade.F));

        perguntas.add(new Pergunta(
                "\nPergunta 8: Te dá mais satisfação no trabalho...",
                "Ir com o fluxo (P)", Personalidade.P,
                "Manter organização (J)", Personalidade.J));

        perguntas.add(new Pergunta(
                "\nPergunta 9: Sonhar para você é...",
                "Inspirador e esclarecedor (N)", Personalidade.N,
                "Uma perda de tempo e energia, a menos que haja um propósito prático (S)", Personalidade.S));

        perguntas.add(new Pergunta(
                "\nPergunta 10: Você se sente mais atraído por um trabalho que você pode...",
                "Imaginar e inventar (N)", Personalidade.N,
                "Ver e tocar (S)", Personalidade.S));
        
        perguntas.add(new Pergunta(
                "\nPergunta 11: Você costuma ser mais...",
                "Direto (E)", Personalidade.E,
                "Reflexivo (I)", Personalidade.I));

        perguntas.add(new Pergunta(
                "\nPergunta 12: É mais provável que você conduza uma reunião de maneira...",
                "Planejada (J)", Personalidade.J,
                "Improvisada (P)", Personalidade.P));
                
        perguntas.add(new Pergunta(
                "\nPergunta 13: Você considera pior falta de...",
                "Emoção (T)", Personalidade.T,
                "Razão (F)", Personalidade.F));

        perguntas.add(new Pergunta(
                "\nPergunta 14: Você foi designado para entender melhor um problema que aconteceu no trabalho. Sua primeira ação é...",
                "Investigar os fatos e dados (F)", Personalidade.F,
                "Assistir ao vídeo das pessoas envolvidas contando como se sentiram (T)", Personalidade.T));

        perguntas.add(new Pergunta(
                "\nPergunta 15: Em uma reunião você costuma mais...",
                "Falar bastante (E)", Personalidade.E,
                "Ficar quieto e escutar (I)", Personalidade.I));

        perguntas.add(new Pergunta(
                "\nPergunta 16: No trabalho, você prefere focar mais...",
                "No aqui e agora (S)", Personalidade.S,
                "Nas possibilidades futuras (N)", Personalidade.N));

        perguntas.add(new Pergunta(
                "\nPergunta 17: Em uma confraternização de trabalho, você estaria mais propenso a interagir com...",
                "Todos, incluindo recém-chegados (E)", Personalidade.E,
                "Poucos, apenas os mais íntimos (I)", Personalidade.I));

        perguntas.add(new Pergunta(
                "\nPergunta 18: Ao tomar decisões, você fica mais contente quando...",
                "Você sabe que tomou uma decisão final (J)", Personalidade.J,
                "Há flexibilidade o suficiente para mudar de decisão se achar necessário (P)", Personalidade.P));

        perguntas.add(new Pergunta(
                "\nPergunta 19: Em geral, você enxerga a vida mais...",
                "Cinza (N)", Personalidade.N,
                "Preto e branco (S)", Personalidade.S));

        perguntas.add(new Pergunta(
                "\nPergunta 20: Você costuma ser mais...",
                "Conceitual (N)", Personalidade.N,
                "Prático (S)", Personalidade.S));

        perguntas.add(new Pergunta(
                "\nPergunta 21: Durante conversas com colegas você tem mais tendência a...",
                "Refletir e depois falar (I)", Personalidade.I,
                "Falar e depois refletir (E)", Personalidade.E));

        perguntas.add(new Pergunta(
                "\nPergunta 22: Você costuma se guiar mais por...",
                "Visões (N)", Personalidade.N,
                "Feitos (S)", Personalidade.S));

        perguntas.add(new Pergunta(
                "\nPergunta 23: Você é uma pessoa mais inclinada a...",
                "Estar no controle (J)", Personalidade.J,
                "Ser adaptável (P)", Personalidade.P));

        perguntas.add(new Pergunta(
                "\nPergunta 24: Você se considera uma pessoa mais...",
                "Flexível (P)", Personalidade.P,
                "Planejadora (J)", Personalidade.J));

        perguntas.add(new Pergunta(
                "\nPergunta 25: No geral, você se considera mais...",
                "Empático, compreensivo (T)", Personalidade.T,
                "Objetivo, metódico (F)", Personalidade.F));

        perguntas.add(new Pergunta(
                "\nPergunta 26: Você tende a ser persuadido por...",
                "Fatos e dados (F)", Personalidade.F,
                "Sinceridade e entusiasmo (T)", Personalidade.T));

        perguntas.add(new Pergunta(
                "\nPergunta 27: Você tende a elogiar alguém por sua...",
                "Clareza e intuição (F)", Personalidade.F,
                "Compaixão (T)", Personalidade.T));

        perguntas.add(new Pergunta(
                "\nPergunta 28: Você se impressiona com as pessoas por serem mais...",
                "Empáticas (F)", Personalidade.F,
                "Racionais (T)", Personalidade.T));

        return perguntas;
    }

    public static void apresentarPerguntas(List<Pergunta> perguntas) throws Exception {
        for (Pergunta pergunta : perguntas) {
            boolean respostaValida = false;
            while (!respostaValida) {
                try {
                    System.out.println(pergunta.getPergunta());
                    System.out.println("A) " + pergunta.getOpcao1());
                    System.out.println("B) " + pergunta.getOpcao2());
                    System.out.println("Responda com " + pergunta.getPersonalidade1() + " ou " + pergunta.getPersonalidade2() + ": ");
                    String resposta = Console.lerString();

                    if (!resposta.equals(pergunta.getPersonalidade1().toString()) && !resposta.equals(pergunta.getPersonalidade2().toString())) {
                        throw new Exception("\nRESPOSTA INVÁLIDA! Por favor, responda com " +
                        pergunta.getPersonalidade1() + " ou " + pergunta.getPersonalidade2());
                    }

                    if (resposta.equals(pergunta.getPersonalidade1().toString())) {
                        pergunta.getPersonalidade1().incrementarPontuacao();
                    } else if (resposta.equals(pergunta.getPersonalidade2().toString())) {
                        pergunta.getPersonalidade2().incrementarPontuacao();
                    }

                    respostaValida = true;

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}