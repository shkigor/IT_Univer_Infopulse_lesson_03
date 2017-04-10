package ua.com.univer.pulse.lesson03.id_generated.entity.identity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by IT-UNIVER3 on 08.04.2017.
 */
//@Entity // Можно и здесь указать имя таблицы, к которой мы привязываем сущность
@Table(name = "myusers")
public class User_Identity {


    /**
     * Если strategy = GenerationType.SEQUENCE, то это означает что для всех таблиц БД нумерация будет сквозная (последовательная),
     * если strategy = GenerationType.IDENTITY, то для каждай таблицы нумерация будет своя
     *
     * GenerationType.IDENTITY не все БД подерживает
     */
    @Id
    @GeneratedValue(generator = "increment", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @Column(name = "firstname")
    private String name;

    @Column(name = "lastname")
    private String lastName;

    public User_Identity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

