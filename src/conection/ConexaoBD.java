package conection;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBD {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost/quiz";
    private static final String usuario = "root";
    private static final String senha = "1234";

    //conceta
    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, senha);

        } catch (Exception e) {
            System.out.println("Ta errado inferno");
        }
        return con;
    }
//fecha conexao

    public static void closeConnection(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (Exception e) {
            System.out.println("Ta errado inferno");
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            System.out.println("Ta errado inferno");
        }
    }

}
