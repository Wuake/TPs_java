package fr.sdv.JPA;

import banque.entities.*;
import org.checkerframework.checker.units.qual.A;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestBanque {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("tpJPA");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        Compte compte1 = new Compte();
        compte1.setNumero("#NIQUEMACRON");
        compte1.setSolde(49.3);
        em.persist(compte1);

        Client_ client1 = new Client_();
        client1.setNom("Manu");
        client1.setPrenom("FDP");
        em.persist(client1);

        Operation ope1 = new Operation();
        ope1.setDate(LocalDate.from(LocalDateTime.now()));
        ope1.setMontant(3.49);
        ope1.setMotif("explosion");
        em.persist(ope1);

        Banque banque1 = new Banque();
        banque1.setNom("Bitcoin");
        em.persist(banque1);

        Adresse add1 = new Adresse();
        add1.setNumero(12);
        add1.setRue("Soiffe");
        add1.setCode_postal(35200);
        add1.setVille("Rennes");
        em.persist(add1);

        transaction.begin();
        transaction.commit();
        em.close();
        emf.close();
    }
}
