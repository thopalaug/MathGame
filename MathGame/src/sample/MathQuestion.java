package sample;

import Questions.AdvancedQuestions.TestQuestion;
import Questions.SimpleQuestions.AdditionQuestion;
import Questions.SimpleQuestions.DivisionQuestion;
import Questions.SimpleQuestions.MultiplicationQuestion;
import Questions.SimpleQuestions.SubtractionQuestion;

public class MathQuestion {

    private int result;
    private String question;


    public MathQuestion(){
        int select = (int)(Math.random() * 5 + 1);


        switch(select){

            case 1:
                AdditionQuestion AQ = new AdditionQuestion();
                setResult(AQ.getResult());
                setQuestion(AQ.getQuestion());
                break;
            case 2:
                SubtractionQuestion SQ = new SubtractionQuestion();
                setResult(SQ.getResult());
                setQuestion(SQ.getQuestion());
                break;
            case 3:
                MultiplicationQuestion MQ = new MultiplicationQuestion();
                setResult(MQ.getResult());
                setQuestion(MQ.getQuestion());
                break;
            case 4:
                DivisionQuestion DQ = new DivisionQuestion();
                setResult(DQ.getResult());
                setQuestion(DQ.getQuestion());

            case 5:
                TestQuestion TQ = new TestQuestion();
                setResult(TQ.getResult());
                setQuestion(TQ.getQuestion());


        }
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
