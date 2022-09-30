package com.revature.classesobjects;
//I AM THE DRIVER
public class PersonDriver {
    public static void main(String[] args) {
        //we are going to use this main method to call()
        //Person class and create Person objects
        Person jackie = new Person("Jackie", 69, 120, 25);
        Person caitlyn = new Person("Caitlyn", 72.5, 138, 19);
        System.out.println(jackie.name);
        System.out.println(caitlyn.name);

        caitlyn.walk(69);
        jackie.talk("Hi, my name is Jackie! Wanna smooch?");
    }
}
