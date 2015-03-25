package com.example.skuedter.piano;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    private static final String TAG = "jasonsMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        ////////All the white keys////////////
        //Play C5
        final MediaPlayer c5 = MediaPlayer.create(this, R.raw.c5);
        Button play_c5 = (Button)this.findViewById(R.id.button);
        play_c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing C5");
                c5.start();
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
            }
        });

        //Play D6
        final MediaPlayer d6 = MediaPlayer.create(this, R.raw.d6);
        Button play_d6 = (Button)this.findViewById(R.id.button9);
        play_d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing D6");
                d6.start();
            }
        });

        //Play E6
        final MediaPlayer e6 = MediaPlayer.create(this, R.raw.e6);
        Button play_e6 = (Button)this.findViewById(R.id.button10);
        play_e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing E6");
                e6.start();
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
            }
        });

        //Play CS6
        final MediaPlayer cs6 = MediaPlayer.create(this, R.raw.cs6);
        Button play_cs6 = (Button)this.findViewById(R.id.button16);
        play_cs6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing CS6");
                cs6.start();
            }
        });

        //Play DS6
        final MediaPlayer ds6 = MediaPlayer.create(this, R.raw.ds6);
        Button play_ds6 = (Button)this.findViewById(R.id.button17);
        play_ds6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing DS6");
                ds6.start();
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
