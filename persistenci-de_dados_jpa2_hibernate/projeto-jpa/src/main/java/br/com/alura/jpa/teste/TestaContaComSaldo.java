package br.com.alura.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Contas;

public class TestaContaComSaldo {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Contas conta = new Contas();
        conta.setTitular("Juliano");
        conta.setAgencia(54321);
        conta.setConta(12345);
        conta.setSaldo(500.0);

        em.getTransaction().begin();

        em.persist(conta);

        em.getTransaction().commit();

	}

}
