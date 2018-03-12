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

        int actualHours = weekday;
        actualHours = actualHours + weekend * 2;
        int solution = optimalHours - actualHours;
        display(solution);
    }

    private void display(int i) {
       //tvSolution.setText(solution+"");
        TextView t = (TextView) findViewById(R.id.tvSolution);
        t.setText(""+i);
    }
}
