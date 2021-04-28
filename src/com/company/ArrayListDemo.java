package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        Person person1 = new Person("Donald", "Trump", Gender.MALE);
        Person person2 = new Person("Helen", "Armstrong", Gender.FEMALE);
        Person person3 = new Person("Maxim", "Zayats", Gender.MALE);
        Person person4 = new Person("Barak", "Obama", Gender.MALE);
        Person person5 = new Person("David", "Beckham", Gender.MALE);

        List<Person> list = new ArrayList<>();

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println();

        System.out.println("The total number of items in the collection: " + list.size());

    }
}