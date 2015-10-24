package com.xuie.vlc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.start_vlc)
    public void startVlc() {
        Intent intent = new Intent(MainActivity.this, org.videolan.vlc.gui.MainActivity.class);
        startActivity(intent);
    }
}
