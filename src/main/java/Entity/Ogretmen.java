package Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

import java.util.Set;


@Entity
@Data
@Table(name = "ogretmen")
public class Ogretmen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @OneToOne
    @JoinColumn(name = "identity_id", referencedColumnName = "id")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Identity identity;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "ogretmen")
    private Set<Ogrenci> ogrenci;

    @ManyToOne
    @JoinColumn(name = "ders_id",nullable = true)
    private Ders ders;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surname;
    }

    public void setSurName(String surname) {
        this.surname = surname;
    }



}
