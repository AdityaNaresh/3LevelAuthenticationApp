package com.example.a3levelauthenticationsystem;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Loginactivity2 extends AppCompatActivity {

    private DatabaseReference mDatabase;
    String s=null;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Button next = (Button)findViewById(R.id.nextregpage);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        final TextView text1 = (TextView)findViewById(R.id.pin);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text1.getText().equals("ABC"))
                {
                    text1.setText("");
                }
                text1.append("R");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text1.getText().equals("ABC"))
                {
                    text1.setText("");
                }
                text1.append("G");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (text1.getText().equals("ABC"))
                {
                    text1.setText("");
                }
                text1.append("B");
            }
        });



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //TODO: Firebase waale se compare karana hai text1 and if paasses go on next slide

                FirebaseDatabase.getInstance().getReference().child("Users").child(FirebaseAuth.getInstance().getUid())
                        .addValueEventListener(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                if (dataSnapshot != null){
                                    Map<String , Object> map = (HashMap<String, Object>)dataSnapshot.getValue();
                                    if (map != null){
                                        if (text1.getText().toString().equals(map.get("Level2Pin"))){
                                            Toast.makeText(Loginactivity2.this, "Ok", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(Loginactivity2.this,LoginActivity3.class);
                                            finish();
                                            startActivity(intent);
                                        }
                                        else {
                                            Toast.makeText(Loginactivity2.this, "Wrong Pin", Toast.LENGTH_SHORT).show();
                                            text1.setText("");
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
