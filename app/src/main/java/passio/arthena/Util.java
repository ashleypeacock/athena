package passio.arthena;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;

/**
 * Defines all the actions that can be triggered.
 **/
public class Util {

    public static String[] actions = {"Text", "Call", "Start recording"};

    public void text(String message, String telephoneNumber) {
        SmsManager smsManager = SmsManager.getDefault();
        smsManager.sendTextMessage(telephoneNumber, null, message, null, null);
    }

    public void callPerson(String message, String telephoneNumber, Context c) {
        Intent call = new Intent(Intent.ACTION_CALL, Uri.parse(telephoneNumber));
        c.startActivity(call);
    }

    public void sirenAlarm(int sirenId) {

    }

    /**
     * Make sure the app checks for storage space before recording
     */
    public void startRecording() {

    }

    public void stopRecording() {

    }

    public void postFacebook() {

    }

    public static void doAction(int actionId) {

    }

}
