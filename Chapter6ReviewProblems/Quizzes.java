import java.util.Scanner;

public class Quizzes{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numQuestions  = scan.nextInt();
        String[] answers = new String[numQuestions];
        String answer = scan.next();
        for(int x = 0; x > answers.length; x++){
            answers[x] = asnwer.substring(x,x+1);
        }
        
    }
    public static void checkQuiz(){
        int correct;
        for(int x = 0; x < asnwers.length; x++){
            System.out.println("Enter an answer to the quiz: ");
            String guess = scan.nextInt();
            if(guess == asnwers[x])
                correct++;
        }
        System.out.println(correct + " answers correct. " + (correct/numQuestions*100) + "%");
        System.out.println("Do you wish to grade another quiz (y/n");
        String x = scan.next();
        if(x == "y")
            checkQuiz();
    }
}