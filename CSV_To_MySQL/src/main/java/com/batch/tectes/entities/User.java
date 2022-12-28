package com.batch.tectes.entities;

public class User {
    private  long Index;
    private  String Name;
    private  String Website;
    private String Country;

    public User() {
    }

    public User(long index, String name, String website, String country) {
        Index = index;
        Name = name;
        Website = website;
        Country = country;
    }

    public long getIndex() {
        return Index;
    }

    public void setIndex(long index) {
        Index = index;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getWebsite() {
        return Website;
    }

    public void setWebsite(String website) {
        Website = website;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
