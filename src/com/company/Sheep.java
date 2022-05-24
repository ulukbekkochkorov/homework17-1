package com.company;

public class Sheep extends AbstractDomesticAnimal {
    public Sheep(int weight, int age, String gender, String nickname) {
        super(weight, age, gender, nickname);
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", Nickname='" + Nickname + '\'' +
                "} " + super.toString();
    }
}
