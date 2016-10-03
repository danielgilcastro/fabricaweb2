package fabricaweb2;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.fabricadeprogramador.entidade.Usuario;

public class TestSpringBeans {

	@Test
	public void testContextoSpring(){		
	ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("file:src/main/resources/META-INF/springbeans.xml");
		
		
	BasicDataSource bds =(BasicDataSource) ctx.getBean("dataSource");	
//		System.out.println(bds.getDriverClassLoader());		
//		ctx.close();

		Usuario usu = (Usuario) ctx.getBean("usuario");
	
		System.out.println(usu.getLogin());
	}
	
}
