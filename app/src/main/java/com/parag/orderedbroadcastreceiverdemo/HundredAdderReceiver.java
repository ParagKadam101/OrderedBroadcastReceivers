package com.parag.orderedbroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


// first sum the number with 100
public class HundredAdderReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int number = intent.getIntExtra("number",0);
        Bundle bundle = new Bundle();
        bundle.putInt("number",number+100);
        setResultExtras(bundle);
    }
}
