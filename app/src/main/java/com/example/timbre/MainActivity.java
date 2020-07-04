package com.example.timbre;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private Button button;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    };
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cutAudio(View view) {
        Intent cutAudio = new Intent(MainActivity.this, cutAudio.class);
        startActivity(cutAudio);
    }

    public void JoinAudio(View view) {
        Intent JoinAudio = new Intent(MainActivity.this, JoinAudio.class);
        startActivity(JoinAudio);
    }

    public void convertAudio(View view) {
        Intent convertAudio = new Intent(MainActivity.this, convertAudio.class);
        startActivity(convertAudio);
    }

    public void omitAudio(View view) {
        Intent omitAudio = new Intent(MainActivity.this, omitAudio.class);
        startActivity(omitAudio);
    }
    public void splitAudio(View view) {
        Intent splitAudio = new Intent(MainActivity.this, splitAudio.class);
        startActivity(splitAudio);
    }
    public void bitrate(View view) {
        Intent bitrate = new Intent(MainActivity.this, bitrate.class);
        startActivity(bitrate);
    }
    public void speedAudio(View view) {
        Intent speedAudio = new Intent(MainActivity.this, speedAudio.class);
        startActivity(speedAudio);
    }
    public void reverse(View view) {
        Intent reverse = new Intent(MainActivity.this, reverse.class);
        startActivity(reverse);
    }
    public void volumeAudio(View view) {
        Intent volumeAudio = new Intent(MainActivity.this, volumeAudio.class);
        startActivity(volumeAudio);
    }
    public void joinVideo(View view) {
        Intent joinVideo = new Intent(MainActivity.this, joinVideo.class);
        startActivity(joinVideo);
    }
    public void cutVideo(View view) {
        Intent cutVideo = new Intent(MainActivity.this, cutVideo.class);
        startActivity(cutVideo);
    }
    public void convertVideo(View view) {
        Intent convertVideo = new Intent(MainActivity.this, convertVideo.class);
        startActivity(convertVideo);
    }
    public void omitVideo(View view) {
        Intent omitVideo = new Intent(MainActivity.this, omitVideo.class);
        startActivity(omitVideo);
    }
    public void splitVideo(View view) {
        Intent splitVideo = new Intent(MainActivity.this, splitVideo.class);
        startActivity(splitVideo);
    }
    public void speedVideo(View view) {
        Intent speedVideo = new Intent(MainActivity.this, speedVideo.class);
        startActivity(speedVideo);
    }
    public void watermark(View view) {
        Intent watermark = new Intent(MainActivity.this, watermark.class);
        startActivity(watermark);
    }
    public void vtaVideo(View view) {
        Intent vtaVideo = new Intent(MainActivity.this, vtaVideo.class);
        startActivity(vtaVideo);
    }
    public void mute(View view) {
        Intent mute = new Intent(MainActivity.this, mute.class);
        startActivity(mute);
    }
    public void ekstrak(View view) {
        Intent ekstrak = new Intent(MainActivity.this, ekstrak.class);
        startActivity(ekstrak);
    }
    public void resize(View view) {
        Intent resize = new Intent(MainActivity.this, resize.class);
        startActivity(resize);
    }
    public void gif(View view) {
        Intent gif = new Intent(MainActivity.this, gif.class);
        startActivity(gif);
    }
    public void volumeVideo(View view) {
        Intent volumeVideo = new Intent(MainActivity.this, volumeVideo.class);
        startActivity(volumeVideo);
    }
}




