package test.model;

public class TesterCheking {
    private String name;
    private char answer;
    private char correctAnswer;
    private boolean isCorrect;

    public TesterCheking(String name, char answer, char correctAnswer) {
        this.name = name;
        this.answer = answer;
        this.correctAnswer = correctAnswer;
        this.isCorrect = (answer == correctAnswer);
    }

    public void showResult() {
        System.out.println("Name: " + name);
        System.out.println("Answer: " + answer);
        System.out.println("Correct Answer: " + correctAnswer);
        System.out.println("Is Correct: " + isCorrect);
    }
}
 