package br.com.alura.jpa.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Contas;

public class AlteraSaldoContaLeonardo {

	public static void main(String[] args) {
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
	        EntityManager em = emf.createEntityManager();

	        Contas contaDoLeonardo = em.find(Contas.class, 1L);

	        em.getTransaction().begin();

	        contaDoLeonardo.setSaldo(20.0);

	        em.getTransaction().commit();

	}

}