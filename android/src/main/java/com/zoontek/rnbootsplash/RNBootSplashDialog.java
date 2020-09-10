package com.zoontek.rnbootsplash;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.Window;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;

class RNBootSplashDialog extends Dialog {
  @RequiresApi(api = Build.VERSION_CODES.KITKAT)
  RNBootSplashDialog(final @NonNull Activity activity, final @StyleRes int themeResId, BitmapDrawable bitmapDrawable) {
    super(activity, themeResId);

    setOwnerActivity(activity);
    setCancelable(false);
    setCanceledOnTouchOutside(false);

    final Window window = getWindow();

    if (window != null) {
      DisplayMetrics displayMetrics = new DisplayMetrics();
      activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
      window.setLayout(displayMetrics.widthPixels, displayMetrics.heightPixels);
      window.setWindowAnimations(0);
      window.setGravity(Gravity.TOP);
      window.setBackgroundDrawable(bitmapDrawable);
    }
  }
}
