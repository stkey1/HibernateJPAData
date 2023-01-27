package Entity;

import jakarta.persistence.*;

@Entity
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

    public Integer getIdentity() {
        return identity;
    }

    public void setIdentity(Integer identity) {
        this.identity = identity;
    }
}
