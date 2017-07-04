package com.example.brucewayne.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numOfShotsA = 0;
    int numOfShotsB = 0;
    int numOfFoulsA = 0;
    int numOfFoulsB = 0;
    int numOfYellowA = 0;
    int numOfYellowB = 0;
    int numOfRedA = 0;
    int numOfRedB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // display number of shots for team A
    public void displayShotsForA(int numOfShots) {
        TextView shotView = (TextView) findViewById(R.id.team_a_shots);
        shotView.setText(String.valueOf(numOfShots));
    }

    // display number of shots for team B
    public void displayShotsForB(int numOfShots) {
        TextView shotView = (TextView) findViewById(R.id.team_b_shots);
        shotView.setText(String.valueOf(numOfShots));
    }

    // display number of fouls for team A
    public void displayFoulsForA(int numOfFouls) {
        TextView shotView = (TextView) findViewById(R.id.team_a_fouls);
        shotView.setText(String.valueOf(numOfFouls));
    }

    // display number of fouls for team B
    public void displayFoulsForB(int numOfFouls) {
        TextView shotView = (TextView) findViewById(R.id.team_b_fouls);
        shotView.setText(String.valueOf(numOfFouls));
    }

    // display number of yellow cards for team A
    public void displayYellowForA(int numOfYellow) {
        TextView shotView = (TextView) findViewById(R.id.team_a_yellow);
        shotView.setText(String.valueOf(numOfYellow));
    }

    // display number of yellow cards for team B
    public void displayYellowForB(int numOfYellow) {
        TextView shotView = (TextView) findViewById(R.id.team_b_yellow);
        shotView.setText(String.valueOf(numOfYellow));
    }

    // display number of red cards for team A
    public void displayRedForA(int numOfRed) {
        TextView shotView = (TextView) findViewById(R.id.team_a_red);
        shotView.setText(String.valueOf(numOfRed));
    }

    // display number of red cards for team B
    public void displayRedForB(int numOfRed) {
        TextView shotView = (TextView) findViewById(R.id.team_b_red);
        shotView.setText(String.valueOf(numOfRed));
    }

    public void goalForA(View view) {
        numOfShotsA += 1;
        displayShotsForA(numOfShotsA);
    }

    public void goalForB(View view) {
        numOfShotsB += 1;
        displayShotsForB(numOfShotsB);
    }

    public void foulForA(View view) {
        numOfFoulsA += 1;
        displayFoulsForA(numOfFoulsA);
    }

    public void foulForB(View view) {
        numOfFoulsB += 1;
        displayFoulsForB(numOfFoulsB);
    }

    public void yellowForA(View view) {
        numOfYellowA += 1;
        displayYellowForA(numOfYellowA);
    }

    public void yellowForB(View view) {
        numOfYellowB += 1;
        displayYellowForB(numOfYellowB);
    }

    public void redForA(View view) {
        numOfRedA += 1;
        displayRedForA(numOfRedA);
    }

    public void redForB(View view) {
        numOfRedB += 1;
        displayRedForB(numOfRedB);
    }

    public void reset(View view) {
        numOfShotsA = 0;
        numOfShotsB = 0;
        numOfFoulsA = 0;
        numOfFoulsB = 0;
        numOfYellowA = 0;
        numOfYellowB = 0;
        numOfRedA = 0;
        numOfRedB = 0;

        displayShotsForA(numOfShotsA);
        displayShotsForB(numOfShotsB);
        displayFoulsForA(numOfFoulsA);
        displayFoulsForB(numOfFoulsB);
        displayYellowForA(numOfYellowA);
        displayYellowForB(numOfYellowB);
        displayRedForA(numOfRedA);
        displayRedForB(numOfRedB);
    }
}
