package service;

        import entity.BaseEntity;
        import entity.impl.Event;
        import entity.impl.MediaRef;
        import entity.impl.Note;
        import entity.impl.NoteRef;
        import org.hibernate.Session;
        import org.hibernate.SessionFactory;
        import org.hibernate.Transaction;
        import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
        import org.hibernate.cfg.Configuration;
        import org.hibernate.service.ServiceRegistry;
        import org.jboss.logging.Logger;

        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.HashSet;
        import java.util.Set;

/**
 * Created by SBT-Yakubovsky-DN on 25.12.2017.
 */

public class AppClass {


    private static final Logger LOGGER = Logger.getLogger(AppClass.class);
    static DateFormat df = new SimpleDateFormat("DD/MM/YYYY");

    public static void main(String[] args) {
        try {


            Note note =  new Note();
            note.setFormat("1");
            note.setChange("2");
            note.setText("3");
            note.setType("4");
            note.setUid(123);
            abstractPersist(note);


            Set<NoteRef> nf  = new HashSet<>();
            Set<MediaRef> mf  = new HashSet<>();
            Event event = new Event();
            event.setChange("1");
            event.setDate(df.parse("01/01/2018"));
            event.setDescription("adf");
            event.setType("trim");
            event.setMedia_ref(mf);
            event.setNote_list(nf);
            event.setUid(123);
            abstractPersist(event);

        } catch (Exception e) { LOGGER.log(Logger.Level.INFO, e.getMessage(),e);  }
    }


    private static <T extends BaseEntity> void abstractPersist(T in) throws Exception{

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

        } catch (Exception e) {
            if  (session.getTransaction().isActive()){
                session.getTransaction().rollback();
            }
            throw e;

        }
    }



}
