package com.bridgelabz.day13;

public class Generics <Test extends Comparable<Test>>{
    //Taking variables as three test cases
    Test x;
    Test y;
    Test z;

    Generics(Test x, Test y, Test z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Test maximum() {

        if (y.compareTo(x) > 0) {
            return y;
        } else if (y.compareTo(z) > 0) {
            return z;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        // Welcome to Generics program.
        Generics compareInteger = new Generics(10, 20, 7);
        System.out.println("Maximum number out of three integers is: " + compareInteger.maximum());
        Generics comapreFloat = new Generics(-6, -4, -9);
        System.out.println("Maximum number out of three float is: " + comapreFloat.maximum());
        Generics compareString = new Generics("Yogesh", "Akshar", "Rajat");
        System.out.println("Maximum among three string is: " + compareString.maximum());
                ;
    }
}