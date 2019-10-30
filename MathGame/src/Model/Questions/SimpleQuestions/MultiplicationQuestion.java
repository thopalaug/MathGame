package Model.Questions.SimpleQuestions;

public class MultiplicationQuestion {

    private int x, y;
    private int result;
    private String question;

    public MultiplicationQuestion(){

        setX((int)(Math.random() * 15 + 1));
        setY((int)(Math.random() * 15 + 1));
        setQuestion("What is " + getX() + " * " + getY() + "?");
        setResult(getX() * getY());

    }

    public int getX() {
        return x;
    }

    private void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    private void setY(int y) {
        this.y = y;
    }

    public int getResult() {
        return result;
    }

    private void setResult(int result) {
        this.result = result;
    }

    public String getQuestion() {
        return question;
    }

    private void setQuestion(String question) {
        this.question = question;
    }
}
