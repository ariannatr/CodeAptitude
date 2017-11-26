package dearpet.model;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by Σταυρίνα on 26/11/2017.
 */
@Entity
@Table(name = "pet", schema = "mydb")
public class PetEntity implements Serializable{
    private Integer id;
    private String petname;
    private int lost;
    private String photo;
    private int askforhome;
    private String fromDate;
    private String toDate;


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    public Integer getId() {
        return id;
    }

    @Basic
    @Column(name="photo")
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "petname")
    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }


    @Basic
    @Column(name = "fromDate")
    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "toDate")
    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    @Basic
    @Column(name = "lost")
    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    @Basic
    @Column(name = "askforhome")
    public int getAskforhome() {
        return askforhome;
    }

    public void setAskforhome(int askforhome) {
        this.askforhome = askforhome;
    }


    @ManyToOne
    @JoinColumn(name="user_username")
    private UsersEntity usersEntity;

    public UsersEntity getUsersEntity() {
        return usersEntity;
    }

    public void setUsersEntity(UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }

}
