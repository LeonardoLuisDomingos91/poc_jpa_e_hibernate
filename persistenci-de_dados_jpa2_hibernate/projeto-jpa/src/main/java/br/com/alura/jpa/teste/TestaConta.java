package br.com.alura.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Contas;

public class TestaConta {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Contas conta = new Contas();
        conta.setTitular("Leonardo");
        conta.setAgencia(4321);
        conta.setConta(1234);

        em.getTransaction().begin();

        em.persist(conta);

        em.getTransaction().commit();

	}

}
