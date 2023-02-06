package Service;

import Entity.Address;
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
public class AddressService {
    public void add(){
        Address address = new Address();
        address.setIlce("Keçiören");
        address.setCadde("225");
        address.setKapiNo(2);
        address.setPostaKodu("123");
        address.setSokak("555");
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        session.persist(address);
        tx.commit();
        session.close();
    }
}
