package com.example.timbre;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.storage.StorageReference;

import java.io.IOException;

public class omitAudio extends AppCompatActivity {
    private StorageReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.omit_audio);
    }

    public void omitAudio(View view) {
        final MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/timbre-eb9b7.appspot.com/o/audio%2FIksan%20Skuter%20%20%20Rindu%20Sahabat.mp3?alt=media&token=fac394a0-11dd-481d-a619-aac0aa3cf726");
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.start();
                }
            });
            mediaPlayer.prepare();
            Button stopAudio=(Button) findViewById(R.id.stopAudio);
            stopAudio.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mediaPlayer.stop();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



