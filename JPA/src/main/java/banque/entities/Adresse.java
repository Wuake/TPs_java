package banque.entities;

import javax.persistence.*;

@Embeddable
@Entity
@Table(name = "Adresse")
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "numero")
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setCode_postal(int code_postal) {
        this.code_postal = code_postal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Column(name = "rue")
    private String rue;

    public int getNumero() {
        return numero;
    }

    public String getRue() {
        return rue;
    }

    public int getCode_postal() {
        return code_postal;
    }

    public String getVille() {
        return ville;
    }

    @Column(name = "code_postal")
    private int code_postal;
    @Column(name = "ville")
    private String ville;
}
