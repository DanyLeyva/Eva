/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App_Menu_Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author numbe
 */
public class Caso_tres {
    
     public static int Usuarios = 1;
     public static String[] Pasatiempos = new String [300];
     
    Connection cn;
    Statement st;
    
    public Connection conexion(){
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
