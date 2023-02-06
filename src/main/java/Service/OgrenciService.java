package Service;

import Entity.*;
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
public class OgrenciService {
    public void add(){
        Address address = new Address();
        Identity identity = new Identity();
        Ders ders = new Ders();
        Ogretmen ogretmen = new Ogretmen();
        //address.getOgrenci().getAddress(), identity.getOgrenci().getIdentity(), ders.getDers(), ogretmen.getIdentity().getOgretmen()
        Ogrenci ogrenci = new Ogrenci("Mustafa", "Dere", 2,address, identity, ders, ogretmen );
        Ogrenci ogrenci2 = new Ogrenci("Mustafa2", "Dere2", 3, address, identity, ders, ogretmen);
        Set<Ogrenci> ogrenciSet=new HashSet<>();
        ogrenciSet.add(ogrenci);
        ogrenciSet.add(ogrenci2);
        Session session= HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        session.persist(ogrenci);
        session.persist(ogrenci2);
        tx.commit();
        session.close();

    }
}
