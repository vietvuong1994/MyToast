package com.example.mytoast;


import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyToast  {

    public static void showToast(Context context, String message){
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
    }

    public static void showActivity(Context context){
        Intent intent = new Intent(context, ToastActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
