package model.bean;

public class Alternativas {
    private Questoes questao;
    private int idalternativa;
    private boolean isCerta;
    private int idquestao;
    private String enunciadoAlternativa;

    public Questoes getQuestao() {
        return questao;
    }

    public void setQuestao(Questoes questao) {
        this.questao = questao;
    }

    public int getIdalternativa() {
        return idalternativa;
    }

    public void setIdalternativa(int idalternativa) {
        this.idalternativa = idalternativa;
    }

    public boolean isIsCerta() {
        return isCerta;
    }

    public void setIsCerta(boolean isCerta) {
        this.isCerta = isCerta;
    }

    public int getIdquestao() {
        return idquestao;
    }

    public void setIdquestao(int idquestao) {
        this.idquestao = idquestao;
    }

    public String getEnunciadoAlternativa() {
        return enunciadoAlternativa;
    }

    public void setEnunciadoAlternativa(String enunciadoAlternativa) {
        this.enunciadoAlternativa = enunciadoAlternativa;
    }
    
    
}
