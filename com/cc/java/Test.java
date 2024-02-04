package com.cc.java;

public class Test extends Supertest {
    
    // Field
    protected int counter;
    protected int age;
    private String familyName;
    private String firstName;
    public boolean status;

    // constructor
    public Test(int counter, int age, String familyName, String firstName, boolean status) {
        this.counter = counter;
        this.age = age;
        this.familyName = familyName;
        this.firstName = firstName;
        this.status = status;
    }

    // getters
    public int getCounter() {
        return counter;
    }

    public int getAge() {
        return age;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isStatus() {
        return status;
    }


    // setters
    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}

