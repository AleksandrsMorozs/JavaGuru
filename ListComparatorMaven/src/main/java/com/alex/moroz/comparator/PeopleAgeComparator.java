package com.alex.moroz.comparator;

import com.alex.moroz.pojo.People;
import org.junit.runners.JUnit4;

import java.util.Comparator;

public class PeopleAgeComparator implements Comparator<People> {


    public int compare(People people1, People people2) {

        return people1.getAge() - (people2.getAge());
    }
}
