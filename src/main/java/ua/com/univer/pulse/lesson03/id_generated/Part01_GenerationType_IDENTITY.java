package ua.com.univer.pulse.lesson03.id_generated;

import org.hibernate.SessionFactory;
import ua.com.univer.pulse.lesson03.id_generated.entity.identity.Address_Identity;
import ua.com.univer.pulse.lesson03.id_generated.entity.identity.User_Identity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 * Created by IShklyar on 10.04.2017.
 */
public class Part01_GenerationType_IDENTITY {

    public static void main(String[] args) {
        SessionFactory sessionFactory =
                (SessionFactory) Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        EntityManager entityManager = sessionFactory.createEntityManager();

        entityManager.getTransaction().begin();

        User_Identity user = new User_Identity();
        user.setName("Vasya");
        user.setLastName("Pupkin");
        entityManager.persist(user);

        Address_Identity address = new Address_Identity();
        address.setName("Stepana Bandery");
        entityManager.persist(address);

        entityManager.getTransaction().commit();

        entityManager.close();
        sessionFactory.close();
    }
}
