/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Doreen Midecha
 */
public class conection {

    public Statement con() {
        try {
            //        register driver
            Class.forName("com.mysql.jdbc.Driver");
            //get connection
            Connection conect;
            conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/e_rights", "root", "");
//            prepare statements
            Statement stmt = conect.createStatement();
            return stmt;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(conection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public boolean authenticate(String username, String pass) {
//        System.out.println(username+" "+pass);
        if ("".equals(username) || "".equals(pass)) {
            JOptionPane.showMessageDialog(null, "USERNAME OR PASSWORD CANNOT BE EMPTY", "Login Error ", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            //        var declaration
            String sql;
            sql = "SELECT * FROM e_rights.users WHERE user_name='" + username + "'AND password='" + pass + "'";
            try {
                ResultSet results = new conection().con().executeQuery(sql);
                if (results.equals("")) {
                    JOptionPane.showMessageDialog(null, "INCORRECT USERNAME OR PASSWORD", "login error", JOptionPane.WARNING_MESSAGE);
                    return false;
                } else {
                    return true;
                }

            } catch (SQLException ex) {
                Logger.getLogger(conection.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "NO SUCH USER\n" + ex, "login error", JOptionPane.WARNING_MESSAGE);
                return false;
            }

        }

    }

//    test 
    public static void main(String args[]) {
        conection c = new conection();
        c.con();
    }
}
