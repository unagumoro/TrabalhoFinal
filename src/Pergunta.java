public class Pergunta {
    private String pergunta;
    private String resposta1;
    private String resposta2;
    private Personalidade personalidade1;
    private Personalidade personalidade2;

    public Pergunta(String pergunta, String resposta1, Personalidade personalidade1, String resposta2, Personalidade personalidade2) {
        this.pergunta = pergunta;
        this.resposta1 = resposta1;
        this.personalidade1 = personalidade1;
        this.resposta2 = resposta2;
        this.personalidade2 = personalidade2;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta1() {
        return resposta1;
    }

    public void setResposta1(String resposta1) {
        this.resposta1 = resposta1;
    }

    public Personalidade getPersonalidade1() {
        return personalidade1;
    }

    public void setPersonalidade1(Personalidade personalidade1) {
        this.personalidade1 = personalidade1;
    }

    public String getResposta2() {
        return resposta2;
    }

    public void setResposta2(String resposta2) {
        this.resposta2 = resposta2;
    }

    public Personalidade getPersonalidade2() {
        return personalidade2;
    }

    public void setPersonalidade2(Personalidade personalidade2) {
        this.personalidade2 = personalidade2;
    }
}