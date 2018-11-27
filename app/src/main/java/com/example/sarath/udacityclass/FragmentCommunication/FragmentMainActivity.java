package com.example.sarath.udacityclass.FragmentCommunication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.sarath.udacityclass.R;

public class FragmentMainActivity extends AppCompatActivity implements FragmentA.FragmentAListener,FragmentB.FragmentBListener {

    private FragmentA fragmentA;
    private FragmentB fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_main);

        fragmentA = new FragmentA();
        fragmentB = new FragmentB();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container_a, fragmentA)
                .replace(R.id.container_b, fragmentB)
                .commit();
    }

    @Override
    public void onInputASent(CharSequence input) {
        fragmentB.updateEditText(input);
    }

    @Override
    public void onInputBSent(CharSequence input) {
        fragmentA.updateEditText(input);
    }
}
