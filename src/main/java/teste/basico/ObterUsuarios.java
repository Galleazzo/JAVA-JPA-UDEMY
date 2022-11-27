package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Pessoa;

public class ObterUsuarios {

public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-udemy");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select u from Pessoa u";
		TypedQuery<Pessoa> query = em.createQuery(jpql, Pessoa.class);
		query.setMaxResults(5);
		
		List<Pessoa> usuarios = query.getResultList();
		
		usuarios.forEach(usuario ->{
			System.out.println("ID: "+usuario.getId()+"		Nome: "+usuario.getNome()+" 	Email: "+usuario.getEmail());;
		});
		
		
		em.close();
		emf.close();
		
	}
	
}
