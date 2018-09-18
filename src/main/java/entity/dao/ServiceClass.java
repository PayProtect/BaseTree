package entity.dao;

import entity.BaseEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class ServiceClass {



    public static <T extends BaseEntity> void saveObj(T in) throws Exception{

        SessionFactory sessionFactory = null;
        Session session = null;

        try{ Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(in.getClass());
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            configuration.configure();
            session = sessionFactory.openSession();
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.save(in);  // saving object
            transaction.commit();
            session.close();
            sessionFactory.close();

        }
        catch (Exception e) {
            if  (session.getTransaction().isActive()&&session.getTransaction()!=null){
                session.getTransaction().rollback();
            }
            throw e;
        }
        finally {
            if(session!=null && session.isOpen())
            {
                session.close();
            }
        }
    }



    public static <T extends BaseEntity> void deleteObj(T in) throws Exception{

        SessionFactory sessionFactory = null;
        Session session = null;

        try{ Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(in.getClass());
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            configuration.configure();
            session = sessionFactory.openSession();
            Transaction transaction = session.getTransaction();
            transaction.begin();
            session.delete(in);
            transaction.commit();
            session.close();
            sessionFactory.close();

        }
        catch (Exception e) {
            if  (session.getTransaction().isActive()&&session.getTransaction()!=null){
                session.getTransaction().rollback();
            }
            throw e;
        }
        finally {
            if(session!=null && session.isOpen())
            {
                session.close();
            }
        }
    }





}
