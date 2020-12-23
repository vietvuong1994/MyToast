package com.example.mytoast;

import android.content.Context;
import android.widget.Toast;

public class MyToast  {

    public static void showToast(Context context, String message){
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }
}
