package com.agames.arcadegames.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.agames.arcadegames.R;
import com.agames.arcadegames.adapters.GamesList;
import com.agames.arcadegames.utils.GameInfo;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.lv_games) ListView lv_games;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        lv_games.setAdapter(
                new GamesList( this, R.layout.gamelist_adapter, GameInfo.loadGames() )
        );

    }

}
