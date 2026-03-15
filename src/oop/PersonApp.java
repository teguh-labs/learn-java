package oop;

public class PersonApp {
    public static void main(String[] args) {
        //Cara 1 (lebih modern)
        var person1 = new Person();

        person1.name = "Budi";
        person1.address = "Sriraya";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        //Cara 2
        Person person2 = new Person();

        //Cara 3
        Person person3;
        new Person();
    }
}
