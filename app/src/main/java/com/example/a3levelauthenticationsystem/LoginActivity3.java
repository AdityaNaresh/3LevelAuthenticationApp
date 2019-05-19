package com.example.a3levelauthenticationsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity3 extends AppCompatActivity {


    DatabaseReference mDatabase;
    String s = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register3);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        ImageView image1 = (ImageView) findViewById(R.id.imageView1);
        ImageView image2 = (ImageView) findViewById(R.id.imageView2);
        ImageView image3 = (ImageView) findViewById(R.id.imageView3);


        //TODO:Compare the pic then intent
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Firebase waale se compare karana hai text1 and if paasses go on next slide
                final String s="1";
                FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getUid())
                        .addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                if (dataSnapshot != null){
                                    Map<String , Object> map = (HashMap<String, Object>)dataSnapshot.getValue();
                                    if (map != null){
                                        if (s.equals(map.get("Level3Image"))){
                                            Toast.makeText(LoginActivity3.this, "Ok Level 3 Image done", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(LoginActivity3.this,Loginfinal.class);
                                            intent.putExtra("image", "1");
                                            finish();
                                            startActivity(intent);
                                        }
                                        else {
                                            Toast.makeText(LoginActivity3.this, "Wrong Pin", Toast.LENGTH_SHORT).show();
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

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Firebase waale se compare karana hai text1 and if paasses go on next slide
                final String s="2";
                FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getUid())
                        .addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                if (dataSnapshot != null){
                                    Map<String , Object> map = (HashMap<String, Object>)dataSnapshot.getValue();
                                    if (map != null){
                                        if (s.equals(map.get("Level3Image"))){
                                            Toast.makeText(LoginActivity3.this, "Ok Level 3 Image done", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(LoginActivity3.this,Loginfinal.class);
                                            intent.putExtra("image", "2");
                                            finish();
                                            startActivity(intent);
                                        }
                                        else {
                                            Toast.makeText(LoginActivity3.this, "Wrong Pin", Toast.LENGTH_SHORT).show();
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

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Firebase waale se compare karana hai text1 and if paasses go on next slide
                final String s="3";
                FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getUid())
                        .addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                if (dataSnapshot != null){
                                    Map<String , Object> map = (HashMap<String, Object>)dataSnapshot.getValue();
                                    if (map != null){
                                        if (s.equals(map.get("Level3Image"))){
                                            Toast.makeText(LoginActivity3.this, "Ok Level 3 Image done", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(LoginActivity3.this,Loginfinal.class);
                                            intent.putExtra("image", "3");
                                            finish();
                                            startActivity(intent);
                                        }
                                        else {
                                            Toast.makeText(LoginActivity3.this, "Wrong Pin", Toast.LENGTH_SHORT).show();
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
}
