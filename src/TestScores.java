import java.util.Arrays;
import java.util.Scanner;

public class TestScores {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        /*
        Initiate an empty array to fill. Initiate a base score to compare the first time.
        Design a loop with an input prompt.
        use if statements to compare each incoming score and stores it if its the
        highest or lowest or the two.
         Use while loop to re-initiate session if desired.
         */
        System.out.println("Enter 'y' to initiate program. Anything else to end.");
        String re_initiate = scn.next();
        while (re_initiate.equals("y")){
            System.out.println("Please enter the number of test scores: ");
            int num_tests = scn.nextInt();          //initializing all the variable i need in the loop
            int score_highest = 0;
            int score_lowest = 200;
            int score_sum = 0;
            int score_array[];
            score_array = new int[num_tests];
            for (int i=0; i<=num_tests-1; i++){
                System.out.println("("+(i+1)+") Enter next test score here: ");
                int score_input = scn.nextInt();
                score_array[i] = score_input;
                score_sum += score_input;
                if (score_highest<score_input){             //Compare input score to previous highest.
                    score_highest = score_input;            //Store highest as new highest. Add input to array.
                }                                           //Same for lowest.
                if(score_lowest>score_input){
                    score_lowest = score_input;
                }
                if (i == num_tests-1){
                    double score_average = (Double.valueOf(score_sum)/Double.valueOf(num_tests));   //use Double.valueOf() to calculate
                    System.out.println("Highest: "+score_highest);                                  //the average score to a decimal place.
                    System.out.println("Lowest: "+score_lowest);                                    //
                    System.out.println("The average score was: "+score_average);
                    System.out.println("All Scores: "+Arrays.toString(score_array));

                }
            }
            System.out.println("Enter 'y' to initiate program. Anything else to end. ");
            re_initiate = scn.next();
        }
    }
}
