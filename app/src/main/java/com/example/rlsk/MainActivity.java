package com.example.rlsk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int player_one_orange_goals = 0;
        int player_one_orange_saves = 0;
        int player_one_orange_total = (player_one_orange_goals*100) + (player_one_orange_saves*50);
        int player_two_orange_goals = 0;
        int player_two_orange_saves = 0;
        int player_two_orange_total = (player_two_orange_goals*100) + (player_two_orange_saves*50);
        int player_three_orange_goals = 0;
        int player_three_orange_saves = 0;
        int player_three_orange_total = (player_three_orange_goals*100) + (player_three_orange_saves*50);
        int player_one_blue_goals = 0;
        int player_one_blue_saves = 0;
        int player_one_blue_total = (player_one_blue_goals*100) + (player_one_blue_saves*50);
        int player_two_blue_goals = 0;
        int player_two_blue_saves = 0;
        int player_two_blue_total = (player_two_blue_goals*100) + (player_two_blue_saves*50);
        int player_three_blue_goals = 0;
        int player_three_blue_saves = 0;
        int player_three_blue_total = (player_three_blue_goals*100) + (player_three_blue_saves*50);
        int blue_goals = player_one_blue_goals + player_three_blue_goals + player_two_blue_goals;
        int blue_total = player_one_blue_total + player_three_blue_total + player_two_blue_total;
        int orange_goals = player_one_orange_goals + player_two_orange_goals + player_three_orange_goals;
        int orange_total = player_one_orange_total + player_two_orange_total + player_three_orange_total;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForOrangeGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Orange_Team_Goals);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForBlueGoals(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Blue_Team_Goals);
        scoreView.setText(String.valueOf(score));
    }
}
