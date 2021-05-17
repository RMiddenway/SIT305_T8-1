package com.rodnog.rogermiddenway.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playButton = findViewById(R.id.playButton);
        EditText linkEditText = findViewById(R.id.linkEditText);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent(MainActivity.this, PlayerActivity.class);
                playerIntent.putExtra("link", linkEditText.getText().toString());
                startActivity(playerIntent);

            }
        });
    }
}