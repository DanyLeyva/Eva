/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Menu_Clases;

import java.sql.*;
import App_Menu_Clases.ConexionBD;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Edicion: 11/07/2022 
 * @author Maturana
 */
public class Caso_uno {
    
    public static int Usuarios = 1;
    java.sql.Connection cn;
    Statement st;
    
    public java.sql.Connection conexion(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    cn = DriverManager.getConnection("jdbc:mysql://localhost/eva_prototipo","root","");
        System.out.println("Se hizo la conexixon exitosa");
    
    }catch(Exception e){System.out.println(e.getMessage());}
    return cn;
    }

    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
  
}
