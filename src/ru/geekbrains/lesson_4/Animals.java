package ru.geekbrains.lesson_4;

public class Animals {

    String name;
    int run = 0;
    double jump = 0;
    int swim = 0;

    public Animals(){
        this.name = "NoName";
    }

    public Animals(String name){
        this.name = name;
    }

    public void Run(int meters) {
        if (meters > 0 && run >= meters ){
            System.out.println(this.name + " run: true");
        }
        else System.out.println(this.name + " run: false");
    }

    public void Jump(double meters) {
        if (meters > 0 && jump >= meters ){
            System.out.println(this.name + " jump: true");
        }
        else System.out.println(this.name + " jump: false");
    }

    public void Swim(int meters) {
        if (meters > 0 && swim >= meters ){
            System.out.println(this.name + " swim: true");
        }
        else System.out.println(this.name + " swim: false");
    }
}
