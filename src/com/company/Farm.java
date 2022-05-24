package com.company;

public class Farm {
    String address;
    Cow [] cow = new Cow[6];
    Horse [] horse = new Horse[3];
    Sheep [] sheep = new Sheep[4];
    String owner;

    private String animalString (AbstractDomesticAnimal [] arr) {
        String line = "";
        for (int i = 0; i < arr.length; i++) {
            line += arr[i].Nickname + ", ";

        }  return line;
    }
    public Farm(String address, Cow [] cow, Horse [] horse, Sheep [] sheep, String owner) {
        this.address = address;
        this.cow = cow;
        this.horse = horse;
        this.sheep = sheep;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", cow=" + animalString(cow) +
                ", horse=" + animalString(horse) +
                ", sheep=" + animalString(sheep) +
                ", owner='" + owner + '\'' +
                '}';
    }
}
