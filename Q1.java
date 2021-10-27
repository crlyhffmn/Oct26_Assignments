package Oct26_Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Calculating the area of a rectangle...");
        System.out.print("Enter the length of your rectangle (double): ");
        Double length = s.nextDouble();
        System.out.print("Enter the width of your rectangle (double): ");
        Double width = s.nextDouble();
        s.close();
        int area = (int)(length * width);
        System.out.println("The area of your rectangle (int) is: " + area);
    }
}
