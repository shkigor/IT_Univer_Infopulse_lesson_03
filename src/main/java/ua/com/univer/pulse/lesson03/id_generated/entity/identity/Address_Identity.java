package ua.com.univer.pulse.lesson03.id_generated.entity.identity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by IT-UNIVER3 on 08.04.2017.
 */
//@Entity
@Table(name ="address")
public class Address_Identity {

    @Id
    @GeneratedValue(generator = "increment", strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @Column(name = "name")
    private String name;

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
}
