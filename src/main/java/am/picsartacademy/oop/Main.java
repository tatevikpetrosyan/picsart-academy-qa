package am.picsartacademy.oop;

import am.picsartacademy.oop.models.Employee;
import am.picsartacademy.oop.models.Student;
import am.picsartacademy.oop.models.Human;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.firstName = "Alex";
        human.lastName = "Alexanyan";
        human.age = 25;
        human.gender = 'M';
        human.married = false;
        human.nationality = "Armenian";
        human.degree = true;

        Human tatev = new Human();
        tatev.firstName = "Tatev";
        tatev.lastName = "Petrosyan";

        human.speak();
        tatev.speak();

        System.out.println(human.firstName);
        System.out.println(tatev.lastName);
        System.out.println(human.age);

        Student laura = new Student();
        laura.firstName = "Laura";
        laura.age = 22;
        laura.gender = 'F';
        laura.married = false;
        laura.university = "SEUA";
        laura.nameOfProfessor = "Pr. Hovhannisyan";
        laura.averageGrade = 10;

        System.out.println(laura.university);

        Employee emp = new Employee();
        emp.firstName = "Anna";
        emp.age = 27;
        emp.manager = "Alexan";
        emp.salary = 250000.00;

        System.out.println(emp.salary);


    }
}
