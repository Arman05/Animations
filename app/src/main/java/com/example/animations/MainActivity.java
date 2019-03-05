package com.example.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view) {

        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.animate()
                .translationXBy(1000f)
                .translationXBy(1000f)
                .rotationBy(3600)
                .setDuration(2000);

        //bart.animate().rotation(720f).scaleX(0.5f).scaleY(0.5f).setDuration(2000);

        //bart.animate().rotation(1000f).setDuration(2000);

        //bart.animate().translationYBy(1000f).setDuration(2000);

        //bart.animate().translationXBy(-1000f).setDuration(2000);

        // ImageView homer = (ImageView) findViewById(R.id.homer);

        // homer.animate().alpha(1f).setDuration(2000);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.setTranslationX(-1000f);
        bart.setTranslationX(-1000f);

        /*

        ImageView bart = (ImageView) findViewById(R.id.bart);

        bart.setTranslationX(-1000f);
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}
