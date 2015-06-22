package br.com.fabricadeprogramador.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection getConn(){
		
		Connection con = null;
			
		try {
			
			Class.forName("org.postgresql.Driver"); //Força o garregamento do driver
			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/banco-cjweb1","postgres", "postgres");
			System.out.println("Conectado com Sucesso");
			
		} catch (SQLException e) {
				
			System.out.println("Não foi possível conectar:" + e.getMessage());
	
		} catch (ClassNotFoundException e) {
		
			System.out.println("Driver não localizado!");
			
		}		
	
		return con;
	}
	
}
