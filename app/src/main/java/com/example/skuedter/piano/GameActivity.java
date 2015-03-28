package com.example.skuedter.piano;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.concurrent.TimeUnit;


public class GameActivity extends ActionBarActivity {

    private static final String TAG = "jasonsMessage";
    private static String[] toBattle = new String[3];
    private static String[] toCheckBattle = new String[3];
    private static Boolean toSave = false;
    private static Boolean toCheck = false;
    private static Integer count = 0;


    private boolean CheckTheNotes()
    {
        if (toBattle[0].equals(toCheckBattle[0]))
        {
            if (toBattle[1].equals(toCheckBattle[1]))
            {
                if (toBattle[2].equals(toCheckBattle[2]))
                {
                    return true;

                }
            }
        }

        return false;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Log.i(TAG, "onCreate");


        final ImageView imageV = (ImageView) findViewById(R.id.imageView);
        imageV.setImageResource(R.drawable.startbattle);

        ////////All the white keys////////////
        //Play C5
        final MediaPlayer c5 = MediaPlayer.create(this, R.raw.c5);
        Button play_c5 = (Button)this.findViewById(R.id.button);
        play_c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Playing C5");
                c5.start();

                if (toSave)
                {
                    toBattle[count] = "c";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "c";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "d";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "d";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "e";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "e";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "f";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "f";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "g";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "g";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "a";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "a";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "b";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "b";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "cc";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "cc";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "c#";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "c#";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "d#";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "d#";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "f#";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "f#";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "g#";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "g#";
                    count++;
                }

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

                if (toSave)
                {
                    toBattle[count] = "a#";
                    count++;
                }
                else if (toCheck)
                {
                    toCheckBattle[count] = "a#";
                    count++;
                }

            }
        });

        Button battle = (Button)this.findViewById(R.id.btn_battle);
        battle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Battle");

                if (!toSave)
                {
                    count = 0;
                    toSave = true;
                    imageV.setImageResource(R.drawable.beginbattle);
                }
                else
                {
                    toSave = false;
                    toCheck = true;
                    count = 0;
                    imageV.setImageResource(R.drawable.challengebattle);
                }

            }
        });

        Button check = (Button)this.findViewById(R.id.btn_check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Check");
                toSave = false;

                if (CheckTheNotes())
                {
                    imageV.setImageResource(R.drawable.right);
                    count = 0;
                    toCheck = false;
                }
                else
                {
                    imageV.setImageResource(R.drawable.wrong);
                    count = 0;
                }
            }
        });

        Button playNotes = (Button)this.findViewById(R.id.btn_playnote);
        playNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Play Note");
                int xcv = 0;
                while (xcv < 3)
                {
                    switch (toBattle[xcv])
                    {
                        case "c":
                            c5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "d":
                            d5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "e":
                            e5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "f":
                            f5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "g":
                            g5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "a":
                            a5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "b":
                            b5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "cc":
                            c6.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "c#":
                            cs5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "d#":
                            ds5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "f#":
                            fs5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "g#":
                            gs5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "a#":
                            as5.start();
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        default:
                            try {
                                TimeUnit.SECONDS.sleep(1);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;

                    }

                    xcv++;
                }

            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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
