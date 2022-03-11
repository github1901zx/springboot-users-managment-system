package com.example.usersmanagementsystem.entity;

import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usr_id")
    private int id;
    @Column(name = "usr_name")
    private String name;
    @Column(name = "usr_login")
    private String login;
    @Column(name = "usr_password")
    private String password;
    @Column(name = "usr_email")
    private String email;
    @Column(name = "usr_dateBDay")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateBDay;

    public User() {
    }

    public User(String name, String login, String password, String email, LocalDate dateBDay) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
        this.dateBDay = dateBDay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateBDay() {
        return dateBDay;
    }

    public void setDateBDay(LocalDate dateBDay) {
        this.dateBDay = dateBDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(email, user.email) && Objects.equals(dateBDay, user.dateBDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, login, password, email, dateBDay);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", dateBDay=" + dateBDay +
                '}';
    }
}
