package oop;

public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    //Constructor 1
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    //Constructor 2
    Person(String paramName){
        this(paramName, null);
    }

    //Constructor 3
    Person(){
        this(null);
    }

    void sayHello(String name){
        System.out.println("Hello " + name + ", my name is " + this.name);
    }
}