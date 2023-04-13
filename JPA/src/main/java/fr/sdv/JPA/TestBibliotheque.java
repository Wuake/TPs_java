package fr.sdv.JPA;

import fr.sdv.entities.Livre;

import javax.persistence.*;
import java.util.List;

public class TestBibliotheque {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpJPA");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        //Tous les livres d'un emprunt

        Query query_emprunt = em.createQuery("SELECT e FROM Emprunt e WHERE id = :id");
        query_emprunt.setParameter("id", 3);
        List<Livre> livres = query_emprunt.getResultList();
        System.out.println(livres);

        transaction.begin();
        transaction.commit();
        em.close();
        emf.close();
    }
}
