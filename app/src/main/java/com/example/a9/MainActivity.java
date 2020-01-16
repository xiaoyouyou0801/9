package com.example.a9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.a9.fragment.SummaryFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//
//    SummaryFragment f=new SummaryFragment();
//    FragmentManager manager=getSupportFragmentManager();
//    manager.beginTransaction().replace(R.id.la);
}
