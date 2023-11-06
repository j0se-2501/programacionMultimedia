package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView vV;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vV = findViewById(R.id.video);
        uri = Uri.parse(("android.resource://" + getPackageName() +
                "/" + R.raw.video));

        vV.setVideoURI(uri);

        vV.setMediaController(new MediaController(this));
        vV.requestFocus();

        vV.start();

    }
}