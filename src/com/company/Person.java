package com.company;

public final class Person {

    private final String firstName;
    private final String lastName;
    private final Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj){
            return true;
        }

        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }

        Person person = (Person) obj;
        return  (firstName != null && firstName.equals(person.getFirstName()))
                && (lastName != null && lastName.equals(person.getLastName()))
                && (gender != null && gender.equals(person.getGender()));
    }

    @Override
    public int hashCode(){
        int hash = firstName.hashCode();
        hash += lastName.hashCode();
        hash += gender.hashCode();
        return hash;
    }

    @Override
    public String toString(){
        return "Person {firstname: '" + firstName + "', lastname: '" + lastName + "', gender: '" + gender + "'}";
    }




}