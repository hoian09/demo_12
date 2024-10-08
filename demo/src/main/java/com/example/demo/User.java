package com.example.demo;


import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id", nullable = false)
private int id;
@Column(name = "email", unique = true, nullable = false)
private String email;
@Column(name = "password", nullable = false)
private String password;
@Column(name = "firstname", nullable = false)
private String firstname;
@Column(name = "lastname", nullable = false)
private String lastname;

public User(){

}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
