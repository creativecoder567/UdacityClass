package com.example.sarath.udacityclass.architectural_components;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sarath.udacityclass.R;
import com.example.sarath.udacityclass.architectural_components.ui.architecturemain.ArchitectureMainFragment;

public class ArchitectureMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.architecture_main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ArchitectureMainFragment.newInstance())
                    .commitNow();
        }
    }
}
