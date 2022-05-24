package com.company;

public class Horse extends AbstractDomesticAnimal {
    String color;

    public Horse(int weight, int age, String gender, String nickname, String color) {
        super(weight, age, gender, nickname);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", Nickname='" + Nickname + '\'' +
                ", color='" + color + '\'' +
                "} " + super.toString();
    }
}
