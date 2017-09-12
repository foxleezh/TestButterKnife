package com.foxlee.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragmentJumpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_jump);
        BlankFragment fragment = new BlankFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fl_content, fragment)
                .commit();
    }
}
