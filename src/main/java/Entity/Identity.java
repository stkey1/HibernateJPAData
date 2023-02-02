package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "identity")
public class Identity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "identity")
    private Integer identity;

    @OneToOne
    private Ogrenci ogrenci;

    @OneToOne
    private Ogretmen ogretmen;
}
