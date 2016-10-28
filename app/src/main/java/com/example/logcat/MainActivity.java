package com.example.logcat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static String MSG ="MainActivity";
 
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d(MSG, "The onCreate() event");
            Toast.makeText(this, "The onCreate() event",Toast.LENGTH_SHORT).show();
        }

        /** Called when the activity is about to become visible. */
        @Override
        protected void onStart() {
            super.onStart();
            Log.d(MSG, "The onStart() event");
            Toast.makeText(this, "The onStart() event",Toast.LENGTH_SHORT).show();
        }

        /** Called when the activity has become visible. */
        @Override
        protected void onResume() {
            super.onResume();
            Log.d(MSG, "The onResume() event");
            Toast.makeText(this, "The onResume() event",Toast.LENGTH_SHORT).show();
        }

        /** Called when another activity is taking focus. */
        @Override
        protected void onPause() {
            super.onPause();
            Log.d(MSG, "The onPause() event");
            Toast.makeText(this, "The onPause() event",Toast.LENGTH_SHORT).show();
        }

        /** Called when the activity is no longer visible. */
        @Override
        protected void onStop() {
            super.onStop();
            Log.d(MSG, "The onStop() event");
            Toast.makeText(this, "The onStop() event",Toast.LENGTH_SHORT).show();
        }

        /** Called just before the activity is destroyed. */
        @Override
        public void onDestroy() {
            super.onDestroy();
            Log.d(MSG, "The onDestroy() event");
            Toast.makeText(this, "The onDestroy() event",Toast.LENGTH_SHORT).show();
        }
    }