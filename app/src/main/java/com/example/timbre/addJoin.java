package com.example.timbre;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.storage.StorageReference;

import java.io.IOException;

public class addJoin extends AppCompatActivity {
    private StorageReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_join);
    }
    public void addJoin(View view) {
        MediaPlayer mediaPlayer=new MediaPlayer();
        try{
            mediaPlayer.setDataSource("https://firebasestorage.googleapis.com/v0/b/timbre-eb9b7.appspot.com/o/audio%2FIksan%20Skuter%20%20%20Rindu%20Sahabat.mp3?alt=media&token=fac394a0-11dd-481d-a619-aac0aa3cf726");
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                @Override
                public boolean onInfo(MediaPlayer mp, int what, int extra) {
                    return false;
                }
            });

            mediaPlayer.getTrackInfo();
        }catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}

