package Service;

import Entity.*;
import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class DenemeService {
    public void add(){
        //Creating address entity
        Address address = new Address();
        address.setIlce("Keçiören");
        address.setCadde("225");
        address.setKapiNo(2);
        address.setPostaKodu("123");
        address.setSokak("555");
        //Creating identity entity
        Identity identity = new Identity();
        identity.setIdentity(100318293);
        //Creating Ders entity
        Ders ders = new Ders();
        ders.setDers("Matematik");
        //Creating Ogretmen entity
        Ogretmen ogretmen = new Ogretmen();
        ogretmen.setName("Hasan");
        ogretmen.setSurName("Huseyin");
        Ogretmen ogretmen2 = new Ogretmen();
        ogretmen2.setSurName("selami");
        ogretmen2.setName("selam");

        Set<Ogretmen> ogretmenSet = new HashSet<>();
        ogretmenSet.add(ogretmen);
        ogretmenSet.add(ogretmen2);

        Ogrenci ogrenci = new Ogrenci("Mustafa", "Dere", 2, address, identity, ders, ogretmen);
        Ogrenci ogrenci2 = new Ogrenci("Mustafa2", "Dere2", 3, address, identity, ders, ogretmen);

        Set<Ogrenci> ogrenciSet=new HashSet<>();
        ogrenciSet.add(ogrenci);
        ogrenciSet.add(ogrenci2);



        //Session opened
        Session session=HibernateUtil.getSessionFactory().openSession();
        //Transaction has been created before objects saved
        Transaction tx= session.beginTransaction();

        //Objects have saved
        session.persist(address);
        session.persist(identity);
        session.persist(ders);
        session.persist(ogretmen);
        session.persist(ogrenci);
        session.persist(ogrenci2);

        //commit transaction
        tx.commit();

        //session closed
        session.close();
    }


}