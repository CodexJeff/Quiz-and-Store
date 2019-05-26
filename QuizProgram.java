import java.util.Scanner;
public class QuizProgram {
    public static void main(String[] args) {
        final int num_of_questions = 5;
        int i = 0, random1, random2, random3, correct = 0, answer;
        while (i < num_of_questions) {
            i = i + 1;
            random1 = (int) (Math.random() * 99);
            random2 = (int) (Math.random() * random1);
            random3 = (int) (Math.random() * ((2 - 1) + 1));
            if ((random3 == 1) && (random2 != 0)){
                random2 = random2 * (-1);
                System.out.print("What is the answer to "+random1+ " " +random2+ " = ");
                answer = new Scanner(System.in).nextInt();
            }
            else {
                System.out.print("What is the answer to " + random1 + " + " + random2 + " = ");
                answer = new Scanner(System.in).nextInt();
            }
            if (random1 + random2 == answer) {
                System.out.println("You are correct!\n");
                correct ++;
            }
            else {
                System.out.println("Sorry, the correct answer is "+(random1 + random2)+".\n");
            }
        }
        System.out.print("You scored "+(correct * 100 / 5)+"% on the quiz.");
    }
}