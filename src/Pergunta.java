public class Pergunta {
    private String pergunta;
    private String opcao1;
    private String opcao2;
    private Personalidade personalidade1;
    private Personalidade personalidade2;

    public Pergunta(String pergunta, String opcao1, Personalidade personalidade1, String opcao2, Personalidade personalidade2) {
        this.pergunta = pergunta;
        this.opcao1 = opcao1;
        this.personalidade1 = personalidade1;
        this.opcao2 = opcao2;
        this.personalidade2 = personalidade2;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(String opcao1) {
        this.opcao1 = opcao1;
    }

    public Personalidade getPersonalidade1() {
        return personalidade1;
    }

    public void setPersonalidade1(Personalidade personalidade1) {
        this.personalidade1 = personalidade1;
    }

    public String getOpcao2() {
        return opcao2;
    }

    public void setOpcao2(String opcao2) {
        this.opcao2 = opcao2;
    }

    public Personalidade getPersonalidade2() {
        return personalidade2;
    }

    public void setPersonalidade2(Personalidade personalidade2) {
        this.personalidade2 = personalidade2;
    }
}