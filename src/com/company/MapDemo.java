package com.company;

import java.util.HashMap;
import java.util.Map;


public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, Person> people = new HashMap<>();

        Person person1 = new Person("Donald", "Trump", Gender.MALE);
        Person person2 = new Person("Helen", "Armstrong", Gender.FEMALE);
        Person person3 = new Person("Maxim", "Zayats", Gender.MALE);
        Person person4 = new Person("Barak", "Obama", Gender.MALE);
        Person person5 = new Person("David", "Beckham", Gender.MALE);

        people.put(1, person1);
        people.put(2, person2);
        people.put(3, person3);
        people.put(4, person4);
        people.put(5, person5);


        for (Map.Entry<Integer, Person> pair : people.entrySet()) {
            Integer key = pair.getKey();
            Person value = pair.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println();

        System.out.println("The total number of items in the collection: " + people.size());


    }
}