package com.hwaling.udoo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;



public class BootBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Intent bootIntent = new Intent(context,MainActivity.class);
        context.startActivity(bootIntent);
    }
    


}