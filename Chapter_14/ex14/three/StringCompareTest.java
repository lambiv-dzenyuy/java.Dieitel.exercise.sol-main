package Chapter_14.ex14.three;

import java.util.Scanner;

public class StringCompareTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings to compare");
        System.out.print("1-- : ");
        String s1 = input.nextLine();
        //System.out.println();
        System.out.print("2-- : ");
        String s2 = input.nextLine();

        // using compareTo to compare the two strings entered by the user
        if(s1.compareTo(s2) == 0)
            System.out.printf("%s = %s%n", s1, s2);
        else if(s1.compareTo(s2) <0)
            System.out.printf("%s < %s%n", s1, s2);
        else if(s1.compareTo(s2) > 0)
            System.out.printf("%s > %s%n", s1, s2);

    }
}
