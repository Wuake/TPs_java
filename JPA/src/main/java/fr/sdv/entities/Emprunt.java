package fr.sdv.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "EMPRUNT")
public class Emprunt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "date_debut")
    private LocalDate date_debut;

    @Column(name = "date_fin", nullable = true)
    private LocalDate date_fin;

    @Column(name = "dalai", nullable = true)
    private int delai;

    public void setDate_debut(LocalDate date_debut) {
        this.date_debut = date_debut;
    }

    public void setDate_fin(LocalDate date_fin) {
        this.date_fin = date_fin;
    }

    public void setDelai(int delai) {
        this.delai = delai;
    }

    public void setId_client(Client id_client) {
        this.id_client = id_client;
    }

    public LocalDate getDate_debut() {
        return date_debut;
    }

    public LocalDate getDate_fin() {
        return date_fin;
    }

    public int getDelai() {
        return delai;
    }

    public Client getId_client() {
        return id_client;
    }

    @ManyToOne
    Client id_client;

    @ManyToMany
    @JoinTable( name = "COMPO",
            joinColumns = @JoinColumn( name = "ID_EMP", referencedColumnName = "ID" ),
            inverseJoinColumns = @JoinColumn( name = "ID_LIV", referencedColumnName = "ID" ) )
    Set<Livre> livres;

    public Set<Livre> getLivres() {
        return livres;
    }

    public void setLivres( Set<Livre> livres ) {
        this.livres = livres;
    }

    @Override
    public String toString() {
        return "Emprunt{" + "id=" + id + ", debut=" + date_debut + ", fin=" + date_fin + ", delai=" + delai + '}';
    }


}
