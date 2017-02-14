package com.example.dell.dummybrodcastmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class SystemBrodcastReciver extends BroadcastReceiver {
    private static final String TAG = SystemBrodcastReciver.class.getSimpleName();

    public SystemBrodcastReciver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        String Action= intent.getAction();
        switch (Action){

            case "android.intent.action.AIRPLANE_MODE":
                Log.v(SystemBrodcastReciver.TAG,"Ai Plane Mode");
            break;
            case "android.intent.action.ACTION_POWER_CONNECTED":
                Log.e(SystemBrodcastReciver.TAG,"Power Conected");
            break;

        }


    }
}
