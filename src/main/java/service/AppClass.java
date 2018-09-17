package service;

import entity.BaseEntity;
import entity.impl.Note;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.jboss.logging.Logger;

/**
 * Created by SBT-Yakubovsky-DN on 25.12.2017.
 */

public class AppClass<T extends BaseEntity> {


    private static final Logger LOGGER = Logger.getLogger(AppClass.class);


    public static void main(String[] args) {

        SessionFactory sessionFactory = null;

        Session session = null;
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Note.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            configuration.configure();
            session = sessionFactory.openSession();
            persist(session);
            session.close();
        } catch (Exception e) { LOGGER.log(Logger.Level.INFO, e.getMessage(),e);  }
    }

    private static void persist(Session session) throws Exception{
        try{
            Transaction transaction = session.getTransaction();
            transaction.begin();
            Note note =  new Note();
            note.setFormat("1");
            note.setChange("2");
            note.setText("3");
            note.setType("4");
            note.setUid(123);
            session.save(note);
            transaction.commit();

        } catch (Exception e) {
            if (session.getTransaction().isActive()){
                session.getTransaction().rollback();
            }
            throw e;

        }
    }

    private void abstractPersist(Session session, T in) throws Exception{
        try{
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.save(in);
            transaction.commit();

        } catch (Exception e) {
            if (session.getTransaction().isActive()){
                session.getTransaction().rollback();
            }
            throw e;

        }
    }
}
