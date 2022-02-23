package com.kuebiko.consultantService.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class EducationDto {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String university;
    @Column
    private Boolean graduated;
    @Column
    private Double gpa;
    @Column
    private Date graduateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Boolean getGraduated() {
        return graduated;
    }

    public void setGraduated(Boolean graduated) {
        this.graduated = graduated;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Date getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Date graduateDate) {
        this.graduateDate = graduateDate;
    }
}
