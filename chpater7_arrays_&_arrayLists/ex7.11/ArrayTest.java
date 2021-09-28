import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) 
    {
        int[] counts = new int[10]; 
        int[] bonus = { 1, 2, 3, 4,5 ,6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int[] bestScores = {99, 98, 97, 100, 96};

        //assingning zeros to all counts
        Arrays.fill(counts, 0);
        System.out.printf("Array of zero counts%n");
        //display the filled count of zero
        for (int count : counts)
            System.out.printf("%d ", count);

        System.out.println();
        System.out.printf("Array bonus with a bonus of 1 for each%n");
        //add 1 to each element in bonus
        for (int element : bonus)
          {  element ++;
            System.out.printf("%d ", element);
        }

        System.out.println();
        //printing bestScores in coumn form
        System.out.printf("best Scores%n");
        for (int score : bestScores)
        {
            System.out.printf("%d %n", score);
        }
    }
    
}
