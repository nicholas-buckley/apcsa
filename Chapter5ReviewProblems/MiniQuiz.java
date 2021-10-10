public class MiniQuiz{
    public static void main(String[] args){
        Question q1, q2;
        String possible;

        q1 = new Question("What is the capital of Jamica?", "Kingston");
        q1.setComplexit(4);

        q2 = new Question("Which is worse, ignorance or apathy?", "I don't know I don't care");
        q2.setComplexit(10);

        System.out.println(q1.getQuestion());
        System.out.println("(Level: " + q1.getComplexity() + ")");
        possible = "";
        if(q1.answerCorrect(possible))
            System.out.println("Correct");
        else
            System.out.println("No, the answer is " + q1.getAnswer());

        System.out.println();
        System.out.println(q2.getQuestion());
        System.out.println("(Level: " + q2.getComplexity() + ")");
        possible = "";
        if(q1.answerCorrect(possible))
            System.out.println("Correct");
        else
            System.out.println("No, the answer is " + q2.getAnswer());
    }
}