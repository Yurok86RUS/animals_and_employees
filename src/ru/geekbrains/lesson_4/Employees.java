package ru.geekbrains.lesson_4;

public class Employees {
    String fullName, position, email;
    int telephone, age;
    double salary;

    public Employees(String _fullName, String _position, String _email, int _telephone, double _salary, int _age){

        fullName = _fullName;
        position = _position;
        email = _email;
        telephone = _telephone;
        salary = _salary;
        age = _age;

    }

    public void getEmployees(){
        System.out.println(this.fullName + ", " + this.position + ", " + this.email + ", " + this.telephone + ", " + this.salary + ", " + this.age);
    }
}
