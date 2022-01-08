package hua.gr.project_ds.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "application")
public class Application {
    @Id
    @Column(name = "amka")
    private String amkaNumber;

    @Column(name = "birthdate")
    private String birthDate;

    @Column(name = "address")
    private String address;

    @Column(name = "yearofunemployement")
    private String yearOfUnemployment;

    @Column(name = "status")
    private int applicationStatus;

    @Column(name = "img_name")
    private String imgName;


    public Application(String birthDate, String address, String yearOfUnemployment, int applicationStatus, String imgName, String amkaNumber) {
        this.birthDate = birthDate;
        this.address = address;
        this.yearOfUnemployment = yearOfUnemployment;
        this.applicationStatus = applicationStatus;
        this.imgName = imgName;
        this.amkaNumber = amkaNumber;
    }

    public Application() {

    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getYearOfUnemployment() {
        return yearOfUnemployment;
    }

    public void setYearOfUnemployment(String yearOfUnemployment) {
        this.yearOfUnemployment = yearOfUnemployment;
    }

    public int getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(int applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public String getAmkaNumber() {
        return amkaNumber;
    }

    public void setAmkaNumber(String amkaNumber) {
        this.amkaNumber = amkaNumber;
    }
}