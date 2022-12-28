package com.test.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tutorials")
public class Tutorial {

    @Id
    @Column(name = "id")
    private long id;

//    @Column(name = "title")
//    private String title;
//
//    @Column(name = "description")
//    private String description;
//
//    @Column(name = "published")
//    private boolean published;
//
//    public Tutorial() {
//
//    }
//
//    public Tutorial(long id, String title, String description, boolean published) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//        this.published = published;
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public boolean isPublished() {
//        return published;
//    }
//
//    public void setPublished(boolean isPublished) {
//        this.published = isPublished;
//    }
//
//    @Override
//    public String toString() {
//        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
//    }


    String Service_Order_Number;
    String Job_Position;
    String Job_Description;
    String Hiring_Company_Name;
    String Recruiting_Company_Name;
    String Hiring_Manager_ID;
    String Hiring_Manager_Name;
    String  Candidate_Source;
    String Referee_Name;
    String Candidate_ID;
    String Candidate_Name;
    String Candidate_Mobile_Number;
    String Candidate_Email;

    public Tutorial(long id, String service_Order_Number, String job_Position, String job_Description, String hiring_Company_Name, String recruiting_Company_Name, String hiring_Manager_ID, String hiring_Manager_Name, String candidate_Source, String referee_Name, String candidate_ID, String candidate_Name, String candidate_Mobile_Number, String candidate_Email) {
        this.id = id;
        Service_Order_Number = service_Order_Number;
        Job_Position = job_Position;
        Job_Description = job_Description;
        Hiring_Company_Name = hiring_Company_Name;
        Recruiting_Company_Name = recruiting_Company_Name;
        Hiring_Manager_ID = hiring_Manager_ID;
        Hiring_Manager_Name = hiring_Manager_Name;
        Candidate_Source = candidate_Source;
        Referee_Name = referee_Name;
        Candidate_ID = candidate_ID;
        Candidate_Name = candidate_Name;
        Candidate_Mobile_Number = candidate_Mobile_Number;
        Candidate_Email = candidate_Email;
    }

    public Tutorial()
    {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getService_Order_Number() {
        return Service_Order_Number;
    }

    public void setService_Order_Number(String service_Order_Number) {
        Service_Order_Number = service_Order_Number;
    }

    public String getJob_Position() {
        return Job_Position;
    }

    public void setJob_Position(String job_Position) {
        Job_Position = job_Position;
    }

    public String getJob_Description() {
        return Job_Description;
    }

    public void setJob_Description(String job_Description) {
        Job_Description = job_Description;
    }

    public String getHiring_Company_Name() {
        return Hiring_Company_Name;
    }

    public void setHiring_Company_Name(String hiring_Company_Name) {
        Hiring_Company_Name = hiring_Company_Name;
    }

    public String getRecruiting_Company_Name() {
        return Recruiting_Company_Name;
    }

    public void setRecruiting_Company_Name(String recruiting_Company_Name) {
        Recruiting_Company_Name = recruiting_Company_Name;
    }

    public String getHiring_Manager_ID() {
        return Hiring_Manager_ID;
    }

    public void setHiring_Manager_ID(String hiring_Manager_ID) {
        Hiring_Manager_ID = hiring_Manager_ID;
    }

    public String getHiring_Manager_Name() {
        return Hiring_Manager_Name;
    }

    public void setHiring_Manager_Name(String hiring_Manager_Name) {
        Hiring_Manager_Name = hiring_Manager_Name;
    }

    public String getCandidate_Source() {
        return Candidate_Source;
    }

    public void setCandidate_Source(String candidate_Source) {
        Candidate_Source = candidate_Source;
    }

    public String getReferee_Name() {
        return Referee_Name;
    }

    public void setReferee_Name(String referee_Name) {
        Referee_Name = referee_Name;
    }

    public String getCandidate_ID() {
        return Candidate_ID;
    }

    public void setCandidate_ID(String candidate_ID) {
        Candidate_ID = candidate_ID;
    }

    public String getCandidate_Name() {
        return Candidate_Name;
    }

    public void setCandidate_Name(String candidate_Name) {
        Candidate_Name = candidate_Name;
    }

    public String getCandidate_Mobile_Number() {
        return Candidate_Mobile_Number;
    }

    public void setCandidate_Mobile_Number(String candidate_Mobile_Number) {
        Candidate_Mobile_Number = candidate_Mobile_Number;
    }

    public String getCandidate_Email() {
        return Candidate_Email;
    }

    public void setCandidate_Email(String candidate_Email) {
        Candidate_Email = candidate_Email;
    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", Service_Order_Number=" + Service_Order_Number +
                ", Job_Position='" + Job_Position + '\'' +
                ", Job_Description='" + Job_Description + '\'' +
                ", Hiring_Company_Name='" + Hiring_Company_Name + '\'' +
                ", Recruiting_Company_Name='" + Recruiting_Company_Name + '\'' +
                ", Hiring_Manager_ID='" + Hiring_Manager_ID + '\'' +
                ", Hiring_Manager_Name='" + Hiring_Manager_Name + '\'' +
                ", Candidate_Source='" + Candidate_Source + '\'' +
                ", Referee_Name='" + Referee_Name + '\'' +
                ", Candidate_ID='" + Candidate_ID + '\'' +
                ", Candidate_Name='" + Candidate_Name + '\'' +
                ", Candidate_Mobile_Number='" + Candidate_Mobile_Number + '\'' +
                ", Candidate_Email='" + Candidate_Email + '\'' +
                '}';
    }
}