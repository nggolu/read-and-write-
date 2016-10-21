package com.example.goku.readwrite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import java.util.Map;

public class Home extends AppCompatActivity {

    private TextView alert_msg , info_msg;
    private Firebase mref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        alert_msg = (TextView) findViewById(R.id.alert_msg);
        info_msg = (TextView) findViewById(R.id.info_msg);

        mref = new Firebase("https://readwrite-858a2.firebaseio.com/Message/info_msg/");
        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
               /* Map<String,String> map = dataSnapshot.getValue(Map.class);
                String Alert_message = map.get("Alert_message");
                String info_msg = map.get("Message");
                String message = map.get("info_messgae");

                Log.v("E_Value","Alert_message : "+Alert_message);
                Log.v("E_Value","info_msg : "+info_msg);
                Log.v("E_Value","message : "+message);*/
                String value = (String) dataSnapshot.getValue();
                System.out.println(value);
                Log.v("E_Value","message : "+value);
                alert_msg.setText(value);

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });
    }
}
