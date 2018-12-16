package com.example.sarath.udacityclass.Room;

import android.arch.persistence.room.Room;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sarath.udacityclass.R;

public class HomeActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    public static MyDatabase myDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        fragmentManager = getSupportFragmentManager();
        myDatabase = Room.databaseBuilder(getApplicationContext(),MyDatabase.class,"userdb").allowMainThreadQueries().build();

        if (findViewById(R.id.fragment_container)!=null){

            if (savedInstanceState!=null){
                return;
            }
            fragmentManager.beginTransaction().add(R.id.fragment_container,new HomeFragment()).commit();
        }
    }
}
