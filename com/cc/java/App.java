package com.cc.java;

public class App {

    public static void main(String[] args) {

        // created Object test1
        Test test1 = new Test(1,2, "A","B", true);

        // Data output
        output(test1.getCounter());
        output(test1.getAge());
        output(test1.getFamilyName());
        output(test1.getFirstName());
        output(test1.getStatus());

    }
    
    // method output and overload
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

