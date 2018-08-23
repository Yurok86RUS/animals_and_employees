package ru.geekbrains.lesson_4;

public class Dog extends Animals {

    String name;

    public Dog (String _name){
        name = _name;
    }

    public void run(int _meters){
        boolean result = true;
        if (_meters < 0 || _meters > 500){
            result = false;
        System.out.println(name + " run: " + result);
    }
        else System.out.println(name + " run: " + result);
    }

    public void swim(int _meters){
        boolean result = true;
        if (_meters < 0 || _meters > 10){
            result = false;
        System.out.println(name + " swim: " + result);
    }
        else System.out.println(name + " swim: " + result);
    }

    public void jump(double _meters){
        boolean result = true;
        if (_meters < 0 || _meters > 0.5){
            result = false;
        System.out.println(name + " jump: " + result);
    }
        else System.out.println(name + " jump: " + result);
    }
}
