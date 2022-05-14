package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import peaksoft.Animal;
import peaksoft.Person;
import peaksoft.Wolf;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext
                        ("applicationContext.xml");

//        Animal animal = context.getBean
//                ("Animal", Animal.class);
//        animal.animalMinus();
//        animal.animalPlus();
        Person person = context.getBean
                ("person", Person.class);
        person.animalDog();
        System.out.println("name: " + person.getName() + ", " + "age: " + person.getAge());



    }
}
