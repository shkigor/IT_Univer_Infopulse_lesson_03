package ua.com.univer.pulse.lesson03.id_generated.entity.sequence;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by IT-UNIVER3 on 08.04.2017.
 */
@Entity // Можно и здесь указать имя таблицы, к которой мы привязываем сущность
@Table(name = "myusers")
/**
 * initialValue - начальное значение 30 для первой записи в таблице
 * allocationSize = 100. Это означает, что на таблицу мы зарезервировали (выделяется) 100 записей.
 * Для 1-ой таблицы они будут нумероваться от 30 до 130.
 * Для 2-ой таблицы первая запись будет иметь id = 131.
 */
@SequenceGenerator(name = "my_sequence_generator", initialValue = 30, allocationSize = 100)
public class User {


    /**
     * Если strategy = GenerationType.SEQUENCE, то это означает что для всех таблиц БД нумерация будет сквозная (последовательная),
     * если strategy = GenerationType.IDENTITY, то для каждай таблицы нумерация будет своя
     * <p>
     * GenerationType.IDENTITY не все БД подерживает
     */
    @Id
    /**
     * GeneratedValue отвечает за то как будут нумероваться записи в таблице
     * Если в GeneratedValue ничего не указать, то по умолчанию будет GenerationType.AUTO, который по суте равен GenerationType.SEQUENCE
     */
    @GeneratedValue(generator = "my_sequence_generator", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "firstname")
    private String name;

    @Column(name = "lastname")
    private String lastName;

    public User() {
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

