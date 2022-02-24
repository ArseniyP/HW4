package com.phoenix;

public class Person {
    private String fullName;
    private int age;

    public Person(){
        fullName = "Иванов Иван Иванович";
        age = 0;
    }

    public Person (String fullName, int age) throws Exception{
        if(age < 0)
            throw new Exception("Законы биологии не обмынешь!");
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String rename){
        this.fullName = rename;
    }

    public int getAge(){
        return age;
    }

    void talk(String text){
        System.out.printf("\t%s горорит %s\n");
    }
}
