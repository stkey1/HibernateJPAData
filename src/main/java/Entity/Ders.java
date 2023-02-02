package Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "ders")
public class Ders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "ders", nullable = false)
    private String ders;

    @OneToMany(mappedBy = "ders")
    private Set<Ogrenci> ogrenci;

    @OneToMany(mappedBy = "ders")
    private Set<Ogretmen> ogretmen;


}
