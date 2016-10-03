package fabricaweb2;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.fabricadeprogramador.dao.UsuarioDAO;
import br.com.fabricadeprogramador.entidade.Usuario;

public class TestHibernate {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/META-INF/springbeans.xml");			
//		EntityManager em  = ((EntityManagerFactory)ctx.getBean("entityManagerFactory")).createEntityManager();

		EntityManager em = Persistence.createEntityManagerFactory("fabricaweb2").createEntityManager();		
		
		UsuarioDAO usudao = new UsuarioDAO();
		
		System.out.println(usudao.buscarPorId(14));
		
	}

}
