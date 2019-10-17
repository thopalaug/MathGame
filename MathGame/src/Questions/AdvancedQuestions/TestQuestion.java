package Questions.AdvancedQuestions;

public class TestQuestion {

    private int w, x, y, z;
    private int result;
    private String question;

    private int firstNumber;
    private int secondNumber;

    public TestQuestion(){
        setW((int)(Math.random() * 50 + 1));
        setX((int)(Math.random() * 50 + 1));
        setY((int)(Math.random() * 50 + 1));
        setZ((int)(Math.random() * 50 + 1));

        int select = (int)(Math.random() * 2 + 1);

        switch (select){
            case 1:
                setQuestion("What is (" + getW() + " + " + getX() +") * (" +  getY() + " - " + getZ() +")?");
                firstNumber = getW() + getX();
                secondNumber = getY() - getZ();
                setResult(firstNumber * secondNumber);

            case 2: //Todo: fix slik at second ikke er større en first
                firstNumber = getW() * getX();
                secondNumber = getY() + getZ();

                if(firstNumber < secondNumber){

                }

                setQuestion("What is (" + getW() + " * " + getX() +") - (" +  getY() + " + " + getZ() +")?");
                setResult(firstNumber - secondNumber);

            case 3:
                setQuestion("What is (" + getW() + " - " + getX() +") + (" +  getY() + " * " + getZ() +")?");
                firstNumber = getW() - getX();
                secondNumber = getY() * getZ();
                setResult(firstNumber + secondNumber);

        }
    }

    private void checkCase2(){

        firstNumber = getW() * getX();
        secondNumber = getY() + getZ();

        if(firstNumber < secondNumber){

        }

        setW((int)(Math.random() * 50 + 1));
        setX((int)(Math.random() * 50 + 1));
        setY((int)(Math.random() * 50 + 1));
        setZ((int)(Math.random() * 50 + 1));
    }


    public int getW() {
        return w;
    }

    private void setW(int w) {
        this.w = w;
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

    public int getZ() {
        return z;
    }

    private void setZ(int z) {
        this.z = z;
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
