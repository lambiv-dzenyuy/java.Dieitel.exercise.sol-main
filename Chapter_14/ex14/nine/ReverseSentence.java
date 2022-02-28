package Chapter_14.ex14.nine;
//Displaying a Sentence with Its Words Reversed

import java.util.Scanner;

public class ReverseSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence to reverse: \n\t\t--");
        String s = input.nextLine();
        String[] strings = s.split(" ");
        for (int i = strings.length-1; i>=0; i--){
            System.out.print(strings[i].concat(" "));
        }
    }
}
