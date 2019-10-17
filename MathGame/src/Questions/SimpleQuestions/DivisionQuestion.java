package Questions.SimpleQuestions;

public class DivisionQuestion {

    private int x, y;
    private int result;
    private String question;

    public DivisionQuestion(){
        checkResult();
    }

    private void checkResult(){
        setX((int)(Math.random() * 150 + 1));
        setY((int)(Math.random() * 100 + 1));
        if(x % y == 0){
            setResult(getX() / getY());
            setQuestion("What is " + getX() + " / " + getY() + "?");
        }else{
            checkResult();
        }
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
