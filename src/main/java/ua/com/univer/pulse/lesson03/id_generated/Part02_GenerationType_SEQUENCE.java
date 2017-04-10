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

        Address address = new Address();
        address.setName("Marshala Batyskogo");
        entityManager.persist(address);

        entityManager.getTransaction().commit();

        entityManager.close();
        sessionFactory.close();
    }
}
