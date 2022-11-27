package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Pessoa;

public class NovoUsuario {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy");
		EntityManager em = emf.createEntityManager();
		
		Pessoa novoUser = new Pessoa("Carlos", "carlos@gmail.com");
		novoUser.setId(1L);
		
		
		em.persist(novoUser);

		em.close();
		emf.close();		
		
	}
	
}
