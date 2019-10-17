package sample;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    private MathQuestion question;
    private int score = 0;
    private int questionSkipped = 0;

    @FXML
    Label scoreCounter;
    @FXML
    Label questionField;
    @FXML
    Label resultField;
    @FXML
    TextField userInputField;
    @FXML
    Button guessButton;
    @FXML
    Button newQuestionButton;
    @FXML
    Button skipButton;


    @FXML
    public void initialize(){

        updateScore();
        userInputField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                userInputField.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        updateScreen();
    }


    @FXML
    public void handleGuessButton(){

        if(userInputField.getText().trim().isEmpty()){
            resultField.setText("You need to enter a guess");
        }else{
            int result = question.getResult();
            int userGuess = Integer.parseInt(userInputField.getText());

            if (userGuess == result) {
                score++;
                updateScore();
                resultField.setText("Correct! It is " + question.getResult() + "!");
                newQuestionButton.setDisable(false);
                skipButton.setDisable(true);
            } else {
                score--;
                updateScore();
                resultField.setText("Wrong! The answer is " + question.getResult());
                newQuestionButton.setDisable(false);
                skipButton.setDisable(true);
            }
            guessButton.setDisable(true);
            disableInputField();
        }
    }

    @FXML
    public void handleNewQuestionButton(){
        resultField.setText("");
        guessButton.setDisable(false);
        userInputField.setEditable(true);
        skipButton.setDisable(false);
        updateScreen();
    }


    @FXML
    public void handleSkipButton(){
        resultField.setText("That's alright. The answer is " + question.getResult());
        questionSkipped++;
        updateScore();
        guessButton.setDisable(true);
        newQuestionButton.setDisable(false);
        disableInputField();
        skipButton.setDisable(true);
    }


    private void disableInputField(){
        userInputField.clear();
        userInputField.setEditable(false);
    }

    private void updateScore(){
        scoreCounter.setText("Your score: " + score + ". Questions skipped: " + questionSkipped);
    }

    private void updateScreen(){
        MathQuestion question = new MathQuestion();
        setQuestion(question);
        questionField.setText(question.getQuestion());
        newQuestionButton.setDisable(true);
    }

    private void setQuestion(MathQuestion question) {
        this.question = question;
    }
}

