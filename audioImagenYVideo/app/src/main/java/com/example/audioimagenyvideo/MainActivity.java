package com.example.audioimagenyvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView vV;
    Uri uri;

    MediaPlayer mp;
    MediaPlayer mediaPlayer;
    Button boton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 PlayMusic();
            }
        });

        vV = findViewById(R.id.video);
        uri = Uri.parse(("android.resource://" + getPackageName() +
                "/" + R.raw.skibidi));

        vV.setVideoURI(uri);
        vV.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
        vV.setMediaController(new MediaController(this));
        vV.requestFocus();

        vV.start();


    }

    private void PlayMusic(){

        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.skibidisong);
        mediaPlayer.start();

    }


}