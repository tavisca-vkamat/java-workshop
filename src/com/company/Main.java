package com.company;

import com.company.Contracts.Person;
import com.company.Contracts.util.SortPersons;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // get random person with random name and age
	    ArrayList<Person> persons = GetRandomPersons(10);

        System.out.println("Before sort");
        PrintAllPersons(persons);

        Collections.sort(persons, new SortPersons());

        // after sorting print
        System.out.println("After sort");
        PrintAllPersons(persons);

        // sorted map
        SortedMap<String, Person> personMap = new TreeMap<>();
        for (Person person : persons) {
            personMap.put(person.getName(), person);
        }
    }

    private static void PrintAllPersons(ArrayList<Person> persons) {
        for (Person person :
                persons) {
            System.out.print("Name: " + person.getName());
            System.out.println("  Age: " + person.getAge());
        }
    }

    private static ArrayList<Person> GetRandomPersons(int count) {
        ArrayList<Person> persons = new ArrayList<>();
        while (count != 0){
            persons.add(
                    new Person(GetRandomString(),GetRandomNumber())
            );
            count--;
        }
        return persons;
    }

    private static String GetRandomString() {
        int n = 7;
        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    private static int GetRandomNumber() {
        return new Random().nextInt(90);
    }
}
