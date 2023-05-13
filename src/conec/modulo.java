/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conec;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Arlindo Halar
 */
public class modulo {

    public static Connection conector(){
        
        Connection conexao = null;
        
        String driver = "com.mysql.jdbc.Driver";
        
        String url = "jdbc:mysql://localhost:3306/reca";
        String user = "root";
        String pass = "";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, pass);
            return conexao;
        } catch (Exception e) {
        
            return null;
        }
    
}
    
}
