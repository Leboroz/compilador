/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.sql.*;


/**
 *
 * @author Leonardo
 */
public class sql {
    private Connection c;
    private Statement st;
    
    private final String dri;
     private final String url;
    
    private ResultSet rs;
    private String letras;
    private String numeros;
    private String se;
    private String operadores;
    private String separadores;

    public sql() {
        this.dri = "sun.jdbc.odbc.JdbcOdbcDriver";
        this.url = "jdbc:ucanaccess://G:\\Database1.accdb";
    }
    
    
    
    public void obtenerConeccion(){
        try{
            c= DriverManager.getConnection(url);
        }catch(Exception ex){
            
        }
        try{
            this.st = this.c.createStatement();
            String query = "select * from Datos";
            rs = st.executeQuery(query);
            while(rs.next()){
                this.letras = rs.getString("Letras");
                this.numeros = rs.getString("Numeros");
                this.se = rs.getString("Simbolos Especiales");
                this.separadores = rs.getString("Separadores");
               this.operadores = rs.getString("Operadores");
            }
        }catch(Exception e){
            
        }
    }   
}
