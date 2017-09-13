package com.foxlee.test;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.btn_jump)
    Button btnJump;

    @BindString(R.string.jump)
    String stringJump;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        unbinder=ButterKnife.bind(this);

        btnJump.setText(stringJump);
    }


    @OnClick(R.id.btn_jump)
    public void onViewClicked() {
        startActivity(new Intent(this,FragmentJumpActivity.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
