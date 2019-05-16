package com.company.Contracts.util;

import com.company.Contracts.Person;

import java.util.Comparator;

public class SortPersons implements Comparator<Person>
{
    public int compare(Person a, Person b)
    {
        if(a.getName().compareTo(b.getName()) == 0){
            return a.getAge() - b.getAge();
        }
        else {
            return a.getName().compareTo(b.getName());
        }
    }
}