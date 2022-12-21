package model.bean;

public class Jogador {
    private int idjogador;
    private int certas;
    private int erradas;
    private String nick; //verr coo coloca limite de tamanho
    private int totalPontos;

    public int getIdjogador() {
        return idjogador;
    }

    public void setIdjogador(int idjogador) {
        this.idjogador = idjogador;
    }

    public int getCertas() {
        return certas;
    }

    public void setCertas(int certas) {
        this.certas = certas;
    }

    public int getErradas() {
        return erradas;
    }

    public void setErradas(int erradas) {
        this.erradas = erradas;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getTotalPontos() {
        return totalPontos;
    }

    public void setTotalPontos(int totalPontos) {
        this.totalPontos = totalPontos;
    }
    
    
}
