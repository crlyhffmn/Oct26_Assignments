package Oct26_Assignments;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Let's calculate the average of three numbers!");
        System.out.print("Number 1: ");
        double a = s.nextDouble();
        System.out.print("Number 2: ");
        double b = s.nextDouble();
        System.out.print("Number 3: ");
        double c = s.nextDouble();
        s.close();
        Average(a, b, c);
    }

    public static void Average(double a, double b, double c) {
        double avg = (a + b + c)/3;
        System.out.println("The average is: " + avg);
    }
}
