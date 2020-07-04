package com.example.timbre;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JoinAudio extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_audio);
    }
    public void addJoin(View view) {
        Intent addJoin = new Intent(JoinAudio.this, addJoin.class);
        startActivity(addJoin);
    }
    public void JoinAudio(View view) {
    }


}
