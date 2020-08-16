package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String QUESTION_ANSWER = "cincinnati";
    private static final int CORRECT_QUESTION_VALUE = 20;

    int score = 0;
    private EditText rhinegeist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitScore(View view) {
        CheckBox checkBoxTruth = (CheckBox) findViewById(R.id.truth);
        boolean hasTruth = checkBoxTruth.isChecked();

        CheckBox checkBoxCougar = (CheckBox) findViewById(R.id.cougar);
        boolean hasCougar = checkBoxCougar.isChecked();

        RadioButton radioButtonBubbles = (RadioButton) findViewById(R.id.bubbles);
        boolean hasBubbles = radioButtonBubbles.isChecked();

        RadioButton radioButtonChester = (RadioButton) findViewById(R.id.chester);
        boolean hasChester = radioButtonChester.isChecked();

        RadioButton radioButtonDruncle = (RadioButton) findViewById(R.id.druncle);
        boolean hasDruncle = radioButtonDruncle.isChecked();

        RadioButton radioButtonGramma = (RadioButton) findViewById(R.id.gramma);
        boolean hasGramma = radioButtonGramma.isChecked();

        RadioButton radioButtonStryker = (RadioButton) findViewById(R.id.stryker);
        boolean hasStryker = radioButtonStryker.isChecked();

        RadioButton radioButtonTrips = (RadioButton) findViewById(R.id.trips);
        boolean hasTrips = radioButtonTrips.isChecked();

        rhinegeist = (EditText) findViewById(R.id.rhinegeistLocation);

        // Calculate the score
        int score = calculateScore(hasTruth, hasCougar, hasBubbles, hasChester,
                hasDruncle, hasGramma, hasStryker, hasTrips);

        score += gradeQuestionFive();

        //Display a toast for the score
        final String gradeText = String.format(getString(R.string.answer_text), score);
        Toast.makeText(getApplicationContext(), gradeText, Toast.LENGTH_LONG).show();

    }

    public void onCheckboxClicked(View view) {
        // Declaration for CheckBox question 1
        boolean checked = ((CheckBox) view).isChecked();

        // Select both of the CheckBoxes for question 1
        switch (view.getId()) {
            case R.id.truth:
                //If Truth CheckBox is checked, then break
                if (checked) {
                    break;
                }
                // If Truth CheckBox is not checked, break
                else
                    break;
            case R.id.cougar:
                // If Cougar CheckBox is checked, break
                if (checked) {
                    break;
                }
                else
                    break;
        }
    }

    public void onRadioButtonClicked(View view) {
        // Declaration for RadioButton question 2
        boolean checked = ((RadioButton) view).isChecked();

        // Determine which RadioButton is checked for question 2
        switch (view.getId()) {
            case R.id.bubbles:
                // If Bubbles RadioButton is checked, break
                if (checked) {
                    break;
                }
                // If Bubbles RadioButton is not checked, break
                else
                    break;
            case R.id.chester:
                // If Chester RadioButton is checked, break
                if (checked) {
                    break;
                }
        }

        // Determine which RadioButton is checked for question 3
        switch (view.getId()) {
            case R.id.druncle:
                // If Druncle RadioButton is checked, break
                if (checked) {
                    break;
                }
                // If Druncle RadioButton is not checked, break
                else
                    break;
            case R.id.gramma:
                // If Gramma RadioButton is checked, break
                if (checked) {
                    break;
                }
        }

        // Determine which RadioButton is checked for question 4
        switch (view.getId()) {
            case R.id.stryker:
                // If Stryker RadioButton is checked, break
                if (checked) {
                    break;
                }
                // If Stryker RadioButton is not check, break
                else
                    break;
            case R.id.trips:
                // if Trips RadioButton is checked, break
                if (checked) {
                    break;
                }
        }
    }

    private int calculateScore(boolean hasTruth, boolean hasCougar, boolean hasBubbles, boolean hasChester,
                               boolean hasDruncle, boolean hasGramma,
                               boolean hasStryker, boolean hasTrips) {
        int score = 0;

        if (hasTruth)
            score = score + 10;
        if (hasCougar)
            score = score + 10;
        if (hasBubbles)
            score = score + 20;
        if (hasDruncle)
            score = score + 20;
        if (hasStryker)
            score = score + 20;
        if (hasChester)
            score = score + 0;
        if (hasGramma)
            score = score + 0;
        if (hasTrips)
            score = score + 0;
        return score;
    }

    private int gradeQuestionFive() {
        if (rhinegeist != null && rhinegeist.getText().length() > 0) {
            final String userAnswer = rhinegeist.getText().toString();
            return userAnswer.equalsIgnoreCase(QUESTION_ANSWER) ? CORRECT_QUESTION_VALUE : 0;
        }
        return 0;
    }
}

