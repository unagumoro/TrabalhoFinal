public class Personalidade {
    public static final Personalidade DADOS = new Personalidade("Dados");
    public static final Personalidade PESSOAS = new Personalidade("Pessoas");
    public static final Personalidade CRIATIVIDADE = new Personalidade("Criatividade");
    public static final Personalidade TECNICA = new Personalidade("Técnica");
    public static final Personalidade DADOS2 = new Personalidade("Dados2");
    public static final Personalidade PESSOAS2 = new Personalidade("Pessoas2");
    public static final Personalidade CRIATIVIDADE2 = new Personalidade("Criatividade2");
    public static final Personalidade TECNICA2 = new Personalidade("Técnica2");
    // Adicione os outros tipos de personalidade conforme necessário

    private String nome;
    private int pontuacao;

    private Personalidade(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void incrementarPontuacao() {
        this.pontuacao++;
    }
}
