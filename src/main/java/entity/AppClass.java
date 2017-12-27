package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

/**
 * Created by SBT-Yakubovsky-DN on 25.12.2017.
 */
public class AppClass {


        public static void main(String[] args) {
            try {
                EntityManagerFactory factory = Persistence.createEntityManagerFactory("H2");
                EntityManager theManager = factory.createEntityManager();
                theManager.getTransaction().begin();
                Person person = new Person();
                person.setPrimary_name("Anna");
                theManager.persist(person);
                theManager.getTransaction().commit();


            } catch (PersistenceException e) {
                e.printStackTrace();
            }
        }
}
