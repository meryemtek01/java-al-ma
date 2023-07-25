package ch26_exception.salaryCalculation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        Employee employee = new Employee("iclal hanım", 12500, 60, 2020);

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println("tax  "+employee.tax());
        System.out.println("bonus  "+employee.bonus());
        System.out.println("raiseSalary"+employee.raiseSalary());
        System.out.println("employee = " + employee);

        salaryCalculate();


    }

    private static void salaryCalculate() {
        Scanner input=new Scanner(System.in);
        System.out.println("ismini gir");
        String name=input.nextLine().trim();

        System.out.println("maaşını gir");
        int salary=0;
        int workHours=0;
        int year=0;
        try {
             salary= input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("hatalı giriş yaptınız");
            salaryCalculate();
        }

        System.out.println("çalışma saati  gir");
        try {
             workHours = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("hatalı giriş yaptınız");
            salaryCalculate();
        }

        System.out.println("işe baslama yılı gir");
        try {
             year= input.nextInt();
        }catch (InputMismatchException e){
            System.out.println("hatalı giriş yaptınız");
            salaryCalculate();
        }
        Employee employee=new Employee(name,salary,workHours,year);

        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println("tax  "+employee.tax());
        System.out.println("bonus  "+employee.bonus());
        System.out.println("raiseSalary"+employee.raiseSalary());
        System.out.println("employee = " + employee);

    }
}
