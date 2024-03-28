package br.com.weblivraria.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.weblivraria.dao.DAOUsuario;
import br.com.weblivraria.dominio.Usuario;

public class TestDaoUsuario {
	
	// Vamos realizar um testes em todos os metodos ques estão da Classe DAOUsuario 
	
	// vamos começar testanto o cadstro do usuario 
	@Test
	public void testCadastroUsuario() {
		// vamos realizar a instancia da classe usuario e aplicar dados ficticios para cadastrar. Esta tecnica é chamada dados mokados
		Usuario us = new Usuario();
		us.setNomeusuario("Yangchen");
		us.setSenha("5569");
		us.setEmail("avatar.yang@uol.com.jp");
		us.setNomecompleto("Yangchen Era");
		us.setTelefone("11-963258741");
		us.setCpf("569874136-9");
		
		//instancia da classe DAOUsuario 
		DAOUsuario daous = new DAOUsuario();
		assertEquals("Cadastro realizado", daous.cadastrar(us));
		
		
		
	}

}
