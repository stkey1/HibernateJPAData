package Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

@Entity(name = "ogrenci")
@Data
@Table(name = "ogrenci")
@NoArgsConstructor
public class Ogrenci {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "donem")
    private Integer donem;

    @OneToOne
    @JoinColumn(name = "addres_id", referencedColumnName = "id")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Address address;

    @OneToOne
    @JoinColumn(name = "identity_id", referencedColumnName = "id")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Identity identity;

    @ManyToOne
    @JoinColumn(name = "ders_id",nullable = false)
    private Ders ders;

    @ManyToOne
    @JoinColumn(name = "ogretmen_id",nullable = false)
    private Ogretmen ogretmen;

    public Ogrenci(String name, String surname, int donem, Address address, Identity identity, Ders ders, Ogretmen ogretmen){
        this.name = name;
        this.surname = surname;
        this.donem = donem;
        this.address = address;
        this.identity = identity;
        this.ders = ders;
        this.ogretmen = ogretmen;
    }

}
