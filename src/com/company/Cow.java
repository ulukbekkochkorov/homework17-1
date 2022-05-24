package com.company;

public class Cow extends AbstractDomesticAnimal {
    public Cow(int weight, int age, String gender, String nickname) {
        super(weight, age, gender, nickname);
    }

    @Override
    public String toString() {
        return "Cow{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", Nickname='" + Nickname + '\'' +
                "} " + super.toString();
    }
}
