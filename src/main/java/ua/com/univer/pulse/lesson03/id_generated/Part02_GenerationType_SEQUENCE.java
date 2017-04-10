package ua.com.univer.pulse.lesson03.id_generated;

import org.hibernate.SessionFactory;
import ua.com.univer.pulse.lesson03.id_generated.entity.sequence.Address;
import ua.com.univer.pulse.lesson03.id_generated.entity.sequence.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by IShklyar on 10.04.2017.
 */
public class Part02_GenerationType_SEQUENCE {

    public static void main(String[] args) {
        SessionFactory sessionFactory =
                (SessionFactory) Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        EntityManager entityManager = sessionFactory.createEntityManager();

        entityManager.getTransaction().begin();

        User user = new User();
        user.setName("Petya");
        user.setLastName("Petrov");
        entityManager.persist(user);

        User user1 = new User();
        user1.setName("Petya1");
        user1.setLastName("Petrov1");
        entityManager.persist(user1);

        User user2 = new User();
        user2.setName("Petya2");
        user2.setLastName("Petrov2");
        entityManager.persist(user2);

        Address address = new Address();
        address.setName("Marshala Batyskogo");
        entityManager.persist(address);

        Address address1 = new Address();
        address1.setName("Marshala Batyskogo1");
        entityManager.persist(address1);

        entityManager.getTransaction().commit();




        entityManager.getTransaction().begin();

        User user3 = new User();
        user3.setName("Petya3");
        user3.setLastName("Petrov3");
        entityManager.persist(user3);

        User user4 = new User();
        user4.setName("Petya4");
        user4.setLastName("Petrov4");
        entityManager.persist(user4);

        Address address2 = new Address();
        address2.setName("Marshala Batyskogo2");
        entityManager.persist(address2);

        Address address3 = new Address();
        address3.setName("Marshala Batyskogo3");
        entityManager.persist(address3);

        entityManager.getTransaction().commit();

        entityManager.close();
        sessionFactory.close();
    }
}
