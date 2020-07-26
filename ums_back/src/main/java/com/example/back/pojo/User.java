package com.example.back.pojo;

import org.springframework.stereotype.Component;

@Component
public class User {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String education;
    private String school;
    private String job;
    private String intro;
    public User() {
    }
    public User(int id, String name, String phone, String email, String education, String school, String job, String intro) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.education = education;
        this.school = school;
        this.job = job;
        this.intro = intro;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", school='" + school + '\'' +
                ", job='" + job + '\'' +
                ", intro='" + intro + '\'' +
                '}';
    }
}
