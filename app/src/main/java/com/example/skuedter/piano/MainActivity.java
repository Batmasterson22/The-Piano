package com.example.skuedter.piano;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "jasonsMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");


        final ImageView imageV = (ImageView) findViewById(R.id.imageView);
        imageV.setImageResource(R.drawable.c);

        ////////All the white keys////////////
        //Play C5
        final MediaPlayer c5 = MediaPlayer.create(this, R.raw.c5);
        Button play_c5 = (Button)this.findViewById(R.id.button);
        play_c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing C5");
                c5.start();
                Log.v(TAG, "Show C");
                imageV.setImageResource(R.drawable.c);
            }
        });

        //Play D5
        final MediaPlayer d5 = MediaPlayer.create(this, R.raw.d5);
        Button play_d5 = (Button)this.findViewById(R.id.button2);
        play_d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing D5");
                d5.start();
                imageV.setImageResource(R.drawable.d);
            }
        });

        //Play E5
        final MediaPlayer e5 = MediaPlayer.create(this, R.raw.e5);
        Button play_e5 = (Button)this.findViewById(R.id.button3);
        play_e5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing E5");
                e5.start();
                imageV.setImageResource(R.drawable.e);
            }
        });

        //Play F5
        final MediaPlayer f5 = MediaPlayer.create(this, R.raw.f5);
        Button play_f5 = (Button)this.findViewById(R.id.button4);
        play_f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing F5");
                f5.start();
                imageV.setImageResource(R.drawable.f);
            }
        });

        //Play G5
        final MediaPlayer g5 = MediaPlayer.create(this, R.raw.g5);
        Button play_g5 = (Button)this.findViewById(R.id.button5);
        play_g5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing G5");
                g5.start();
                imageV.setImageResource(R.drawable.g);
            }
        });

        //Play A5
        final MediaPlayer a5 = MediaPlayer.create(this, R.raw.a5);
        Button play_a5 = (Button)this.findViewById(R.id.button6);
        play_a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing A5");
                a5.start();
                imageV.setImageResource(R.drawable.a);
            }
        });

        //Play B5
        final MediaPlayer b5 = MediaPlayer.create(this, R.raw.b5);
        Button play_b5 = (Button)this.findViewById(R.id.button7);
        play_b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing B5");
                b5.start();
                imageV.setImageResource(R.drawable.b);
            }
        });

        //Play C6
        final MediaPlayer c6 = MediaPlayer.create(this, R.raw.c6);
        Button play_c6 = (Button)this.findViewById(R.id.button8);
        play_c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing C6");
                c6.start();
                imageV.setImageResource(R.drawable.c);
            }
        });


        ////////All the black keys////////////
        //Play CS5
        final MediaPlayer cs5 = MediaPlayer.create(this, R.raw.cs5);
        Button play_cs5 = (Button)this.findViewById(R.id.button11);
        play_cs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing CS5");
                cs5.start();
                imageV.setImageResource(R.drawable.cs);
            }
        });

        //Play DS5
        final MediaPlayer ds5 = MediaPlayer.create(this, R.raw.ds5);
        Button play_ds5 = (Button)this.findViewById(R.id.button12);
        play_ds5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing DS5");
                ds5.start();
                imageV.setImageResource(R.drawable.ds);
            }
        });

        //Play FS5
        final MediaPlayer fs5 = MediaPlayer.create(this, R.raw.fs5);
        Button play_fs5 = (Button)this.findViewById(R.id.button13);
        play_fs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing FS5");
                fs5.start();
                imageV.setImageResource(R.drawable.fs);
            }
        });

        //Play GS5
        final MediaPlayer gs5 = MediaPlayer.create(this, R.raw.gs5);
        Button play_gs5 = (Button)this.findViewById(R.id.button14);
        play_gs5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing GS5");
                gs5.start();
                imageV.setImageResource(R.drawable.gs);
            }
        });

        //Play AS5
        final MediaPlayer as5 = MediaPlayer.create(this, R.raw.as5);
        Button play_as5 = (Button)this.findViewById(R.id.button15);
        play_as5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing AS5");
                as5.start();
                imageV.setImageResource(R.drawable.as);
            }
        });

        Button playnow = (Button)this.findViewById(R.id.btn_playnow);
        playnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Change Activity");
                Intent myIntent = new Intent(getBaseContext(), GameActivity.class);
                startActivity(myIntent);
            }
        });

        Button learning = (Button)this.findViewById(R.id.btn_learn);
        learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Change Activity");
                Intent myIntent = new Intent(getBaseContext(), LearningActivity.class);
                startActivity(myIntent);
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
