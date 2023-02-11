package Service;

import Entity.Ders;
import Entity.Ogretmen;
import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author stkey
 * @customize
 * @add
 * @components
 * @throws
 * @return
 * @since 6.02.2023
 */
@Service
public class OgretmenService {
    public void add(){
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setName("Hasan");
        ogretmen.setSurName("Huseyin");

        Ogretmen ogretmen2 = new Ogretmen();
        ogretmen2.setSurName("selami");
        ogretmen2.setName("selam");

        Ders ders = new Ders();
        ders.setDers("Matematik");

        ogretmen.setDers(ders);
        ogretmen2.setDers(ders);

        Set<Ogretmen> ogretmenSet = new HashSet<>();
        ogretmenSet.add(ogretmen);
        ogretmenSet.add(ogretmen2);
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        session.persist(ogretmen);
        session.persist(ogretmen2);
        tx.commit();
        session.close();
    }
}
