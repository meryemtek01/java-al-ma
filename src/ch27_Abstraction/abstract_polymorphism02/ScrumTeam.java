package ch27_Abstraction.abstract_polymorphism02;

import java.util.ArrayList;

public abstract class ScrumTeam {
    public String name, jobTitle;
    public double salary;

    public abstract void DailyStandUp();

    public abstract void Demo();

    public void getEmployeeInfo() {

        System.out.println("******************");
        System.out.println("employee name :  " + this.name +
                "\n job Title : " + this.jobTitle +
                "\n Salary : " + this.salary);

        System.out.println("**************************");

    }
}

class Testers extends ScrumTeam {

    public Testers(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    @Override
    public void DailyStandUp() {
        System.out.println("Tester " + name + " is working");

    }

    @Override
    public void Demo() {

        System.out.println("Tester  " + name + "is doing demo");

    }
}

class Developers extends ScrumTeam {
    public Developers(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    @Override
    public void DailyStandUp() {
        System.out.println("Developers " + name + " is working");
    }

    @Override
    public void Demo() {
        System.out.println("Developers  " + name + "is doing demo");
    }

}

class BOA {
    public static void main(String[] args) {
        Testers tester1 = new Testers("ahmet", "Tester", 500);
        Testers tester2 = new Testers("iclal", "Tester", 800);
        Testers tester3 = new Testers("Emine", "Tester", 600);
        ScrumTeam[] testerArr = {tester1, tester2, tester3};
        for (ScrumTeam tester : testerArr) {
            tester.getEmployeeInfo();
        }

        Developers developer1 = new Developers("ahmet", "Tester", 500);
        Developers developer2 = new Developers("iclal", "Tester", 800);
        Developers developer3 = new Developers("Emine", "Tester", 600);

        ScrumTeam[] developerArr = {developer1, developer2, developer3};
        for (ScrumTeam developer : developerArr) {

            developer.getEmployeeInfo();
        }
    }

}
