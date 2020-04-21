/**
 * DialogError.java
 * Implements the DialogError class
 * A DialogError shows an error dialog with details
 *
 * This file is part of
 * TRANSISTOR - Radio App for Android
 *
 * Copyright (c) 2015-20 - Y20K.org
 * Licensed under the MIT-License
 * http://opensource.org/licenses/MIT
 */


package org.y20k.transistorone.helpers;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import org.y20k.transistorone.R;


/**
 * DialogError class
 */
public final class DialogError {

    /* Construct and show dialog */
    public static void show(final Activity activity, final String errorTitle, final String errorMessage, final String errorDetails) {
        // prepare dialog builder
        LayoutInflater inflater = LayoutInflater.from(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        // get views
        View view = inflater.inflate(R.layout.dialog_error, null);
        final TextView errorTitleView = (TextView) view.findViewById(R.id.dialog_error_title);
        final TextView errorMessageView = (TextView) view.findViewById(R.id.dialog_error_message);
        final TextView errorDetailsLinkView = (TextView) view.findViewById(R.id.dialog_error_details_link);
        final TextView errorDetailsView = (TextView) view.findViewById(R.id.dialog_error_details);

        // allow scrolling on details view
        errorDetailsView.setMovementMethod(new ScrollingMovementMethod());

        // show and hide details
        errorDetailsLinkView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (errorDetailsView.getVisibility() == View.GONE) {
                    errorDetailsView.setVisibility(View.VISIBLE);
                } else {
                    errorDetailsView.setVisibility(View.GONE);
                }
            }
        });

        // set text views
        errorTitleView.setText(errorTitle);
        errorMessageView.setText(errorMessage);
        errorDetailsView.setText(errorDetails);

        // set dialog view
        builder.setView(view);

        // add rename button
        builder.setPositiveButton(R.string.dialog_generic_button_okay, new DialogInterface.OnClickListener() {
            // listen for click on okay button
            public void onClick(DialogInterface arg0, int arg1) {
                // do nothing
            }
        });

        // display error dialog
        builder.show();
    }

}