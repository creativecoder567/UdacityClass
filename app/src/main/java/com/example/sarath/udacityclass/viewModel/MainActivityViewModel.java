package com.example.sarath.udacityclass.viewModel;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

import java.util.Random;

public class MainActivityViewModel extends ViewModel {

    private String TAG = this.getClass().getSimpleName();
    private String randomNumber;


    public  String getNumber(){
        Log.i(TAG, "getNumber: ");
        if (randomNumber==null){
            createNumber();
        }
        return  randomNumber;
    }

    private void createNumber() {
        Log.i(TAG, "Create new number");
        Random random = new Random();
        randomNumber = "Number: "+(random.nextInt(10-1)+1);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        Log.i(TAG, "ViewModel Destroyed");
    }
}
