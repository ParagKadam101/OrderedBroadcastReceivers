package com.parag.orderedbroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

// After the number is summed with 100, square it.
public class SquareReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = getResultExtras(false);
        int number = bundle.getInt("number");
        Log.d("xxx",""+number*number);
    }
}
