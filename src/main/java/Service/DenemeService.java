package Service;

import Entity.*;
import Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

public class DenemeService {
    public void add(){

        //Creating identity entity

        //Creating Ders entity

        //Creating Ogretmen entity


        //Session opened
        Session session=HibernateUtil.getSessionFactory().openSession();
        //Transaction has been created before objects saved
        Transaction tx= session.beginTransaction();

        //Objects have saved






        //commit transaction


        //session closed

    }


}