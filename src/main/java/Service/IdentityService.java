package Service;

import Entity.Identity;
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
public class IdentityService {
    public void add(){
        Identity identity = new Identity();
        identity.setIdentity(100318293);
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        session.persist(identity);
        tx.commit();
        session.close();
    }
}
