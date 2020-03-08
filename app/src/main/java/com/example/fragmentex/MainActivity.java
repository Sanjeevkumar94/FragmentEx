package com.example.fragmentex;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button firstFragment, secondFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the reference of Button's
        firstFragment =  findViewById(R.id.btn_first_fragment);
        secondFragment = findViewById(R.id.btn_second_fragment);

        // perform setOnClickListener event on First Button
        firstFragment.setOnClickListener(this);
        secondFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_first_fragment:
                loadFragment(new FirstFragment());
                break;
            case R.id.btn_second_fragment:
                loadFragment(new SecondFragment());
                break;

        }
    }

    private void loadFragment(Fragment fragment) {

        // create a FragmentManager
        FragmentManager fragmentManager = getFragmentManager();
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();
    }
}