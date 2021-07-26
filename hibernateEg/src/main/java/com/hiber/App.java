package com.hiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        
        //creating Students
        
        Student st = new Student();
        st.setId(106);
        st.setName("Sayan");
        st.setCourse("MCA");
        st.setMobNo(875000);
        st.setCity("Dwarka");
        System.out.println(st);
        
        //Session
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit();
        session.close();
        
        
    }
}
