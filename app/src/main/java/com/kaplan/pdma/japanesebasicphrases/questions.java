package com.kaplan.pdma.japanesebasicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class questions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }

    public void buttonTapped(View view) {

        int id = view.getId();
        String ourId = "";

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.kaplan.pdma.japanesebasicphrases"); // set the audio file names as resouceid

        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();
        Log.i("button tapped", ourId);
    }
}

