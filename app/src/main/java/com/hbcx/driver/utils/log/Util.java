package com.hbcx.driver.utils.log;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by zhaokaiqiang on 15/12/11.
 */
public class Util {

    public static boolean isEmpty(String line) {
        return TextUtils.isEmpty(line) || line.equals("\n") || line.equals("\t") || TextUtils.isEmpty(line.trim());
    }

    public static void printLine(String tag, boolean isTop) {
        if (isTop) {
            Log.i(tag, "╔═══════════════════════════════════════════════════════════════════════════════════════");
        } else {
            Log.i(tag, "╚═══════════════════════════════════════════════════════════════════════════════════════");
        }
    }

}