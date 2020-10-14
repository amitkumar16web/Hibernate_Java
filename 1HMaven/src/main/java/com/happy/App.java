package com.happy;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Friends :)" );
      
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fctr = cfg.buildSessionFactory();
     //  SessionFactory fctr = new Configuration().configure().buildSessionFactory();
        
     // creating student
        Student st = new Student();
        st.setId(67);
        st.setName("Amit");
        st.setEmail("amit@gmail.com");
        st.setCity("Dibrugarh");
        System.out.println(st);
        
        Session ses=fctr.openSession();
        
        ses.beginTransaction();
        ses.save(st);
        ses.getTransaction().commit();
        ses.close();
        
    }
}
