package Service;

import Entity.Ders;
import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

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
public class DersService {
    public void add(){
        Ders ders = new Ders();
        ders.setDers("Matematik");
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        session.persist(ders);
        tx.commit();
        session.close();
    }
}
