import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Resultados {
    private static final String ARQUIVO = "resultados.txt";
    private static Map<String, Map<Personalidade, Integer>> resultados = new HashMap<>();

    public static void quiz(List<Pergunta> perguntas, String nomeUsuario) {
        armazenarResultado(nomeUsuario, perguntas);
    }

    public static void armazenarResultado(String nomeUsuario, List<Pergunta> perguntas) {
        Map<Personalidade, Integer> pontuacoes = new HashMap<>();
        for (Personalidade personalidade : Personalidade.values()) {
            pontuacoes.put(personalidade, personalidade.getPontuacao());
        }
        resultados.put(nomeUsuario, pontuacoes);
    }

    public static void exibirResultado(String nomeUsuario, List<Pergunta> perguntas) {
        System.out.println("\nResultados de " + nomeUsuario + ":");
        Map<Personalidade, Integer> pontuacoes = resultados.get(nomeUsuario);
        if (pontuacoes != null) {
            for (Personalidade personalidade : Personalidade.values()) {
                System.out.println(personalidade.getNome() + ": " + pontuacoes.get(personalidade));
            }
            System.out.println("\nVocação: " + Vocacao.determinarVocacao(pontuacoes));
        } else {
            System.out.println("\nUsuário não encontrado.");
        }
    }

    public static void exibirResultados() {
        if (resultados.isEmpty()) {
            System.out.println("\nNenhum resultado armazenado.");
        } else {
            for (String nomeUsuario : resultados.keySet()) {
                System.out.println("\nResultados de " + nomeUsuario + ":");
                Map<Personalidade, Integer> pontuacoes = resultados.get(nomeUsuario);
                for (Map.Entry<Personalidade, Integer> entry : pontuacoes.entrySet()) {
                    System.out.println(entry.getKey().getNome() + ": " + entry.getValue());
                }
                System.out.println("\nVocação: " + Vocacao.determinarVocacao(pontuacoes));
                System.out.println();
            }
        }
    }
    
    public static void salvarResultados() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARQUIVO))) {
            for (Map.Entry<String, Map<Personalidade, Integer>> entry : resultados.entrySet()) {
                writer.println(entry.getKey());
                for (Map.Entry<Personalidade, Integer> pontuacao : entry.getValue().entrySet()) {
                    writer.println(pontuacao.getKey().getNome() + ":" + pontuacao.getValue());
                }
                String vocacao = Vocacao.determinarVocacao(entry.getValue());
                writer.println("\nVocação:" + vocacao);
                writer.println();
            }
        } catch (IOException e) {
            System.err.println("\nErro ao salvar resultados: " + e.getMessage());
        }
    }

    public static void carregarResultados() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            String nomeUsuario = null;
            Map<Personalidade, Integer> pontuacoes = null;
            while ((linha = reader.readLine()) != null) {
                if (linha.isEmpty()) {
                    if (nomeUsuario != null && pontuacoes != null) {
                        resultados.put(nomeUsuario, pontuacoes);
                    }
                    nomeUsuario = null;
                    pontuacoes = null;
                } else if (nomeUsuario == null) {
                    nomeUsuario = linha;
                    pontuacoes = new HashMap<>();
                } else if (linha.startsWith("\nVocação:")) {
                } else {
                    String[] partes = linha.split(":");
                    if (partes.length == 2) {
                        Personalidade personalidade = Personalidade.getPersonalidadePorNome(partes[0]);
                        int pontuacao = Integer.parseInt(partes[1]);
                        pontuacoes.put(personalidade, pontuacao);
                    }
                }
            }
            if (nomeUsuario != null && pontuacoes != null) {
                resultados.put(nomeUsuario, pontuacoes);
            }
        } catch (IOException e) {
            System.err.println("\nErro ao carregar resultados: " + e.getMessage());
        }
    }
}