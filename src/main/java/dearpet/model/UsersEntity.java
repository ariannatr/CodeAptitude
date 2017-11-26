package dearpet.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "user", schema = "mydb")
public class UsersEntity  implements Serializable{
    private String username;
    private String password;
    private String name;
    private String surname;
    private String telephone;
    private String location;
    private String photo;
    private String email;
    private int host;
    private String fromDate;
    private String toDate;
    private int lost;
    private String fromDate2;
    private String toDate2;
    private int askforhome;
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
    @Column(name = "ins")
    private Integer ins;
    public Integer getIns() {
        return ins;
    }

    public void setIns(Integer ins) {
        this.ins = ins;
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
    @Column(name = "host")
    public int getHost() {
        return host;
    }

    public void setHost(int host) {
        this.host = host;
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
    public String getLocation() {return location;}

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "petname")
    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
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



    @Basic
    @Column(name = "fromDate2")
    public String getFromDate2() {
        return fromDate2;
    }

    public void setFromDate2(String fromDate2) {
        this.fromDate2 = fromDate2;
    }

    @Basic
    @Column(name = "toDate2")
    public String getToDate2() {
        return toDate2;
    }

    public void setToDate2(String toDate2) {
        this.toDate2 = toDate2;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (host != that.host) return false;
        if (telephone != null ? !telephone.equals(that.telephone) : that.telephone != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (photo != null ? !photo.equals(that.photo) : that.photo != null) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + host;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        return result;
    }





}
