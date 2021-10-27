package Oct26_Assignments;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = s.nextLine();
        System.out.print("What is your roll number? ");
        int rollNum = s.nextInt();
        s.nextLine();
        System.out.print("What is your field of interest? ");
        String interest = s.nextLine();
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNum + ". My field of interest is " + interest + ".");
        s.close();
    }
}
