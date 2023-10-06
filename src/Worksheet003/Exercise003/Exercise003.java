package Worksheet003.Exercise003;

import Worksheet003.Exercise003.Models.Person;

public class Exercise003 {
    public static void main(String[] args) {
        Person person1 = new Person("Arthur",11);
        Person person2 = new Person("Charles", 13);

        System.out.println(person1.getName()  + " is "+ person1.getAge() + " years old.");
        System.out.println(person2.getName()  + " is "+ person2.getAge() + " years old.");

    }

}
