package Chapter_14.ex14.four;
// comparing portions of Strings

import java.util.Scanner;

public class StringPortionscompare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program compares portions of two strings");
        System.out.println("Enter two strings to compare");
        System.out.print("1-- : ");
        String s1 = input.nextLine();
        System.out.print("2-- : ");
        String s2 = input.nextLine();
        System.out.println();
        System.out.print("Enter the starting index for first string: ");
        int s1Index = input.nextInt();
        System.out.println();

        System.out.print("Enter the starting index for second String: ");
        int s2Index = input.nextInt();
        System.out.print("Enter the number of characters to compare: ");
        int characters = input.nextInt();

        // using String method regionMatches to compare the two strings entered by the user
        if(s1.regionMatches(true,s1Index,s2, s2Index, characters))
            System.out.println("Both string regions are EQUAL with case ignored");
        else
            System.out.println("Both string regions are NOT_EQUAL");
    }
}
