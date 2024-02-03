package com.cc.java;

public class Test extends Supertest {
    

    protected int counter;
    protected int age;
    private String familyName;
    private String firstName;
    public boolean status;

    public Test(int counter, int age, String familyName, String firstName, boolean status) {
        this.counter = counter;
        this.age = age; 
        this.familyName = familyName;
        this.firstName = firstName;
        this.status = status;
    }

public int getCounter(){
    return this.counter;
}

public int getAge(){
    return this.age;
}

public String getFamilyName(){
    return this.familyName;
}

public String getFirstName(){
    return this.firstName;
}

public boolean getStatus(){
    return this.status;
}





}
