package paul.by.finalproject2.ui.notification;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.TaskStackBuilder;

import java.util.Random;

import paul.by.finalproject2.R;
import paul.by.finalproject2.ui.activity.MainActivity;

/**
 * Created by Paul on 12.01.2016.
 */
public class StatusNotification {

    public static final int PROGRESS_NOTIFICATION_ID = 1;
    public static final int DONE_NOTIFICATION_ID = 2;

    public void createProgressNotification(Context context) {

        // used to update the progress notification
        final int progresID = new Random().nextInt(1000);

        NotificationManager mNotificationManager =
                (NotificationManager) context.getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);


        // building the notification
        NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.ic_search_24dp)
                .setContentTitle(context.getString(R.string.progress_contentTitle))
                .setContentText(context.getString(R.string.progress_contentText))
                .setTicker(context.getString(R.string.progress_ticker))
                .setUsesChronometer(true)
                .setAutoCancel(true)
                .setProgress(100, 0, true);
        mNotificationManager.notify(PROGRESS_NOTIFICATION_ID, nBuilder.build());

    }

    public void createDoneNotification(Context context) {

        Intent resultIntent = new Intent(context, MainActivity.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addParentStack(MainActivity.class);
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);


        NotificationManager mNotificationManager =
                (NotificationManager) context.getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.Builder nBuilder = new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.ic_done_24dp)
                .setContentTitle(context.getString(R.string.done_contentTitle))
                .setContentText(context.getString(R.string.done_contentText))
                .setTicker(context.getString(R.string.done_ticker))
                .setContentIntent(resultPendingIntent)
                .setAutoCancel(true);
        mNotificationManager.notify(DONE_NOTIFICATION_ID, nBuilder.build());
    }

    public void cancelNotification(Context context, int notificationID) {
        NotificationManager mNotificationManager =
                (NotificationManager) context.getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.cancel(notificationID);
    }

}
