package fr.sdv.JPA;

import fr.sdv.entities.Livre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpJPA");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        Livre livre1 = new Livre();
        livre1.setAuteur("Franck Dubosc");
        livre1.setTitre("Le Slip");
        em.persist(livre1);

        Livre livre2 = em.find(Livre.class, 5);
        System.out.println(livre2);

        transaction.begin();
        transaction.commit();
        em.close();
        emf.close();
    }
}
