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
        address.setSokak("Aşağı");
        address.setPostaKodu("334");
        address.setCadde("123");
        address.setIlce("Keçiören");
        address.setKapiNo(12);

        Address address1 = new Address();
        address1.setIlce("Pursaklar");
        address.setSokak("AşağıYurtçu");
        address.setPostaKodu("1334");
        address.setCadde("1123");
        address.setKapiNo(12);

        Identity identity = new Identity();
        identity.setIdentity(21313);

        Identity identity1 = new Identity();
        identity1.setIdentity(1121313);

        Ders ders = new Ders();
        ders.setDers("Matematik");
        Ders ders1 = new Ders();
        ders1.setDers("Türkçe");

        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setName("Mahmut");
        //ogretmen-öğrenci olması lazım
        ogretmen.setSurName("M");
        ogretmen.setDers(ders);

        Ogretmen ogretmen2 = new Ogretmen();
        ogretmen2.setName("Mahmut1");
        //ogretmen-öğrenci olması lazım
        ogretmen2.setSurName("M1");
        ogretmen2.setDers(ders1);

        //address.getOgrenci().getAddress(), identity.getOgrenci().getIdentity(), ders.getDers(), ogretmen.getIdentity().getOgretmen()
        Ogrenci ogrenci = new Ogrenci("Mustafa", "Dere", 2,address, identity, ders, ogretmen );
        Ogrenci ogrenci2 = new Ogrenci("Mustafa2", "Dere2", 3, address1, identity1, ders, ogretmen2);
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
