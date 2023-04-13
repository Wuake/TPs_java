package banque.entities;

import javax.persistence.*;

@Entity
@Table(name = "LivretA")
public class LivretA {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "taux")
    private Double taux;
}
