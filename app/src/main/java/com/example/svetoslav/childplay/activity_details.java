package com.example.svetoslav.childplay;

import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class activity_details extends AppCompatActivity {


    MediaPlayer mp        = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        View activity_details = findViewById(R.id.activity_details);
        View root = activity_details.getRootView();

        int resourceID = this.getResources().getIdentifier("pig", "drawable", this.getPackageName());

        root.setBackground(resourceID);

        ImageButton sound = (ImageButton) findViewById(R.id.kiss);


        sound.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                    soundListener();
                }
            });
    }


    public void soundListener(){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.kiss);
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
