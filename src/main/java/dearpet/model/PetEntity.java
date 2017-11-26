package dearpet.model;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by Σταυρίνα on 26/11/2017.
 */
@Entity
@Table(name = "pet", schema = "mydb")
public class PetEntity implements  Serializable{

    private String petname;
    private int lost;
    private String photo;
    private int askforhome;
    private String fromDate;
    private String toDate;


    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
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
    public String getFromdate() {
        return fromDate;
    }

    public void setFromdate(String fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "toDate")
    public String getTodate() {
        return toDate;
    }

    public void setTodate(String toDate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PetEntity that = (PetEntity) o;
        if(id!=that.id) return false;
        if (lost != that.lost) return false;
        if (askforhome != that.askforhome) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (petname != null ? !petname.equals(that.petname) : that.petname != null) return false;

        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = petname != null ? petname.hashCode() : 0;
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        result = 31 * result + lost;
        result = 31 * result + askforhome;
        result = 31 * result + id;
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "pet_id")
    private UsersEntity usersByUsersUsername;

    public UsersEntity getUsersByUsersUsername() {
        return usersByUsersUsername;
    }

    public void setUsersByUsersUsername(UsersEntity usersByUsersUsername) {
        this.usersByUsersUsername = usersByUsersUsername;
    }
//    @ManyToOne
//    @JoinColumn(name = "user")
//    private UsersEntity usersEntity;
//
//    public UsersEntity getUsersEntity() {
//        return usersEntity;
//    }
//
//    public void setUsersEntity(UsersEntity usersEntity) {
//        this.usersEntity = usersEntity;
//    }

}
