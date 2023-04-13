package banque.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Operation")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name="date")
    private LocalDate date;
    @Column(name = "montant")
    private Double montant;
    @Column(name = "motif")
    private String motif;

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getMontant() {
        return montant;
    }

    public String getMotif() {
        return motif;
    }
}
