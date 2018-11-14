package com.example.alitamoor.firebaseanalytics;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseInstanceIDService extends FirebaseMessagingService {

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        String tokenID = FirebaseInstanceId.getInstance().getId();
        Log.i("DluxSoft", "onTokenRefresh: " + s);
    }
}
