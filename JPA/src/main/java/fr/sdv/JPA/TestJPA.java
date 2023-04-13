package fr.sdv.JPA;

import fr.sdv.entities.Livre;

import javax.persistence.*;
import java.util.List;

public class TestJPA {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpJPA");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        //insertion
        Livre livre1 = new Livre();
        livre1.setAuteur("Franck Dubosc");
        livre1.setTitre("Le Slip");
        em.persist(livre1);

        //recherche
        Livre livre2 = em.find(Livre.class, 5);
        System.out.println(livre2);

        //modification
        //je sais que j'aurais pu prendre le livre 2, c'est volontaire
        Livre livre3 = em.find(Livre.class, 5);
        livre3.setTitre("Du plaisir dans la cuisine");
        em.persist(livre3);

        //JPQL-1
        Query query = em.createQuery("SELECT l FROM Livre l WHERE l.auteur = :auteur", Livre.class);
        query.setParameter("auteur","Jules Verne");
        List<Livre> livres = query.getResultList();
        System.out.println(livres);

        //JPQL-2
        Query query2 = em.createQuery("SELECT l FROM Livre l WHERE l.titre = :titre", Livre.class);
        query2.setParameter("titre","Germinal");
        List<Livre> livres2 = query2.getResultList();
        System.out.println(livres2);

        //suppression
        Livre livre_suppr = em.find(Livre.class, 7);
        if (livre_suppr != null){
            em.remove(livre_suppr);
        }

        //tous les bouquins
        Query query_livres = em.createQuery("SELECT l FROM Livre l", Livre.class);
        List<Livre> livres3 = query_livres.getResultList();
        System.out.println(livres3);

        transaction.begin();
        transaction.commit();
        em.close();
        emf.close();
    }
}
