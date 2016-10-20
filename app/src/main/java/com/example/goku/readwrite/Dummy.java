package com.example.goku.readwrite;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Dummy extends AppCompatActivity {

    EditText information_message, alert_message;
    Button add_message;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    Firebase mRootRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dummy);

        Firebase.setAndroidContext(this);


        information_message = (EditText) findViewById(R.id.info_msg);
        alert_message = (EditText) findViewById(R.id.alert_msg);
        add_message = (Button) findViewById(R.id.add_msg);

       // add_message.setOnClickListener(this);

    }


//    @Override
//    public void onClick(View view) {
//
//        final String info_msg = information_message.getText().toString();
//        final String alet_msg = alert_message.getText().toString();
//        Log.d("Filter",info_msg + " " +alet_msg);


       // mRootRef = new Firebase("https://readwrite-858a2.firebaseio.com");

    /*  *//*  FirebaseDatabase database = FirebaseDatabase.getInstance();

        DatabaseReference myRef = database.getReference(info_msg);*//*

        myRef.setValue(alet_msg);
        Toast.makeText(Dummy.this, "MEssage has been added",
                Toast.LENGTH_SHORT).show();*/


}
