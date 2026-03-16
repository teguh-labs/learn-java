package oop;

public class PersonApp {
    public static void main(String[] args) {

        //Cara 1 (lebih modern)
        var person1 = new Person("Budi", "Jl. Nusantara");
        
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Ilham");
        
        //Cara 2
        Person person2 = new Person("Joko");
        person2.address = "Jl. Sukajaya";
        
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
        person2.sayHello("Rian");
        
        //Cara 3
        Person person3;
        person3 = new Person();
        person3.name = "Eko";
        person3.address = "Jl. Sentosa";

        System.out.println(person3.name);
        System.out.println(person3.address);
        System.out.println(person3.country);
        person3.sayHello("Ridho");
    }
}
