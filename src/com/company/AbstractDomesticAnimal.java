package com.company;

public abstract class AbstractDomesticAnimal {
    int weight;
    int age;
    String gender;
    String Nickname;

    public AbstractDomesticAnimal(int weight, int age, String gender, String nickname) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        Nickname = nickname;
    }
}
