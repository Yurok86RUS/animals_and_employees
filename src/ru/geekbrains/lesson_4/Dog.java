package ru.geekbrains.lesson_4;

public class Dog extends Animals {

    public Dog(String name){
        super("DOG " + name);
        run = 500;
        jump = 0.5;
        swim = 10;
    }

}
