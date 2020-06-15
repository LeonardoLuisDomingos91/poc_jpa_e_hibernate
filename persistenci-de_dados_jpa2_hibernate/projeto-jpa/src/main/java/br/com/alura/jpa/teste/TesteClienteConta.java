package br.com.alura.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Cliente;
import br.com.alura.jpa.modelo.Contas;

public class TesteClienteConta {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
	    EntityManager em = emf.createEntityManager();

	        Contas conta = new Contas();
	        conta.setId(1L);

	        Cliente cliente = new Cliente();
	        cliente.setNome("Leonardo");
	        cliente.setEndereco("Rua do Ouvidor, 50");
	        cliente.setProfissao("Professor");
	        cliente.setConta(conta);

	        
	        em.getTransaction().begin();

	        em.persist(cliente);

	        em.getTransaction().commit();
	        em.close();

	}

}
