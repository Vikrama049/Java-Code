
// Java Program to Illustrate App File
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
// Main class
public class App {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Create Configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Song.class);
 
        // Create Session Factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
 
        // Initialize Session Object
        Session session = sessionFactory.openSession();
 
        Song song1 = new Song();
 
        song1.setId(2);
        song1.setSongName("mana ki hum yaar nahi");
        song1.setArtist("parineeti chopra");
 
        session.beginTransaction();
 
        // Here we have used
        // save() method of JPA
        session.save(song1);
 
        session.getTransaction().commit();
    }
}
