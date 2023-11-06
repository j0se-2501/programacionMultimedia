package com.example.videoexterno;

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

        vV = findViewById(R.id.video2);
        uri = Uri.parse("https://cdn30.savetube.me/media/U8kINfNxBdU/spiderman-kulikitaka-360-ytshorts.savetube.me.mp4");

        vV.setVideoURI(uri);

        vV.setMediaController(new MediaController(this));
        vV.requestFocus();

        vV.start();
    }
}