package com.agtech.register.documents;

import org.hibernate.validator.internal.util.logging.Log;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "user")   //função
public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) //entidade do tipo user
    private long id;

    @Column
    private String name;

    @Column
    private String tell;

    @Column
    private String cpf;

    @Column
    private String birthday;

    @Column
    private String address;

    @Column
    private Boolean active; //lista se ta ativo ou no

    @Column
    private Character sex;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tell='" + tell + '\'' +
                ", cpf='" + cpf + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                ", active=" + active +
                ", sex=" + sex +
                '}';
    }
}