package ru.geekbrains.lesson_4;

public class Cat extends Animals {
    String name;

    public Cat (String _name){
        name = _name;
    }

    public void run(int _meters){
        boolean result = true;
        if (_meters < 0 || _meters > 200) {
            result = false;
            System.out.println(name + " run: " + result);
        }
        else System.out.println(name + " run: " + result);
    }

    public void jump(int _meters){
        boolean result = true;
        if (_meters < 0 || _meters > 2){
            result = false;
            System.out.println(name + " jump: " + result);
        }
        else System.out.println(name + " jump: " + result);
    }

    public void swim(double _meters){
        System.out.println(name + " swim: false");
//        if (_meters < 0 || _meters > 0.5) result = false;
    }

}
