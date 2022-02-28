package Chapter_14.ex14.five;

import java.security.SecureRandom;

public class RandomSentences {

    public static void main(String[] args) {
        String[] article = {"the" , "a" , "one" , "some" ,"any"};
        String[] noun = {"boy" , "girl" , "dog" , "town" ,"car"};
        String[] verb ={"drove" , "jumped" , "ran" , "walked" ,"skipped"};
        String[] preposition = {"to" , "from" , "over" , "under","on"};

        SecureRandom random = new SecureRandom();
        for(int i= 0; i<20; i++) {
            StringBuilder output = new StringBuilder();
            output.append(article[random.nextInt(5)]).append(" ").append(noun[random.nextInt(5)]).append(" ").append(verb[random.nextInt(5)]).append(" ").append(preposition[random.nextInt(5)]);
            output.setCharAt(0,
                    output.toString().toUpperCase().charAt(0));
            System.out.printf("%s %d : %s.%n", "Sentence", i + 1,output );
        }
    }
}
