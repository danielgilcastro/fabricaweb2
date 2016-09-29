package fabricaweb2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fabricadeprogramador.dao.UsuarioDAO;
import br.com.fabricadeprogramador.entidade.Usuario;

public class TestHibernate {

	public static void main(String[] args) {

	EntityManager em = Persistence.createEntityManagerFactory("fabricaweb2").createEntityManager();
		
		UsuarioDAO usudao = new UsuarioDAO(em);
		Usuario usuario = usudao.buscarPorId(12);
		usudao.excluir(usuario);
		
	}

}
