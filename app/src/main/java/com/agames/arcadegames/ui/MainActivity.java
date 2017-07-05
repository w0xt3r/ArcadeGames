package com.agames.arcadegames.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.agames.arcadegames.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_invaders)
    public void playInvaders() {
        intent = new Intent(this, SpaceInvadersActivity.class);
        startActivity(intent);
        this.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @OnClick(R.id.btn_arkanoid)
    public void playArkanoid() {
        Toast.makeText(this, "Not ready yet", Toast.LENGTH_SHORT).show();
    }

}
