package com.vijay.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "students")
public class Student
{
    private  int id;
    private  String city;
    private  String college;

    public Student(int id, String city, String college) {
        this.id = id;
        this.city = city;
        this.college = college;
    }

    public Student()
    {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
