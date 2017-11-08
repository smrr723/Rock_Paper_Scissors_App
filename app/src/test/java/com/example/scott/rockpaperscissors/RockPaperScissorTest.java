package com.example.scott.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by scott on 08/11/2017.
 */

public class RockPaperScissorTest {

    RockPaperScissorActivity rockPaperScissorActivity;
//    ArrayList<String> choices;



    @Before
    public void setUp() throws Exception {
        rockPaperScissorActivity = new RockPaperScissorActivity();
//        choices = new ArrayList<>();
//        choices.add(0, "Rock");
//        choices.add(1, "Paper");
//        choices.add(2, "Scissors");
    }

    @Test
    public void canGetChoicesTest() throws Exception {
        assertNotNull(rockPaperScissorActivity.getChoices());
//        assertEquals("Rock", rockPaperScissorActivity.getChoices().get(0));
    }

//    @Test
//    public void playTest(){
//        String resultPaper = rockPaperScissorActivity.play("Paper");
//        String resultRock = rockPaperScissorActivity.play("Rock");
//        String resultScissors = rockPaperScissorActivity.play("Scissors");
//        assertEquals("You win!", resultScissors);
//    }

}
