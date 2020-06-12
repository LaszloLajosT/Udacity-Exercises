/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.explicitintent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChildActivity extends AppCompatActivity {

    /* Field to store our TextView */
    private TextView mDisplayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        /* Typical usage of findViewById... */
        mDisplayText = findViewById(R.id.tv_display);

        // COMPLETED (3) Use the getIntent method to store the Intent that started this Activity in a variable
        /*
         * Here is where all the magic happens. The getIntent method will give us the Intent that
         * started this particular Activity.
         */
        Bundle dataFromMainActivity = getIntent().getExtras();
        String information;
        /* b) solution:
        Intent intentThatStartedThisActivity = getIntent();
         */

        // COMPLETED (4) Create an if statement to check if this Intent has the extra we passed from MainActivity
        /*
         * Although there is always an Intent that starts any particular Activity, we can't
         * guarantee that the extra we are looking for was passed as well. Because of that, we need
         * to check to see if the Intent has the extra that we specified when we created the
         * Intent that we use to start this Activity. Note that this extra may not be present in
         * the Intent if this Activity was started by any other method.
         * */
        if (dataFromMainActivity != null) {
            // COMPLETED (5) If the Intent contains the correct extra, retrieve the text
            information = dataFromMainActivity.getString("data");
            // COMPLETED (6) If the Intent contains the correct extra, use it to set the TextView text
            mDisplayText.setText(information);
        }

        /* Or I can use b) solution   */
        /*if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            // COMPLETED (5) If the Intent contains the correct extra, retrieve the text
            String textEntered = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT);

            // COMPLETED (6) If the Intent contains the correct extra, use it to set the TextView text
            mDisplayText.setText(textEntered);
        }

         */


    }
}