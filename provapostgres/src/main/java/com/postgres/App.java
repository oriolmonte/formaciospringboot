package com.postgres;

import java.sql.Connection;
import java.sql.DriverManager;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {            
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pass = "omontepostgres0495";
        
        try(
            Connection con = DriverManager.getConnection(url,uname,pass);
            )
            {

            }
        
        catch (Exception e)
        {
        }
        

    }
}
