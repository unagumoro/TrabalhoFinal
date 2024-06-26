public class Personalidade {
    public static final Personalidade E = new Personalidade("E");
    public static final Personalidade I = new Personalidade("I");
    public static final Personalidade S = new Personalidade("S");
    public static final Personalidade N = new Personalidade("N");
    public static final Personalidade T = new Personalidade("T");
    public static final Personalidade F = new Personalidade("F");
    public static final Personalidade P = new Personalidade("P");
    public static final Personalidade J = new Personalidade("J");

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

    public void reiniciarPontuacao() {
        this.pontuacao = 0;
    }

    public static void reiniciarPontuacoes() {
        for (Personalidade personalidade : values()) {
            personalidade.reiniciarPontuacao();
        }
    }

    public static Personalidade[] values() {
        return new Personalidade[]{E, I, S, N, T, F, P, J};
    }

    public static Personalidade getPersonalidadePorNome(String nome) {
        for (Personalidade p : values()) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String toString() {
    return nome;
    }
}