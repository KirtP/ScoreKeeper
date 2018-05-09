package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.android.scorekeeper.R;

import static com.example.android.scorekeeper.R.id.*;

public class MainActivity extends AppCompatActivity {

    int scoreVisitors = 0;
    int scoreHome = 0;
    private int action_settings;


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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Visitors by 6 points. Touch Down.
     */
    public void addSixForVisitors(View v) {
        scoreVisitors = scoreVisitors + 6;
        displayForVisitors(scoreVisitors);
    }

    /**
     * Increase the score for Visitors by 1 points. Extra Points.
     */
    public void addOneForVisitors(View v) {
        scoreVisitors = scoreVisitors + 1;
        displayForVisitors(scoreVisitors);
    }

    /**
     * Increase the score for Visitors by 3 point. Field Goal.
     */
    public void addThreeForVisitors(View v) {
        scoreVisitors = scoreVisitors + 3;
        displayForVisitors(scoreVisitors);
    }

    /**
     * Increase the score for Visitors by 2 point. For Conversion and Safety.
     */
    public void addTwoForVisitors(View v) {
        scoreVisitors = scoreVisitors + 2;
        displayForVisitors(scoreVisitors);
    }


    /**
     * Increase the score for Home by 6 point. Touch Down.
     */
    public void addSixForHome(View v) {
        scoreHome = scoreHome + 6;
        displayForHome(scoreHome);
    }

    /**
     * Increase the score for Home by 1 point. Extra Point.
     */
    public void addOneForHome(View v) {
        scoreHome = scoreHome + 1;
        displayForHome(scoreHome);
    }


    /**
     * Increase the score for Home by 3 point. Field Goal.
     */
    public void addThreeForHome(View v) {
        scoreHome = scoreHome + 3;
        displayForHome(scoreHome);
    }

    /**
     * Increase the score for Home by 2 point. For Conversion and Safety.
     */
    public void addTwoForHome(View v) {
        scoreHome = scoreHome + 2;
        displayForHome(scoreHome);
    }


    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreVisitors = 0;
        scoreHome = 0;
        displayForVisitors(scoreVisitors);
        displayForHome(scoreHome);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForVisitors(int score) {
        TextView scoreView = (TextView) findViewById(visitors_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForHome(int score) {
        TextView scoreView = (TextView) findViewById(home_score);
        scoreView.setText(String.valueOf(score));
    }
}
