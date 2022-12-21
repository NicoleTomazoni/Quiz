package model.bean;

public class Questoes {
    private int idquestao;
    private String enunciadoquestao;
    private int dificuldade;
    private int tema;

    public int getTema() {
        return tema;
    }

    public void setTema(int tema) {
        this.tema = tema;
    }

    
    public int getIdquestao() {
        return idquestao;
    }

    public void setIdquestao(int idquestao) {
        this.idquestao = idquestao;
    }

    public String getEnunciadoquestao() {
        return enunciadoquestao;
    }

    public void setEnunciadoquestao(String enunciadoquestao) {
        this.enunciadoquestao = enunciadoquestao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
    
    
}
