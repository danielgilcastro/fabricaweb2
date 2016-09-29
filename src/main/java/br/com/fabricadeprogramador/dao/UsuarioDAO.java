package br.com.fabricadeprogramador.dao;

import java.util.List;

import javax.management.Query;
import javax.persistence.*;

import br.com.fabricadeprogramador.entidade.Usuario;

public class UsuarioDAO {
	
	//aplicationcontext.xml
	
	EntityManager em;	
		
	public UsuarioDAO(EntityManager em) {
		this.em = em;
	}
	
	public void salvar(Usuario usuario) {
		em.getTransaction().begin();
		em.merge(usuario);
		em.getTransaction().commit();
		
	}
	
	public void excluir(Usuario usuario){
		em.getTransaction().begin();
		em.remove(usuario);
		em.getTransaction().commit();
	}
	
	public Usuario buscarPorId(int id){
		return em.find(Usuario.class, id);
	}
	
	public List<Usuario> buscarTodos(){			
		return em.createQuery("select u from Usuario u").getResultList();
	}
	

	
	
}
