package com.example.rlsk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
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
    int blue_goals = 0;
    int blue_total = player_one_blue_total + player_three_blue_total + player_two_blue_total;
    int orange_goals = 0;
    int orange_total = player_one_orange_total + player_two_orange_total + player_three_orange_total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForOrangeGoals(int score) {
        TextView scoreView = findViewById(R.id.Orange_Team_Goals);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForBlueGoals(int score) {
        TextView scoreView = findViewById(R.id.Blue_Team_Goals);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPlayerOneTotalOrange(int score){
        TextView scoreView = findViewById(R.id.Player_One_Total_Orange);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPlayerOneTotalBlue(int score){
        TextView scoreView = findViewById(R.id.Player_One_Total_Blue);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPlayerTwoTotalOrange(int score){
        TextView scoreView = findViewById(R.id.Player_Two_Total_Orange);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPlayerThreeTotalOrange(int score){
        TextView scoreView = findViewById(R.id.Player_Three_Total_Orange);
        scoreView.setText(String.valueOf(score));
    }
    public void player_one_orange_goal_button(View view){
        player_one_orange_goals++;
        orange_goals++;
        player_one_orange_total = player_one_orange_total+ 100;
        TextView scoreView = findViewById(R.id.Player_One_Goals_Orange);
        scoreView.setText(String.valueOf(player_one_orange_goals));
        displayForOrangeGoals(orange_goals);
        displayForPlayerOneTotalOrange(player_one_orange_total);
    }
    public void player_one_orange_save_button(View view){
        player_one_orange_saves++;
        player_one_orange_total = player_one_orange_total + 50;
        TextView scoreView = findViewById(R.id.Player_One_Saves_Orange);
        scoreView.setText(String.valueOf(player_one_orange_saves));
        displayForPlayerOneTotalOrange(player_one_orange_total);
    }
    public void player_one_blue_goal_button(View view){
        player_one_blue_goals++;
        blue_goals++;
        player_one_blue_total = player_one_blue_total + 100;
        TextView scoreView = findViewById(R.id.Player_One_Goals_Blue);
        scoreView.setText(String.valueOf(player_one_blue_goals));
        displayForBlueGoals(blue_goals);
        displayForPlayerOneTotalBlue(player_one_blue_total);
    }
    public void player_one_blue_save_button(View view){
        player_one_blue_saves++;
        player_one_blue_total = player_one_blue_total + 50;
        TextView scoreView = findViewById(R.id.Player_One_Saves_Blue);
        scoreView.setText(String.valueOf(player_one_blue_saves));
        displayForPlayerOneTotalBlue(player_one_blue_total);
    }
    public void player_two_orange_goal_button (View view){
        player_two_orange_goals++;
        orange_goals++;
        player_two_orange_total = player_two_orange_total + 100;
        TextView scoreView = findViewById(R.id.Player_Two_Goals_Orange);
        scoreView.setText(String.valueOf(player_two_orange_goals));
        displayForPlayerTwoTotalOrange(player_two_orange_total);
        displayForOrangeGoals(orange_goals);
    }
    public void player_two_orange_save_button(View view){
        player_two_orange_saves++;
        player_two_orange_total = player_two_orange_total + 50;
        TextView scoreView = findViewById(R.id.Player_Two_Saves_Orange);
        scoreView.setText(String.valueOf(player_two_orange_saves));
        displayForPlayerTwoTotalOrange(player_two_orange_total);
    }
    public void player_three_orange_goal_button (View view){
        player_three_orange_goals++;
        orange_goals++;
        player_three_orange_total = player_three_orange_total + 100;
        TextView scoreView = findViewById(R.id.Player_Three_Goals_Orange);
        scoreView.setText(String.valueOf(player_three_orange_goals));
        displayForPlayerThreeTotalOrange(player_three_orange_total);
        displayForOrangeGoals(orange_goals);
    }
    public void player_three_orange_save_button(View view){
        player_three_orange_saves++;
        player_three_orange_total = player_three_orange_total + 50;
        TextView scoreView = findViewById(R.id.Player_Three_Saves_Orange);
        scoreView.setText(String.valueOf(player_three_orange_saves));
        displayForPlayerThreeTotalOrange(player_three_orange_total);
    }

}
