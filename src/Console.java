import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Console {

    private static Scanner leitor = new Scanner(System.in);

    public static int lerInt() {
        int valor = leitor.nextInt();
        leitor.nextLine();
        return valor;
    }

    public static String lerString() {
        String valor = leitor.nextLine();
        return valor;
    }

    private static Map<String, Map<Personalidade, Integer>> resultados = new HashMap<>();

    public static void quiz(List<Pergunta> perguntas, String nomeUsuario) {
        Lista.apresentarPerguntas(perguntas);
        armazenarResultado(nomeUsuario, perguntas);
        exibirResultado(nomeUsuario, perguntas);
    }

    public static void armazenarResultado(String nomeUsuario, List<Pergunta> perguntas) {
        Map<Personalidade, Integer> pontuacoes = new HashMap<>();
        for (Personalidade personalidade : Personalidade.values()) {
            pontuacoes.put(personalidade, personalidade.getPontuacao());
        }
        resultados.put(nomeUsuario, pontuacoes);
    }

    public static void exibirResultado(String nomeUsuario, List<Pergunta> perguntas) {
        System.out.println("Resultados de " + nomeUsuario + ":");
        for (Personalidade personalidade : Personalidade.values()) {
            System.out.println(personalidade.getNome() + ": " + personalidade.getPontuacao());
        }
    }

    public static void exibirResultados() {
        if (resultados.isEmpty()) {
            System.out.println("Nenhum resultado armazenado.");
        } else {
            for (String nomeUsuario : resultados.keySet()) {
                System.out.println("Resultados de " + nomeUsuario + ":");
                Map<Personalidade, Integer> pontuacoes = resultados.get(nomeUsuario);
                for (Map.Entry<Personalidade, Integer> entry : pontuacoes.entrySet()) {
                    System.out.println(entry.getKey().getNome() + ": " + entry.getValue());
                }
                System.out.println();
            }
        }
    }
}