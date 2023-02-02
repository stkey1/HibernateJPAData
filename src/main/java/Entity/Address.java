package Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cadde")
    private String cadde;

    @Column(name = "sokak")
    private String sokak;

    @Column(name = "kapiNo")
    private Integer kapiNo;


    @OneToOne(mappedBy = "address")
    private Ogrenci ogrenci;

    @OneToOne(mappedBy = "address")
    private Ogretmen ogretmen;

    private String ilce;

    private String postaKodu;

    @Transient
    private String postaKodu2;

}

