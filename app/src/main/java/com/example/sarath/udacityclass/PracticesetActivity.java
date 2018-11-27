package com.example.sarath.udacityclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PracticesetActivity extends AppCompatActivity {

    TextView tvSolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practiceset);

        tvSolution=findViewById(R.id.tvSolution);

        int weekday = 5;
        int weekend = 9;
        int optimalHours = 7 * 8;

        int day1 = 15;
        int day2 = 22;
        int day3 = 18;
        display(day1 + day2 + day3 / 3);
/*
        int actualHours = weekday;
        actualHours = actualHours + weekend * 2;
        int solution = optimalHours - actualHours;
        display(solution);*/

        String firstName = "Lyla";
        String lastName = "Fujiwara";
        String contactInfo = firstName + " " + lastName;
        contactInfo = "<" + lastName + "." + firstName + "@justjava.com>";
        display(contactInfo);
    }

    private void display(String contactInfo) {
        TextView t = findViewById(R.id.tvSolution);
        t.setText(contactInfo);
    }

    private void display(int i) {
       //tvSolution.setText(solution+"");
        TextView t = (TextView) findViewById(R.id.tvSolution);
        t.setText(""+i);
    }
}
