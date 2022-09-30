package com.revature.classesobjects;
//thius is like 'include' or DATA section
//describes where in the project we are, allows accessing to similar (ie in the same package) classes

public class Person {
    //CLASSES are blueprints for OBJECTS.
    //
    //FIELDS for a PERSON
    //Name --> String
    //Height --> double(???????? INSANITY)
    //Weight --> double
    //Age --> int

    //declare these fields -- 'properties' at the class level
    //OUTSIDE of any method

    String name;
    double height;
    double weight;
    int age;

    //NOW, whenver we create a PERSON object, they should ahve all these
    //properites associated with them1
    //then, we will create a constructor method

    //constructor methods are a good way of instantiating the STATE of an object
    public Person(String name, double height, double weight, int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    //no-args constructor. use to set default vals.
    public Person(){
        this.name = "Jared";
        this.height = 0;
        this.weight = 69;
        this.age = 420;
    }

    //let's add in some methods! Typically, methods are declared BELOW the main method. You know. AFTER they would be invoked. "jAvA beSt pRacTiCeS....."
    public void walk(int distance){
        System.out.println(this.name + " walked a distance of " + distance + " feet!");
    }

    public void talk(String words){
        System.out.println(this.name + " Says: " + words);
    }

}
//external todos:: create a remote repo and push to it (lookup how lol)

//before, we created an all-args constructor (above).
//BUT what if we only wanted to set some of the values