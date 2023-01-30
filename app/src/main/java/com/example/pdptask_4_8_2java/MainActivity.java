package com.example.pdptask_4_8_2java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.pdptask_4_8_2java.data.DataClass;
import com.example.pdptask_4_8_2java.fragment.data.FirstFragment;
import com.example.pdptask_4_8_2java.fragment.data.SecondFragment;

public class MainActivity extends AppCompatActivity implements FirstFragment.FirstListener {

    FirstFragment fragmentFirst;
    SecondFragment fragmentSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    @Override
    public void onFirstSend(DataClass dataClass) {
        fragmentSecond.updateSecondFragment(dataClass);
    }


    void initViews(){
        fragmentFirst = new FirstFragment();
        fragmentSecond = new SecondFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_first, fragmentFirst)
                .replace(R.id.frame_second, fragmentSecond)
                .commit();
    }
}