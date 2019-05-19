package com.example.a3levelauthenticationsystem;

import android.content.Intent;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class Loginfinal extends AppCompatActivity {

    String imnumber;
    CountDownTimer countDownTimer;
    int x=0;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginfinal);

        final TextView texxt = (TextView)findViewById(R.id.text1);
        Button button = (Button)findViewById(R.id.next) ;
        final ImageView img1=(ImageView)findViewById(R.id.imageView1);
        final ImageView img2=(ImageView)findViewById(R.id.imageView2);
        final ImageView img3=(ImageView)findViewById(R.id.imageView3);
        final ImageView img4=(ImageView)findViewById(R.id.imageView4);
        final ImageView img5=(ImageView)findViewById(R.id.imageView5);
        final ImageView img6=(ImageView)findViewById(R.id.imageView6);
        final ImageView img7=(ImageView)findViewById(R.id.imageView7);
        final ImageView img8=(ImageView)findViewById(R.id.imageView8);
        final ImageView img9=(ImageView)findViewById(R.id.imageView9);

        if (getIntent().getStringExtra("image") != null){
            imnumber = getIntent().getStringExtra("image");

            if (imnumber.equals("1"))
            {

                countDownTimer =     new CountDownTimer(10000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        Toast.makeText(Loginfinal.this, String.valueOf(millisUntilFinished), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFinish() {

                        Toast.makeText(Loginfinal.this, String.valueOf(x), Toast.LENGTH_SHORT).show();
                        x++;
                        if (x==1){
                            img1.setImageDrawable(getDrawable(R.drawable.oneone));
                            img2.setImageDrawable(getDrawable(R.drawable.onetwo));
                            img3.setImageDrawable(getDrawable(R.drawable.onethree));
                            img4.setImageDrawable(getDrawable(R.drawable.onefour));
                            img5.setImageDrawable(getDrawable(R.drawable.onefive));
                            img6.setImageDrawable(getDrawable(R.drawable.onesix));
                            img7.setImageDrawable(getDrawable(R.drawable.oneseven));
                            img8.setImageDrawable(getDrawable(R.drawable.oneeight));
                            img9.setImageDrawable(getDrawable(R.drawable.onenine));
                            img1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("1");
                                }
                            });
                            img2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("2");            }
                            });
                            img3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("3");
                                }
                            });
                            img4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("4");
                                }
                            });
                            img5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("5");
                                }
                            });
                            img6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("6");
                                }
                            });
                            img7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("7");
                                }
                            });
                            img8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("8");;
                                }
                            });
                            img9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("9");
                                }
                            });

                        }
                        else if (x==2)
                        {
                            Toast.makeText(Loginfinal.this, "CHANGED", Toast.LENGTH_SHORT).show();
                            
                            img1.setImageDrawable(getDrawable(R.drawable.onetwo));
                            img2.setImageDrawable(getDrawable(R.drawable.oneone));
                            img3.setImageDrawable(getDrawable(R.drawable.onefour));
                            img4.setImageDrawable(getDrawable(R.drawable.onethree));
                            img5.setImageDrawable(getDrawable(R.drawable.onesix));
                            img6.setImageDrawable(getDrawable(R.drawable.onefive));
                            img7.setImageDrawable(getDrawable(R.drawable.oneseven));
                            img8.setImageDrawable(getDrawable(R.drawable.onenine));
                            img9.setImageDrawable(getDrawable(R.drawable.oneeight));
                            img1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("2");
                                }
                            });
                            img2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("1");            }
                            });
                            img3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("4");
                                }
                            });
                            img4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("3");
                                }
                            });
                            img5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("6");
                                }
                            });
                            img6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("5");
                                }
                            });
                            img7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("7");
                                }
                            });
                            img8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("9");;
                                }
                            });
                            img9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("8");
                                }
                            });



                        }
                        else if(x==3)
                        {
                            img1.setImageDrawable(getDrawable(R.drawable.onenine));
                            img2.setImageDrawable(getDrawable(R.drawable.oneeight));
                            img3.setImageDrawable(getDrawable(R.drawable.oneseven));
                            img4.setImageDrawable(getDrawable(R.drawable.onesix));
                            img5.setImageDrawable(getDrawable(R.drawable.onefive));
                            img6.setImageDrawable(getDrawable(R.drawable.onefour));
                            img7.setImageDrawable(getDrawable(R.drawable.onesix));
                            img8.setImageDrawable(getDrawable(R.drawable.oneseven));
                            img9.setImageDrawable(getDrawable(R.drawable.oneeight));
                            img1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("9");
                                }
                            });
                            img2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("8");            }
                            });
                            img3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("7");
                                }
                            });
                            img4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("6");
                                }
                            });
                            img5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("5");
                                }
                            });
                            img6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("4");
                                }
                            });
                            img7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("3");
                                }
                            });
                            img8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("2");;
                                }
                            });
                            img9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("1");
                                }
                            });
                            x=0;
                        }

                        start();
                    }
                }.start();
                img1.setImageDrawable(getDrawable(R.drawable.oneone));
                img2.setImageDrawable(getDrawable(R.drawable.onetwo));
                img3.setImageDrawable(getDrawable(R.drawable.onethree));
                img4.setImageDrawable(getDrawable(R.drawable.onefour));
                img5.setImageDrawable(getDrawable(R.drawable.onefive));
                img6.setImageDrawable(getDrawable(R.drawable.onesix));
                img7.setImageDrawable(getDrawable(R.drawable.oneseven));
                img8.setImageDrawable(getDrawable(R.drawable.oneeight));
                img9.setImageDrawable(getDrawable(R.drawable.onenine));

            }
            else if(imnumber.equals("2"))
            {
              countDownTimer =  new CountDownTimer(10000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        Toast.makeText(Loginfinal.this, String.valueOf(millisUntilFinished/1000), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFinish() {

                        Toast.makeText(Loginfinal.this, String.valueOf(x), Toast.LENGTH_SHORT).show();
                        x++;
                        if (x==1){
                            img1.setImageDrawable(getDrawable(R.drawable.twoone));
                            img2.setImageDrawable(getDrawable(R.drawable.twotwo));
                            img3.setImageDrawable(getDrawable(R.drawable.twothree));
                            img4.setImageDrawable(getDrawable(R.drawable.twofour));
                            img5.setImageDrawable(getDrawable(R.drawable.twofive));
                            img6.setImageDrawable(getDrawable(R.drawable.twosix));
                            img7.setImageDrawable(getDrawable(R.drawable.twoseven));
                            img8.setImageDrawable(getDrawable(R.drawable.twoeight));
                            img9.setImageDrawable(getDrawable(R.drawable.twonine));
                            img1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("1");
                                }
                            });
                            img2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("2");            }
                            });
                            img3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("3");
                                }
                            });
                            img4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("4");
                                }
                            });
                            img5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("5");
                                }
                            });
                            img6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("6");
                                }
                            });
                            img7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("7");
                                }
                            });
                            img8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("8");;
                                }
                            });
                            img9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("9");
                                }
                            });
                        }
                       else  if (x==2)
                        {
                            Toast.makeText(Loginfinal.this, "CHANGED", Toast.LENGTH_SHORT).show();


                            img1.setImageDrawable(getDrawable(R.drawable.twotwo));
                            img2.setImageDrawable(getDrawable(R.drawable.twoone));
                            img3.setImageDrawable(getDrawable(R.drawable.twofour));
                            img4.setImageDrawable(getDrawable(R.drawable.twothree));
                            img5.setImageDrawable(getDrawable(R.drawable.twosix));
                            img6.setImageDrawable(getDrawable(R.drawable.twofive));
                            img7.setImageDrawable(getDrawable(R.drawable.twoseven));
                            img8.setImageDrawable(getDrawable(R.drawable.twonine));
                            img9.setImageDrawable(getDrawable(R.drawable.twoeight));



                            img1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("2");
                                }
                            });
                            img2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("1");            }
                            });
                            img3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("4");
                                }
                            });
                            img4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("3");
                                }
                            });
                            img5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("6");
                                }
                            });
                            img6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("5");
                                }
                            });
                            img7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("7");
                                }
                            });
                            img8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("9");;
                                }
                            });
                            img9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("8");
                                }
                            });


                        }
                        else if(x==3)
                        {
                            img1.setImageDrawable(getDrawable(R.drawable.twonine));
                            img2.setImageDrawable(getDrawable(R.drawable.twoeight));
                            img3.setImageDrawable(getDrawable(R.drawable.twoseven));
                            img4.setImageDrawable(getDrawable(R.drawable.twosix));
                            img5.setImageDrawable(getDrawable(R.drawable.twofive));
                            img6.setImageDrawable(getDrawable(R.drawable.twofour));
                            img7.setImageDrawable(getDrawable(R.drawable.twothree));
                            img8.setImageDrawable(getDrawable(R.drawable.twotwo));
                            img9.setImageDrawable(getDrawable(R.drawable.twoone));
                            img1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("9");
                                }
                            });
                            img2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("8");            }
                            });
                            img3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("7");
                                }
                            });
                            img4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("6");
                                }
                            });
                            img5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("5");
                                }
                            });
                            img6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("4");
                                }
                            });
                            img7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("3");
                                }
                            });
                            img8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("2");;
                                }
                            });
                            img9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("1");
                                }
                            });
                            x=0;
                        }


                        start();
                    }
                }.start();
                img1.setImageDrawable(getDrawable(R.drawable.twoone));
                img2.setImageDrawable(getDrawable(R.drawable.twotwo));
                img3.setImageDrawable(getDrawable(R.drawable.twothree));
                img4.setImageDrawable(getDrawable(R.drawable.twofour));
                img5.setImageDrawable(getDrawable(R.drawable.twofive));
                img6.setImageDrawable(getDrawable(R.drawable.twosix));
                img7.setImageDrawable(getDrawable(R.drawable.twoseven));
                img8.setImageDrawable(getDrawable(R.drawable.twoeight));
                img9.setImageDrawable(getDrawable(R.drawable.twonine));
            }
            else
            {
                countDownTimer =    new CountDownTimer(10000, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        Toast.makeText(Loginfinal.this, String.valueOf(millisUntilFinished), Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFinish() {

                        Toast.makeText(Loginfinal.this, String.valueOf(x), Toast.LENGTH_SHORT).show();
                        x++;
                        if (x==1){
                            img1.setImageDrawable(getDrawable(R.drawable.threeone));
                            img2.setImageDrawable(getDrawable(R.drawable.threetwo));
                            img3.setImageDrawable(getDrawable(R.drawable.threethree));
                            img4.setImageDrawable(getDrawable(R.drawable.threefour));
                            img5.setImageDrawable(getDrawable(R.drawable.threefive));
                            img6.setImageDrawable(getDrawable(R.drawable.threesix));
                            img7.setImageDrawable(getDrawable(R.drawable.threeseven));
                            img8.setImageDrawable(getDrawable(R.drawable.threeeight));
                            img9.setImageDrawable(getDrawable(R.drawable.threenine));
                            img1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("1");
                                }
                            });
                            img2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("2");            }
                            });
                            img3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("3");
                                }
                            });
                            img4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("4");
                                }
                            });
                            img5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("5");
                                }
                            });
                            img6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("6");
                                }
                            });
                            img7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("7");
                                }
                            });
                            img8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("8");;
                                }
                            });
                            img9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("9");
                                }
                            });
                        }
                       else  if (x==2)
                        {
                            Toast.makeText(Loginfinal.this, "CHANGED", Toast.LENGTH_SHORT).show();

                            img1.setImageDrawable(getDrawable(R.drawable.threetwo));
                            img2.setImageDrawable(getDrawable(R.drawable.threeone));
                            img3.setImageDrawable(getDrawable(R.drawable.threefour));
                            img4.setImageDrawable(getDrawable(R.drawable.threethree));
                            img5.setImageDrawable(getDrawable(R.drawable.threesix));
                            img6.setImageDrawable(getDrawable(R.drawable.threefive));
                            img7.setImageDrawable(getDrawable(R.drawable.threeseven));
                            img8.setImageDrawable(getDrawable(R.drawable.threenine));
                            img9.setImageDrawable(getDrawable(R.drawable.threeeight));


                            img1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("2");
                                }
                            });
                            img2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("1");            }
                            });
                            img3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("4");
                                }
                            });
                            img4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("3");
                                }
                            });
                            img5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("6");
                                }
                            });
                            img6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("5");
                                }
                            });
                            img7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("7");
                                }
                            });
                            img8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("9");;
                                }
                            });
                            img9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("8");
                                }
                            });


                        }
                        else if(x==3)
                        {
                            img1.setImageDrawable(getDrawable(R.drawable.threenine));
                            img2.setImageDrawable(getDrawable(R.drawable.threeeight));
                            img3.setImageDrawable(getDrawable(R.drawable.threeseven));
                            img4.setImageDrawable(getDrawable(R.drawable.threesix));
                            img5.setImageDrawable(getDrawable(R.drawable.threefive));
                            img6.setImageDrawable(getDrawable(R.drawable.threefour));
                            img7.setImageDrawable(getDrawable(R.drawable.threethree));
                            img8.setImageDrawable(getDrawable(R.drawable.threetwo));
                            img9.setImageDrawable(getDrawable(R.drawable.threeone));
                            img1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("9");
                                }
                            });
                            img2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("8");            }
                            });
                            img3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("7");
                                }
                            });
                            img4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("6");
                                }
                            });
                            img5.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("5");
                                }
                            });
                            img6.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("4");
                                }
                            });
                            img7.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("3");
                                }
                            });
                            img8.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("2");;
                                }
                            });
                            img9.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    if (texxt.getText().equals("ABC"))
                                    {
                                        texxt.setText("");
                                    }
                                    texxt.append("1");
                                }
                            });
                            x=0;
                        }

                        start();
                    }
                }.start();
                img1.setImageDrawable(getDrawable(R.drawable.threeone));
                img2.setImageDrawable(getDrawable(R.drawable.threetwo));
                img3.setImageDrawable(getDrawable(R.drawable.threethree));
                img4.setImageDrawable(getDrawable(R.drawable.threefour));
                img5.setImageDrawable(getDrawable(R.drawable.threefive));
                img6.setImageDrawable(getDrawable(R.drawable.threesix));
                img7.setImageDrawable(getDrawable(R.drawable.threeseven));
                img8.setImageDrawable(getDrawable(R.drawable.threeeight));
                img9.setImageDrawable(getDrawable(R.drawable.threenine));
            }
        }


  /*      img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texxt.getText().equals("ABC"))
                {
                    texxt.setText("");
                }
                texxt.append("1");
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texxt.getText().equals("ABC"))
                {
                    texxt.setText("");
                }
                texxt.append("2");            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texxt.getText().equals("ABC"))
                {
                    texxt.setText("");
                }
                texxt.append("3");
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texxt.getText().equals("ABC"))
                {
                    texxt.setText("");
                }
                texxt.append("4");
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texxt.getText().equals("ABC"))
                {
                    texxt.setText("");
                }
                texxt.append("5");
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texxt.getText().equals("ABC"))
                {
                    texxt.setText("");
                }
                texxt.append("6");
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texxt.getText().equals("ABC"))
                {
                    texxt.setText("");
                }
                texxt.append("7");
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texxt.getText().equals("ABC"))
                {
                    texxt.setText("");
                }
                texxt.append("8");;
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (texxt.getText().equals("ABC"))
                {
                    texxt.setText("");
                }
                texxt.append("9");
            }
        });
*/

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        //TODO:Authentication and shuffle
                //TODO: Firebase waale se compare karana hai text1 and if paasses go on next slide
                FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getUid())
                        .addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                if (dataSnapshot != null){
                                    Map<String , Object> map = (HashMap<String, Object>)dataSnapshot.getValue();
                                    if (map != null){
                                        if (texxt.getText().toString().equals(map.get("Level3Pin"))){
                                            Toast.makeText(Loginfinal.this, "Ok Level 3 Pin done", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(Loginfinal.this,Feedback.class);
                                            finish();
                                            startActivity(intent);
                                        }
                                        else {
                                            Toast.makeText(Loginfinal.this, "Wrong Pin", Toast.LENGTH_SHORT).show();
                                            texxt.setText("");
                                        }
                                    }
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError databaseError) {

                            }
                        });

            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        countDownTimer.cancel();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        countDownTimer.cancel();

    }

    @Override
    protected void onPause() {
        super.onPause();
        countDownTimer.cancel();

    }
}
