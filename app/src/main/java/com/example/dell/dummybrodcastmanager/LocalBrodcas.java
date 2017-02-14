package com.example.dell.dummybrodcastmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class LocalBrodcas extends BroadcastReceiver {
    private static final String TAG = LocalBrodcas.class.getSimpleName();
    public LocalBrodcas() {
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(LocalBrodcas.TAG,"LocalBrodcas-Action ");
        Toast.makeText(context,"LocalBrodcas-Action triggered",Toast.LENGTH_SHORT).show();
    }
}
