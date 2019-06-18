package com.nzy.springboot_jpa.entity;

import org.hibernate.annotations.NamedQuery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NamedQuery(name="Person.withNameAndAddrNamedQuery",query = "select p from Person p where p.name=:name and p.addr=:addr")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String addr;
    private Integer age;

    public Person() {
    }

    public Person(String name, String addr, Integer age) {
        this.name = name;
        this.addr = addr;
        this.age = age;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
