package com.Kenneth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner water = new Scanner(System.in);

        int girls, boys, people;
        girls = 6;
        boys = 4;

        people = girls + boys;
        System.out.println(people);

        people = girls - boys;
        System.out.println(people);

        people = girls * boys;
        System.out.println(people);

        people = girls / boys;
        System.out.println(people);

        System.out.println("===================================");
                                    //what happens when it is a double other than an int
        double frogs, cows, animals;
        frogs = 6;
        cows = 4;

        animals = frogs + cows;
        System.out.println(animals);

        animals = frogs - cows;
        System.out.println(animals);

        animals = frogs * cows;
        System.out.println(animals);

        animals = frogs / cows;
        System.out.println(animals);

        System.out.println("===================================");
        //what happens when you use the models %

        animals = frogs % cows;
        System.out.println(animals);
    }
}
