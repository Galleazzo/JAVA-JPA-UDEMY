package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Pessoa;

public class obterUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy");
		EntityManager em = emf.createEntityManager();
		
		Pessoa usuario = em.find(Pessoa.class, 1L);
		System.out.println(usuario.getNome());
		
		
		em.close();
		emf.close();
		
	}

}
