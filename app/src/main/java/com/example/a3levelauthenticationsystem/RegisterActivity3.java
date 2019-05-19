package com.example.a3levelauthenticationsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegisterActivity3 extends AppCompatActivity {
    DatabaseReference mDatabase;
    String s = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register3);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        ImageView image1=(ImageView)findViewById(R.id.imageView1);
        ImageView image2=(ImageView)findViewById(R.id.imageView2);
        ImageView image3=(ImageView)findViewById(R.id.imageView3);

//        image1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(RegisterActivity3.this,Reg3Final.class);
//                intent.putExtra("image" , "1");
//                finish();
//                startActivity(intent);
//            }
//        });



        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getUid()).child("Level3Image").setValue("1").
                        addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {

                                Toast.makeText(RegisterActivity3.this, "Level 3 image Registered", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(RegisterActivity3.this,Reg3Final.class);
                                intent.putExtra("image" , "1");
                                finish();
                                startActivity(intent);

                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        Toast.makeText(RegisterActivity3.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getUid()).child("Level3Image").setValue("2").
                        addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {

                                Toast.makeText(RegisterActivity3.this, "Level 3 image Registered", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(RegisterActivity3.this,Reg3Final.class);
                                intent.putExtra("image" , "2");
                                finish();
                                startActivity(intent);

                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        Toast.makeText(RegisterActivity3.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getUid()).child("Level3Image").setValue("3").

                        addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {

                                Toast.makeText(RegisterActivity3.this, "Level 3 image Registered", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(RegisterActivity3.this,Reg3Final.class);
                                intent.putExtra("image" , "3");
                                finish();
                                startActivity(intent);

                            }
                        })
                      .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                        Toast.makeText(RegisterActivity3.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });


    }
}
