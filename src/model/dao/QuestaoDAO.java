package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import conection.ConexaoBD;
import java.util.HashMap;
import java.util.Map;
import model.bean.Inicio;
import model.bean.Questoes;

public class QuestaoDAO {

    HashMap<Integer, String> questoes = new HashMap<>();
    Inicio inicio = new Inicio();

    public void create(Inicio inicio) {
        Connection con = ConexaoBD.conectar();
        PreparedStatement stmt = null;

        //o id do jogador vai fica vazio, entao depois vc tem q colocar o valor dele 
        //baseado no q ta com o nick corespondente na tabela jogador
        try {
            stmt = con.prepareStatement("INSERT INTO jogo(dificuldade, totalQuestoes, tema) VALUES (?,?,?)");
            stmt.setInt(1, inicio.getDificuldade());
            stmt.setInt(2, inicio.getQuantidade());
            stmt.setInt(3, inicio.getTema());

            stmt.executeUpdate();
            System.out.println("Salvo com sucesso no banco de dados");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Erro conexão com banco");

        } finally {
            ConexaoBD.closeConnection(con, stmt);
        }

    }

    public HashMap<Integer, String> carrega(int dificuldade, int tema) {
        Connection con = ConexaoBD.conectar();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("select idquestao,enunciadoquestao from questao where dificuldade=" + dificuldade + " and tema=" + tema);

            //retorna a tabela
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                //faz o carregamentio do array
                Questoes questao = new Questoes();
                questao.setIdquestao(rs.getInt("idquestao"));
                questao.setEnunciadoquestao(rs.getString("enunciadoquestao"));

                questoes.put(questao.getIdquestao(), questao.getEnunciadoquestao());

                for (Map.Entry<Integer, String> elemento : questoes.entrySet()) {
                    System.out.println(elemento.getKey() + ":" + elemento.getValue());
                }

            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return questoes;
    }

    public void limpaMap() {
        questoes.clear();
        System.out.println("limpo");
    }

    

//    public void escrever() {
//        Questoes questao = new Questoes();
//        Connection con = ConexaoBD.conectar();
//        PreparedStatement stmt = null;
//        ResultSet rs = null;
//
//        try {
//
//            stmt = con.prepareStatement("select enunciadoquestao from questao where dificuldade=1 and tema=1");
//            stmt.get
//            //stmt = con.prepareStatement(sql);
//
//            stmt.executeQuery();
//            System.out.println("Encontrado com sucesso no banco de dados");
//
//        } catch (Exception e) {
//            System.out.println("tudo errado dificuldade");
//            System.out.println(e);
//
//        } finally {
//            ConexaoBD.closeConnection(con, stmt, rs);
//        }
//    }
//    public void soteioQuestao(){
//         //pecorre a tabela atras da quantidade de questoes pedidas
//            for (int cont = 0; cont > inicio.getQuantidade(); cont++) {
//                //fazer o random escolher questoes ate a quantidade ser suprida
//                //           sql=con.prepareStatement("SELECT ROW_NUMBER()");
//                //System.out.println(sql)o
//                System.out.println("deu ceto fiunca ali");
//            }
//    }
    /*
    public ArrayList<Questoes> read() {
        Connection con = ConexaoBD.conectar();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        ArrayList<Questoes> questao = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM jogador");
            rs = stmt.executeQuery();

            while (rs.next()) {
                //question=classe
                //questao=array
                Questoes question = new Questoes();

                question.setEnunciadoquestao(rs.getString("enunciadoquestao"));
                question.setDificuldade(rs.getInt("dificuldade"));

                questao.add(question);
            }

        } catch (Exception e) {
            
            System.out.println("erro read");
            System.out.println(e);
        } finally {
            ConexaoBD.closeConnection(con, stmt, rs);
        }

        return questao;
    }
     */
}
