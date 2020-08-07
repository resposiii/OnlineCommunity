package com.nenu.domain;

import java.io.Serializable;

public class Admin implements Serializable {
    private int a_id;
    private String a_name;
    private String a_password;
    private String a_gender;
    private int a_age;


    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_password() {
        return a_password;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
    }

    public String getA_gender() {
        return a_gender;
    }

    public void setA_gender(String a_gender) {
        this.a_gender = a_gender;
    }

    public int getA_age() {
        return a_age;
    }

    public void setA_age(int a_age) {
        this.a_age = a_age;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "a_id=" + a_id +
                ", a_name='" + a_name + '\'' +
                ", a_password='" + a_password + '\'' +
                ", a_gender='" + a_gender + '\'' +
                ", a_age=" + a_age +
                '}';
    }
}
