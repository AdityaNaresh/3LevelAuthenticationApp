package com.example.a3levelauthenticationsystem;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Reg3Final extends AppCompatActivity {

    String imnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg3_final);

        final TextView texxt = (TextView)findViewById(R.id.text1);
        Button button = (Button)findViewById(R.id.next) ;
        ImageView img1=(ImageView)findViewById(R.id.imageView1);
        ImageView img2=(ImageView)findViewById(R.id.imageView2);
        ImageView img3=(ImageView)findViewById(R.id.imageView3);
        ImageView img4=(ImageView)findViewById(R.id.imageView4);
        ImageView img5=(ImageView)findViewById(R.id.imageView5);
        ImageView img6=(ImageView)findViewById(R.id.imageView6);
        ImageView img7=(ImageView)findViewById(R.id.imageView7);
        ImageView img8=(ImageView)findViewById(R.id.imageView8);
        ImageView img9=(ImageView)findViewById(R.id.imageView9);

        if (getIntent().getStringExtra("image") != null){
            imnumber = getIntent().getStringExtra("image");

            if (imnumber.equals("1"))
            {
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


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getUid()).child("Level3Pin").setValue(texxt.getText().toString()).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                        Toast.makeText(Reg3Final.this, "Level 3 Registered", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Reg3Final.this,MainActivity.class);
                        finish();
                        startActivity(intent);

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        Toast.makeText(Reg3Final.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
    }
}
