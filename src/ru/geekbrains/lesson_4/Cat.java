package ru.geekbrains.lesson_4;

public class Cat extends Animals {

    public Cat(String name){
        super("CAT " + name);
        run = 200;
        jump = 2;
    }
    @Override
    public void Swim(int meters) {
        System.out.println("CAT swim: false");
    }
}
