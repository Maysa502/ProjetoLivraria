package br.com.weblivraria.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.weblivraria.dao.DAOUsuario;
import br.com.weblivraria.dominio.Usuario;

public class TestDaoUsuario {

	// Vamos realizar um testes em todos os metodos ques estão da Classe DAOUsuario

	// vamos começar testanto o cadstro do usuario
//	@Test
//	public void testCadastroUsuario() {
//		// vamos realizar a instancia da classe usuario e aplicar dados ficticios para cadastrar. Esta tecnica é chamada dados mokados
//		Usuario us = new Usuario();
//		us.setNomeusuario("AAng");
//		us.setSenha("5569");
//		us.setEmail("aangavatar@uol.com.jp");
//		us.setNomecompleto("Ang Era");
//		us.setTelefone("11-95478-9632");
//		us.setCpf("542639785-6");
//		
//		//instancia da classe DAOUsuario 
//		DAOUsuario daous = new DAOUsuario();
//		assertEquals("Cadastro realizado", daous.cadastrar(us));
//		
//		
//		
//	}

	/*
	 * @Test public void testListar() { DAOUsuario daous = new DAOUsuario();
	 * List<Usuario> resultado = new ArrayList<Usuario>(); assertEquals(resultado,
	 * daous.listar());
	 * 
	 * }
	 */
	
	/*
	 * @Test public void testAtualizar() { Usuario us_test = new Usuario();
	 * us_test.setIdusuario(1); us_test.setNomeusuario("Yangchen");
	 * us_test.setEmail("avatarchen@uol.com"); us_test.setTelefone("88-6958-7854");
	 * us_test.setNomecompleto("Yangchen Ouro");
	 * 
	 * DAOUsuario daous = new DAOUsuario();
	 * 
	 * assertEquals("Atualização realizada", daous.atualizar(us_test)); }
	 */

	@Test
	public void testLogin() {
		Usuario us = new Usuario();
		us.setNomeusuario("Yangchen");
		us.setSenha("5569");
		
		DAOUsuario daous = new DAOUsuario();
		assertTrue(daous.login(us));
		
	}
}
