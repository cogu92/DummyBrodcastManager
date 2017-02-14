package com.example.dell.dummybrodcastmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class CustomBrotcastReciver extends BroadcastReceiver {
    private static final String TAG = CustomBrotcastReciver.class.getSimpleName();
    public CustomBrotcastReciver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(CustomBrotcastReciver.TAG,"Custom-Action ");
        Toast.makeText(context,"Custom-Action triggered",Toast.LENGTH_SHORT).show();
    }
}
