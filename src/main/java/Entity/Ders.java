package Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
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

    public  String getDers(){
        return ders;
    }

    public void setDers(String ders){
        this.ders = ders;
    }

    public Integer getId() {
        return id;
    }

}
