package banque.entities;

import javax.persistence.*;

@Entity
@Table(name = "Virement")
public class Virement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "beneficiaire")
    private String beneficiaire;

}
