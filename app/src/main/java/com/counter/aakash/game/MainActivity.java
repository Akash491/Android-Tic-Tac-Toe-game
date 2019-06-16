package com.counter.aakash.game;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.provider.Settings;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int count=1;
    void check()
    {
        if(((b1.getText().equals("O") || b1.getText().equals("X")) && (b2.getText().equals("O") || b2.getText().equals("X"))
            && (b3.getText().equals("O") || b3.getText().equals("X")) && (b4.getText().equals("O") || b4.getText().equals("X"))
            && (b5.getText().equals("O") || b5.getText().equals("X")) && (b6.getText().equals("O") || b6.getText().equals("X"))
            && (b7.getText().equals("O") || b7.getText().equals("X")) && (b8.getText().equals("O") || b8.getText().equals("X"))
            && (b9.getText().equals("O") || b9.getText().equals("X"))))
        {
            Toast.makeText(MainActivity.this,"Draw",Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this,"RESTARTING THE GAME !!!!!!!!",Toast.LENGTH_LONG).show();
            mp.stop();
            this.stopLockTask();
            this.recreate();
        }

        else if(b5.getText().equals("X"))
        {
            if(b1.getText().equals("X") && b9.getText().equals("X"))
            {
                Thread td=new Thread(){
                public void run()
                {
                    try {
                            sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        Toast.makeText(MainActivity.this, "X wins", Toast.LENGTH_LONG).show();
                        Toast.makeText(MainActivity.this, "RESTARTING THE GAME !!!!!!!!", Toast.LENGTH_LONG).show();
                        mp.stop();
                    }
                }
            };
            this.recreate();
            }

            else if(b2.getText().equals("X") && b8.getText().equals("X"))
            {
                Toast.makeText(MainActivity.this,"X wins",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"RESTARTING THE GAME !!!!!!!!",Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            }

            else if(b3.getText().equals("X") && b7.getText().equals("X"))
            {
                Toast.makeText(MainActivity.this,"X wins",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"RESTARTING THE GAME !!!!!!!!",Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            }

            else if(b4.getText().equals("X") && b6.getText().equals("X"))
            {
                Toast.makeText(MainActivity.this,"X wins",Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"RESTARTING THE GAME !!!!!!!!",Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();

            }
        }

        else if(b5.getText().equals("O")) {
            if (b1.getText().equals("O") && b9.getText().equals("O")) {
                Toast.makeText(MainActivity.this, "O wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"RESTARTING THE GAME !!!!!!!!",Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            } else if (b2.getText().equals("O") && b8.getText().equals("O")) {
                Toast.makeText(MainActivity.this, "O wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"RESTARTING THE GAME !!!!!!!!",Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            } else if (b3.getText().equals("O") && b7.getText().equals("O")) {
                Toast.makeText(MainActivity.this, "O wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"RESTARTING THE GAME !!!!!!!!",Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            } else if (b4.getText().equals("O") && b6.getText().equals("O")) {
                Toast.makeText(MainActivity.this, "O wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,"RESTARTING THE GAME !!!!!!!!",Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            }
        }
        else if(b2.getText().equals("X")) {
            if (b1.getText().equals("X") && b3.getText().equals("X")) {
                Toast.makeText(MainActivity.this, "X wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "RESTARTING THE GAME !!!!!!!!", Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            }
        }

        else if(b2.getText().equals("O")) {
            if (b1.getText().equals("O") && b3.getText().equals("O")) {
                Toast.makeText(MainActivity.this, "O wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "RESTARTING THE GAME !!!!!!!!", Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            }
        }

        else if(b6.getText().equals("X")) {
            if (b3.getText().equals("X") && b9.getText().equals("X")) {
                Thread td = null;
                try {
                    td.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    Toast.makeText(MainActivity.this, "X wins", Toast.LENGTH_LONG).show();
                    Toast.makeText(MainActivity.this, "RESTARTING THE GAME !!!!!!!!", Toast.LENGTH_LONG).show();
                    mp.stop();
                    this.recreate();
                }

            }
        }

        else if(b6.getText().equals("O")) {
            if (b9.getText().equals("O") && b3.getText().equals("O")) {
                Toast.makeText(MainActivity.this, "O wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "RESTARTING THE GAME !!!!!!!!", Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            }
        }

        else if(b8.getText().equals("X")) {
            if (b7.getText().equals("X") && b9.getText().equals("X")) {
                Toast.makeText(MainActivity.this, "X wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "RESTARTING THE GAME !!!!!!!!", Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            }
        }

        else if(b8.getText().equals("O")) {
            if (b7.getText().equals("O") && b9.getText().equals("O")) {
                Toast.makeText(MainActivity.this, "O wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "RESTARTING THE GAME !!!!!!!!", Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            }
        }

        else if(b4.getText().equals("X")) {
            if (b1.getText().equals("X") && b7.getText().equals("X")) {
                Toast.makeText(MainActivity.this, "X wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "RESTARTING THE GAME !!!!!!!!", Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            }
        }

        else if(b4.getText().equals("O")) {
            if (b1.getText().equals("O") && b7.getText().equals("O")) {
                Toast.makeText(MainActivity.this, "O wins", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, "RESTARTING THE GAME !!!!!!!!", Toast.LENGTH_LONG).show();
                mp.stop();
                this.recreate();
            }
        }


    }

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        mp=MediaPlayer.create(MainActivity.this,R.raw.b);
        mp.start();

            b1.setOnClickListener(new View.OnClickListener() {
                int a = 0;

                @Override
                public void onClick(View v) {
                    if (a == 0) {
                        a = 1;
                        if (count % 2 == 0) {
                            b1.setTextSize(110);
                            b1.setText("O");

                        } else {
                            b1.setTextSize(110);
                            b1.setText("X");
                            a=1;
                        }

                        count++;
                        check();

                    }
                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                int a = 0;

                @Override
                public void onClick(View v) {
                    if (a == 0) {
                        a = 1;
                        if (count % 2 == 0) {
                            b2.setTextSize(110);
                            b2.setText("O");

                        } else {
                            b2.setTextSize(110);
                            b2.setText("X");
                            a=1;
                        }

                        count++;
                        check();
                    }

                }
            });

            b3.setOnClickListener(new View.OnClickListener() {
                int a = 0;

                @Override
                public void onClick(View v) {
                    if (a == 0) {
                        a = 1;
                        if (count % 2 == 0) {
                            b3.setTextSize(110);
                            b3.setText("O");

                        } else {
                            b3.setTextSize(110);
                            b3.setText("X");
                            a=1;
                        }

                        count++;
                        check();
                    }
                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                int a = 0;

                @Override
                public void onClick(View v) {
                    if (a == 0) {
                        a = 1;
                        if (count % 2 == 0) {
                            b4.setTextSize(110);
                            b4.setText("O");

                        } else {
                            b4.setTextSize(110);
                            b4.setText("X");
                            a=1;
                        }

                        count++;
                        check();
                    }
                }
            });

            b5.setOnClickListener(new View.OnClickListener() {
                int a = 0;

                @Override
                public void onClick(View v) {
                    if (a == 0) {
                        a = 1;
                        if (count % 2 == 0) {
                            b5.setTextSize(110);
                            b5.setText("O");

                        } else {
                            b5.setTextSize(110);
                            b5.setText("X");
                            a=1;
                        }

                        count++;
                        check();
                    }
                }
            });

            b6.setOnClickListener(new View.OnClickListener() {
                int a = 0;

                @Override
                public void onClick(View v) {
                    if (a == 0) {
                        a = 1;
                        if (count % 2 == 0) {
                            b6.setTextSize(110);
                            b6.setText("O");

                        } else {
                            b6.setTextSize(110);
                            b6.setText("X");
                            a=1;
                        }

                        count++;
                        check();

                    }
                }
            });

            b7.setOnClickListener(new View.OnClickListener() {
                int a = 0;

                @Override
                public void onClick(View v) {
                    if (a == 0) {
                        a = 1;
                        if (count % 2 == 0) {
                            b7.setTextSize(110);
                            b7.setText("O");

                        } else {
                            b7.setTextSize(110);
                            b7.setText("X");
                            a=1;
                        }

                        count++;
                        check();

                    }
                }
            });

            b8.setOnClickListener(new View.OnClickListener() {
                int a = 0;

                @Override
                public void onClick(View v) {
                    if (a == 0) {
                        a = 1;
                        if (count % 2 == 0) {
                            b8.setTextSize(110);
                            b8.setText("O");

                        } else {
                            b8.setTextSize(110);
                            b8.setText("X");
                            a=1;
                        }

                        count++;
                        check();

                    }
                }
            });

            b9.setOnClickListener(new View.OnClickListener() {
                int a = 0;

                @Override
                public void onClick(View v) {
                    if (a == 0) {
                        a = 1;
                        if (count % 2 == 0) {
                            b9.setTextSize(110);
                            b9.setText("O");

                        } else {
                            b9.setTextSize(110);
                            b9.setText("X");
                            a=1;
                        }

                        count++;
                        check();

                    }
                }
            });


    }
}
