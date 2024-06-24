public class Personalidade {
    public static final Personalidade P1 = new Personalidade("P1");
    public static final Personalidade P2 = new Personalidade("P2");
    public static final Personalidade P3 = new Personalidade("P3");
    public static final Personalidade P4 = new Personalidade("P4");
    public static final Personalidade P5 = new Personalidade("P5");
    public static final Personalidade P6 = new Personalidade("P6");
    public static final Personalidade P7 = new Personalidade("P7");
    public static final Personalidade P8 = new Personalidade("P8");

    private String nome;
    private int pontuacao;

    private Personalidade(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void incrementarPontuacao() {
        this.pontuacao++;
    }

    public void atualizarPontuacao(boolean resposta) {
        if (resposta) {
            incrementarPontuacao();
        }
    }

    @Override
    public String toString() {
    return nome;
    }
}