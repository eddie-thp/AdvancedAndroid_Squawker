package android.example.com.squawker.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

// DONE (1) Make a new package for your FCM service classes called "fcm"
// DONE (2) Create a new Service class that extends FirebaseInstanceIdService.
// You'll need to implement the onTokenRefresh method. Simply have it print out
// the new token.

public class SquawkFirebaseInstanceIdService extends FirebaseInstanceIdService {

    private static final String LOG_TAG = SquawkFirebaseInstanceIdService.class.getSimpleName();

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String token = FirebaseInstanceId.getInstance().getToken();

        Log.d(LOG_TAG, "FirebaseInstanceId token refreshed, new token: " + token);

    }
}
