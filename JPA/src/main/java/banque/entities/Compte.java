package banque.entities;

import javax.persistence.*;

@Entity
@Table(name = "Compte")
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "numero")
    private String numero;
    @Column(name = "solde")
    private Double solde;

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSolde() {
        return solde;
    }
}
