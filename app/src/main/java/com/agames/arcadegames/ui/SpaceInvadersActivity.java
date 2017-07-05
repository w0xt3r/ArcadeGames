package com.agames.arcadegames.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.agames.arcadegames.R;

import butterknife.ButterKnife;

public class SpaceInvadersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space_invaders);
        ButterKnife.bind(this);
    }

}
