package dearpet.model;

import javax.persistence.*;

/**
 * Created by Arianna on 25/11/2017.
 */
@Entity
@Table(name = "grooming", schema = "mydb")
public class Grooming {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    public Integer getId() {
        return id;
    }

    private String town;

    private String address;

    @Basic
    @Column(name = "town")
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setSurname(String address) {
        this.address = address;
    }

}
