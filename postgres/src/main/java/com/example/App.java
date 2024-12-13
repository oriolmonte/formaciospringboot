package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public final class App {
    private App() {
    }
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "omontepostgres0495";
        String sSQL = "INSERT INTO STUDENT VALUES (?,?,?)";
        try(
            Connection con = DriverManager.getConnection(url,uname,pass);
        )
        {   
            PreparedStatement st = con.prepareStatement(sSQL);
            st.setInt(1, 2);
            st.setString(2, "Pepito");
            st.setInt(3, 0);
            st.execute();
            
        }
        catch (Exception e)
        {
        }
    }
}
