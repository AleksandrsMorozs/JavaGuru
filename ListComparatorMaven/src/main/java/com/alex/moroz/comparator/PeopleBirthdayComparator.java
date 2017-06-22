package com.alex.moroz.comparator;


import com.alex.moroz.pojo.People;

import java.util.Comparator;

public class PeopleBirthdayComparator implements Comparator<People> {


    public int compare(People people1, People people2) {
        return people1.getBirthday().compareTo(people2.getBirthday());
    }
}
