package com.company;

public class Main {

    public static void main(String[] args) {
        Cow cow1 = new Cow(200,3,"female","Masha");
        Cow cow2 = new Cow(220,4,"female","Natasha");
        Cow cow3 = new Cow(210,4,"female","Dasha");
        Cow cow4 = new Cow(230,5,"female","Rasha");
        Cow cow5 = new Cow(225,4,"female","Sasha");
        Cow cow6 = new Cow(235,4,"female","Milana");
        Horse horse1 = new Horse(350,4,"male", "Baron",
                "black");
        Horse horse2 = new Horse(300,3,"male", "Ahiles",
                "white");
        Horse horse3 = new Horse(400,5,"male", "Gektor",
                "black");
        Sheep sheep1 = new Sheep(50,2,"famale","Doll");
        Sheep sheep2 = new Sheep(55,2,"famale","Susie");
        Sheep sheep3 = new Sheep(52,2,"famale","Wanda");
        Sheep sheep4 = new Sheep(53,3,"famale","Panda");
	Cow [] cows = new Cow[] {cow1,cow2,cow3,cow4,cow5};
    Horse [] horses = new Horse[] {horse1,horse2};
    Sheep [] sheeps = new Sheep[] {sheep1,sheep2,sheep3};

        Cow [] cows1 = new Cow[] {cow6};
        Horse [] horses1 = new Horse[] {horse3};
        Sheep [] sheeps1 = new Sheep[] {sheep4};

        Farm farm1 = new Farm (("Чуйская область Сокулукский район с. Асылбаш"),
            cows,horses,sheeps, "Акматов А.");
    Farm farm2 = new Farm (("Чуйская область Аламединский район с. Озерное"), cows1,horses1,sheeps1,"Эшматов А.");
        System.out.println(farm1.toString());
        System.out.println(farm2.toString());
        }
    }

