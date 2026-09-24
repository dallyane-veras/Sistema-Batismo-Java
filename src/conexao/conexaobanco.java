/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import static java.lang.Class.forName;
import java.sql.Connection;

import java.sql.*;

/**
 *
 * @author Dailiane
 */
public class conexaobanco {

  
    //CONEXÃO COM O BANCO DE DADOS
    public static Connection conector() {
    java.sql.Connection conexao = null;
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/db_batismo?zeroDateTimeBehavior=convertToNull";
    String user = "root";
    String password = "";
    
    //ESTABELECENDO A CONEXAO
    try {
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, user, password);
        return conexao;
    } catch(Exception e){
       //System.out.println(e);
        return null;
    }

}

    static Connection getConexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}