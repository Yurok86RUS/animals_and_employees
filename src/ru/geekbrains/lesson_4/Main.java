package ru.geekbrains.lesson_4;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employees[] persArray= new Employees[5];
        persArray[0] = new Employees("Kolesnikov", "chief specialist", "qwe1@qwe.ru", 0123456, 999999, 28);
        persArray[1] = new Employees("Ivanov", "ingenere", "qwe2@qwe.ru", 1234567, 888888, 38);
        persArray[2] = new Employees("Petrov", "manager", "qwe3@qwe.ru", 2345678, 777777, 48);
        persArray[3] = new Employees("Sidorov", "cleaner", "qwe4@qwe.ru", 3456789, 666666, 58);
        persArray[4] = new Employees("Zalupenko", "the big boss", "qwe5@qwe.ru", 4567890, 555555, 18);

//        Employees employees1 = new Employees("Kolesnikov Yu. S.", "chief specialist", "qwe@qwe.ru", 1234567890, 123456, 28);
//        employees1.getEmployees();
        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].age >= 40){
                persArray[i].getEmployees();
            }
        }

        Cat cat = new Cat("");
        Dog dog = new Dog("");

            cat.Jump(2);
            cat.Run(185);
            cat.Swim(3);
            dog.Jump(2);
            dog.Run(185);
            dog.Swim(3);

    }
}
