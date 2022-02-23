package com.kuebiko.consultantService.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class PersonalDetailsDto {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String firstName;
    @Column
    private  String lastName;
    @Column
    private Date dob;
    @Column
    private Character gender;
    @Column
    private Long addressId;
    @Column
    private Long educationId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getEducationId() {
        return educationId;
    }

    public void setEducationId(Long educationId) {
        this.educationId = educationId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

}
