package com.example.dell.dummybrodcastmanager;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private BroadcastReceiver myLocalReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTrigBroadcast = (Button) findViewById(R.id.btnTrigBroadcast);
        btnTrigBroadcast.setOnClickListener(this);

        Button btnTrigLocalBroadcast = (Button) findViewById(R.id.btnTrigLocalBroadcast);
        btnTrigLocalBroadcast.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTrigBroadcast:
                Log.d(MainActivity.TAG, "BROADCAST");
                Intent newIntent = new Intent();
                newIntent.setAction("com.example.dell.dummybroadcastmanager.CUSTOM_ACTION");
                this.sendBroadcast(new Intent("com.example.dell.dummybroadcastmanager.CUSTOM_INTENT"));
                break;

            case R.id.btnTrigLocalBroadcast:
                Log.i(MainActivity.TAG, "bottom button! ");
                LocalBroadcastManager.getInstance(this).sendBroadcast(
                        new Intent().setAction("com.example.dell.dummybroadcastmanager.CUSTOM_ACTION")
                );
        }
    }
    @Override
    protected void onResume(){
        super.onResume();

        LocalBroadcastManager.getInstance(this).registerReceiver(this.myLocalReceiver,
                new IntentFilter("com.example.dell.dummybrodcastmanager.CUSTOM_ACTION")
        );

    }

    @Override
    protected void onPause() {
        super.onPause();

        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.myLocalReceiver);
    }
}