package Chapter_14.ex14.seven;

import java.util.Scanner;

public class Latin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nProgram to translate a string to latin.....\n");
        System.out.print("Enter the sentence to translate :\n\t\t");
        String s = input.nextLine();
        String[] strings = s.split(" ");
        for (String string : strings)
        {
            printLatinWord(string);
            System.out.print(" ");
        }
    }

    static void printLatinWord(String s)
    {
        StringBuilder sb = new StringBuilder(s);
        sb.append(sb.charAt(0));
        sb.deleteCharAt(0);
        sb.append("ay");
        System.out.print(sb);
    }
}
