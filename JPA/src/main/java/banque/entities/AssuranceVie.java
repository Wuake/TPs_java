package banque.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "AssuranceVie")
public class AssuranceVie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "date_fin")
    private LocalDateTime date_fin;
    @Column(name = "taux")
    private Double taux;

}
