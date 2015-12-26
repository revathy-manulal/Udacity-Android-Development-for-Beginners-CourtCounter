package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    int totalScoreA=0;
    int totalScoreB=0;
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void point3A(View view) {
        totalScoreA=totalScoreA+3;
        displayForTeamA(totalScoreA);
    }

    public void point2A(View view) {
        totalScoreA=totalScoreA+2;
        displayForTeamA(totalScoreA);
    }

    public void freeThrowA(View view) {
        totalScoreA=totalScoreA+1;
        displayForTeamA(totalScoreA);
    }

    public void point3B(View view) {
        totalScoreB=totalScoreB+3;
        displayForTeamB(totalScoreB);
    }

    public void point2B(View view) {
        totalScoreB=totalScoreB+2;
        displayForTeamB(totalScoreB);
    }

    public void freeThrowB(View view) {
        totalScoreB=totalScoreB+1;
        displayForTeamB(totalScoreB);
    }
    public void resetScore(View v) {
        totalScoreA = 0;
        totalScoreB = 0;
        displayForTeamA(totalScoreA);
        displayForTeamB(totalScoreA);
    }
}
