package Oct26_Assignments;

import java.util.Scanner;

public abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    double sA[];
    public A(double classOne, double classTwo, double classThree) {
        sA = new double[]{classOne, classTwo, classThree};
    }
    public double getPercentage() {
        double sum = 0;
        for (double grade : sA) { sum += grade; }
        return sum/sA.length;
    }
}

class B extends Marks {
    double sB[];
    public B(double classOne, double classTwo, double classThree, double classFour) {
        sB = new double[]{classOne, classTwo, classThree, classFour};
    }
    public double getPercentage() {
        double sum = 0;
        for (double grade : sB) { sum += grade; }
        return sum/sB.length;
    }
}

class marksDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the grades of student A (3 classes): ");
        System.out.print("Class 1: ");
        double c1 = s.nextDouble();
        System.out.print("Class 2: ");
        double c2 = s.nextDouble();
        System.out.print("Class 3: ");
        double c3 = s.nextDouble();
        A studentA = new A(c1, c2, c3);
        System.out.println("Please enter the grades of student B (4 classes): ");
        System.out.print("Class 1: ");
        c1 = s.nextDouble();
        System.out.print("Class 2: ");
        c2 = s.nextDouble();
        System.out.print("Class 3: ");
        c3 = s.nextDouble();
        System.out.print("Class 4: ");
        double c4 = s.nextDouble();
        B studentB = new B(c1, c2, c3, c4);
        s.close();
        System.out.println("Student A class average: " + studentA.getPercentage());
        System.out.println("Student B class average: " + studentB.getPercentage());
    }
}

