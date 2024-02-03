package com.cc.java;

public class App {

    public static void main(String[] args) {

        Test test1 = new Test(1,2, "A","B", true);




        output(test1.getCounter());
        output(test1.getAge());
        output(test1.getFamilyName());
        output(test1.getFirstName());
        output(test1.getStatus());


    }
    

    private static void output(String outputStr){
        System.out.println(outputStr);
    }

    private static void output(boolean outputStr){
        System.out.println(outputStr);
    }

    private static void output(int outputStr){
        System.out.println(outputStr);
    }

}