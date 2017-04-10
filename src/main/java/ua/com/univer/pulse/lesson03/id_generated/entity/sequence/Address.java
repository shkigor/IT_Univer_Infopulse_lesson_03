package ua.com.univer.pulse.lesson03.id_generated.entity.sequence;

import javax.persistence.*;

/**
 * Created by IT-UNIVER3 on 08.04.2017.
 */
@Entity
@Table(name = "address")
@SequenceGenerator(name = "generator1", initialValue = 30, allocationSize = 100)
public class Address {

    @Id
    @GeneratedValue(generator = "generator1", strategy = GenerationType.SEQUENCE)
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
