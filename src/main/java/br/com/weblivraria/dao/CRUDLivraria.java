package br.com.weblivraria.dao;

public interface CRUDLivraria<T> {
	String cadastrar(T dados);
	List <T> listar();
	T pesquisar(T dados);
	String atualizar(T dados);
	String apagar(Integer id);
	

}
