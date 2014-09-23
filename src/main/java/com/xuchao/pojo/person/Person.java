package com.xuchao.pojo.person;

import java.util.List;
import java.util.Map;

/**
 * Created by xuchao on 14-8-28.
 */
public class Person {

    private String name;
    private boolean sex;
    private int age;
    private double salary;
    private String[] interests;
    private Address address;
    private List ability;
    private Map relation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List getAbility() {
        return ability;
    }

    public void setAbility(List ability) {
        this.ability = ability;
    }

    public Map getRelation() {
        return relation;
    }

    public void setRelation(Map relation) {
        this.relation = relation;
    }
}
