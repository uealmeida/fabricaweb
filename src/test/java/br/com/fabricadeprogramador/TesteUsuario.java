package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.UsuarioDAO;

public class TesteUsuario {

	public static void main(String[] args) {
		
		//Criando o usuário
		Usuario usu = new Usuario();
		usu.setNome("João");
		usu.setLogin("jao");
		usu.setSenha("123");
		
		//Cadastrando Usuario
		UsuarioDAO usuDao = new UsuarioDAO();
		usuDao.cadastrar(usu);
		
	}

}
