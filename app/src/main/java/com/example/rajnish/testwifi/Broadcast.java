package com.example.rajnish.testwifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent)
    {

        int WifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE,
                WifiManager.WIFI_STATE_UNKNOWN);

        switch (WifiState) {
            case WifiManager.WIFI_STATE_ENABLED: {
                Toast.makeText(context,"Wifi enabled",Toast.LENGTH_LONG).show();
            }
            break;

            case WifiManager.WIFI_STATE_ENABLING: {
                Toast.makeText(context,"Wifi enabling",Toast.LENGTH_LONG).show();
            }
            break;
            case WifiManager.WIFI_STATE_DISABLED: {
                Toast.makeText(context,"Wifi disabled",Toast.LENGTH_LONG).show();

            }
            break;

            case WifiManager.WIFI_STATE_DISABLING: {
            }
            break;


            case WifiManager.WIFI_STATE_UNKNOWN: {
            }
            break;

        }

    }
}
