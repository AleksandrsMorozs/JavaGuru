package com.alex.moroz.pojo;


import java.util.Date;

public class People {

    private String fullname;
    private int age;
    private Date birthday;

    public People (String fullname, int age, Date birthday){
        this.fullname = fullname;
        this.age = age;
        this.birthday = birthday;
    }

    public String getFullname(){

        return fullname;
    }

    public void setFullname(String fullname){

        this.fullname = fullname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Date getBirthday(){
        return birthday;
    }

    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + " {" +
                "\n\tName: " + this.fullname + ";" +
                "\n\tAge: " + this.age + ";" +
                "\n\tBirthday: " + birthday +
                "\n}";


    }

}
