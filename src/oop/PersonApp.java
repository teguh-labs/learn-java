package oop;

public class PersonApp {
    public static void main(String[] args) {
        //Cara 1 (lebih modern)
        var person1 = new Person();

        person1.name = "Budi Nugraha";
        person1.address = "Jl. Sriraya";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        
        //Cara 2
        Person person2 = new Person();
        person2.name = "Joko Nugroho";
        person2.address = "Jl. Nusantara";
        
        System.out.println(person2.name);
        System.out.println(person2.address);
        System.out.println(person2.country);
        
        
        Person person3 = new Person();
        person3.name = "Eko Kurniawan";
        person3.address = "Subang";

        System.out.println(person3.name);
        System.out.println(person3.address);
        System.out.println(person3.country);
    }
}
