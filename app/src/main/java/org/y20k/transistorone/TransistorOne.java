/**
 * TransistorOne.java
 * Implements the TransistorOne class
 * TransistorOne starts up the app and sets up the basic theme (Day / Night)
 *
 * This file is part of
 * TRANSISTOR - Radio App for Android
 *
 * Copyright (c) 2015-20 - Y20K.org
 * Licensed under the MIT-License
 * http://opensource.org/licenses/MIT
 */

package org.y20k.transistorone;

import android.app.Application;

import org.y20k.transistorone.helpers.LogHelper;
import org.y20k.transistorone.helpers.NightModeHelper;


/**
 * TransistorOne class
 */
public class TransistorOne extends Application {

    /* Define log tag */
    private static final String LOG_TAG = TransistorOne.class.getSimpleName();


    @Override
    public void onCreate() {
        super.onCreate();

        // set Day / Night theme state
        NightModeHelper.restoreSavedState(this);

// todo remove
//        if (Build.VERSION.SDK_INT >= 28) {
//            // Android P might introduce a system wide theme option - in that case: follow system (28 = Build.VERSION_CODES.P)
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);
//        } else {
//            // try to get last state the user chose
//            NightModeHelper.restoreSavedState(this);
//        }

    }


    @Override
    public void onTerminate() {
        super.onTerminate();
        LogHelper.v(LOG_TAG, "Transistor application terminated.");
    }

}
