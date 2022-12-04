package com.vijay.Entity;

import jakarta.persistence.*;

@Entity
//@Table(name ="User")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "Id")
    private  int id;
//    @Column(name = "Name")
    private  String name;
//    @Column(name = "City")
    private  String city;
//    @Column(name = "Status")
    private  String status;

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User(int id, String name, String city, String status) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.status = status;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
