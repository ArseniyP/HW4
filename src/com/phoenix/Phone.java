package com.phoenix;

public class Phone {
    private String number;
    private float weight;
    private String model;

    Phone(String number, float weight, String model) throws Exception {
        this.number = number;
        if(weight < 100)
            throw new Exception("Вес меньше 100гр");
        this.weight = weight;
        this.model = model;
    }

    Phone(String number, String model) throws Exception {
        this(number, 0f, model);
    }

    private Phone() {}

    public String getNumber(){
        return number;
    }

    public float getWeight(){
        return weight;
    }

    public String getModel(){
        return  model;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void setModel(){
        this.model = model;
    }

    public void receiveCall(String contactName) {
        System.out.println("Звонит " + contactName);
    }

    public void receiveCall(String contactName, String contactNumber) {
        System.out.printf("Звонит \"%s\" (%s)\n", contactName, contactNumber);
    }

    public void sendMessage(String...phoneNums) {
        System.out.println("Рассылка сообщений будет проводиться на след. номера:");
        for(String number : phoneNums){
            System.out.println("\t" + number);
        }
    }
}
