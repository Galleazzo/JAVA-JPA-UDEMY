package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Pessoa;

public class NovoUsuario {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy");
		EntityManager em = emf.createEntityManager();
		
		Pessoa novoUser = new Pessoa("Paulo", "paulo@gmail.com");
		novoUser.setId(1L);
		
		em.getTransaction().begin();
		em.persist(novoUser);
		em.getTransaction().commit();
		
		em.close();
		emf.close();		
		
	}
	
}
