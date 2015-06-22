package br.com.fabricadeprogramador.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.Conexao;

public class UsuarioDAO {
	private Connection con = Conexao.getConn();
	
	public void cadastrar(Usuario usuario){
		
		//Monta String SQL
		String sql = "INSERT INTO USUARIO (nome, login, senha) values(?,?,?)";
		
		try {
			
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Usuário cadastrado com sucesso!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
