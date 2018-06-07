package com.project.four;

import android.app.AlertDialog;
import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;

public class Universal {


    public static ArrayList<HashMap<String, String>> eArray = new ArrayList<>();

    public static void showAlert(Context c, String title, String message) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(c);
        dialog.setTitle(title);
        dialog.setMessage(message);
        dialog.setNeutralButton("OK", null);
        dialog.create().show();
    }

    public static String getDate() {
        Calendar c = Calendar.getInstance();
        return new SimpleDateFormat("dd MMM, yyyy").format(c.getTime());
    }

    public static String getTime() {
        Calendar c = Calendar.getInstance();
        return new SimpleDateFormat("hh:mm a").format(c.getTime());
    }
}
