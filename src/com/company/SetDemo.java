package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetDemo {
    public static void main(String[] args) {

        Person person1 = new Person("Maxim", "Zayats", Gender.MALE);
        Person person2 = new Person("Helen","Armstrong",Gender.FEMALE );
        Person person3 = new Person("Donald", " Trump",Gender.MALE);
        Person person4 = new Person("Veronika", "Zayats", Gender.FEMALE);
        Person person5 = new Person("David","Beckham", Gender.MALE);

        Set<Person> set = new HashSet<>();

        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        set.add(person5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println("The total number of items in the collection: " + set.size());








    }
}