package com.example.mytoast;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

public class MyToast extends Application {

    private static Context context;

    public MyToast() {
        context = getApplicationContext();
    }

    public static void showToast(String message){
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

}
