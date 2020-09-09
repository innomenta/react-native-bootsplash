package com.zoontek.rnbootsplash;

import android.app.Activity;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;

public class RNBootSplash {

  @RequiresApi(api = Build.VERSION_CODES.KITKAT)
  public static void init(@NonNull final Activity activity, int appTheme, final BitmapDrawable bitmapDrawable) {
    RNBootSplashModule.init(activity, appTheme, bitmapDrawable);
  }
}
