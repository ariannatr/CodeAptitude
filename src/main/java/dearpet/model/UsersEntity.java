package dearpet.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Arianna on 23/8/2017.
 */
@Entity
@Table(name = "user", schema = "mydb")
public class UsersEntity implements Serializable {
    private String username;
    private String password;
    private int lost;
    private String name;
    private String surname;
    private String telephone;
    private String location;
    private String photo;
    private String petname;

    @Id
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "lost")
    public int getType() {
        return lost;
    }

    public void setType(int type) {
        this.lost = lost;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "location")
    public String getEmail() {return location;}

    public void setEmail(String location) {
        this.location = location;
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
    public String getPetName() {
        return petname;
    }

    public void setPetName(String petname) {
        this.petname = petname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (lost != that.lost) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (petname != null ? !petname.equals(that.petname) : that.petname != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + lost;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (petname != null ? petname.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }
    
}
