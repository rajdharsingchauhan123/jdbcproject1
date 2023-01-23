package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args)  {
        System.out.println("project started");

        Configuration cfg =new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();

        Student st=new Student();
        st.setId(2);

        st.setCity("banda");
        st.setName("rajdhar");

        System.out.println(st);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        // delete object
//        st.setId(5);

//        session.delete(st);
        tx.commit();

        session.close();

//        System.out.println(factory.isClosed());
    }
}