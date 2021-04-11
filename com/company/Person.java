package com.company;

public class Person {
    String reverse=" ";
       private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        if (age>0) {
            this.age = age;
        }else{
            this.age=0;
        }

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;

    }
    public void setName(String name){
        this.name=name;


    }
    public  void setAge(int age) {
        if (age > 0) {
            this.age = age;

        }else{
            this.age=0;
        }
    }
    public String reversename(String name){
        int length=name.length();
        for(int i=length-1;i>=0;i--)
            reverse=reverse+name.charAt(i);
        return reverse;

    }

    }

