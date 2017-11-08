package com.example.scott.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RockPaperScissorActivity extends AppCompatActivity {

    private ArrayList<String> choices;
    private TextView opponentMove;
    private TextView resultText;
    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;
    private TextView youScore;
    private TextView computerScore;
    private Integer yourScore;
    private Integer computersScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissor);
        opponentMove = (TextView)findViewById(R.id.opponent_move);
        resultText = (TextView)findViewById(R.id.result_text);
        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorsButton = (Button)findViewById(R.id.scissors_button);
        this.choices = new ArrayList<>();
        youScore = (TextView)findViewById(R.id.your_score);
        computerScore = (TextView)findViewById(R.id.computer_score);
        yourScore = 0;
        computersScore = 0;
    }

    public ArrayList<String> getChoices(){
        choices.add(0, "Rock");
        choices.add(1, "Paper");
        choices.add(2, "Scissors");
        return choices;
    }

    public String randChoice(){
        Random rand = new Random();
        int choiceSize = getChoices().size();
        int random = rand.nextInt(choiceSize);
        return getChoices().get(random);
    }

    public String play(String choice) {
        String opponentResult = randChoice();
        if(opponentResult == choice){
            opponentMove.setText(opponentResult);
            resultText.setText("Draw!");
            return "Draw!";
        }
        else if(opponentResult == "Rock" && choice == "Paper"){
            resultText.setText("You win!");
            opponentMove.setText("Rock");
            yourScore += 1;
            return "You win!";
        }
        else if(opponentResult == "Rock" && choice == "Scissors"){
            resultText.setText("You lose!");
            opponentMove.setText("Rock");
            computersScore += 1;
            return "You lose!";
        }
        else if(opponentResult == "Paper" && choice == "Scissors"){
            resultText.setText("You win!");
            opponentMove.setText("Paper");
            yourScore += 1;
            return "You win!";
        }
        else if(opponentResult == "Paper" && choice == "Rock"){
            resultText.setText("You lose!");
            opponentMove.setText("Paper");
            computersScore += 1;
            return "You lose!";
        }
        else if(opponentResult == "Scissors" && choice == "Paper"){
            resultText.setText("You lose!");
            opponentMove.setText("Scissors");
            computersScore += 1;
            return "You lose!";
        }
        else if(opponentResult == "Scissors" && choice == "Rock"){
            resultText.setText("You win!");
            opponentMove.setText("Scissors");
            yourScore += 1;
            return "You win!";
        }

        return "Play again?";

    }

    public void onPaperButtonClicked(View button) {
        Log.d(getClass().toString(), "onPaperButtonClicked was called");
        play("Paper");
//        youScore.setText(yourScore);
//        computerScore.setText(computersScore);
//        Thread.sleep(4000);
//        resultText.setText("--");
//        opponentMove.setText("--");
    }

    public void onRockButtonClicked(View button) {
        Log.d(getClass().toString(), "onRockButtonClicked was called");
        play("Rock");
//        youScore.setText(yourScore);
//        computerScore.setText(computersScore);
    }

    public void onScissorsButtonClicked(View button) {
        Log.d(getClass().toString(), "onScissorsButtonClicked was called");
        play("Scissors");
//        youScore.setText(yourScore);
//        computerScore.setText(computersScore);
    }

}
