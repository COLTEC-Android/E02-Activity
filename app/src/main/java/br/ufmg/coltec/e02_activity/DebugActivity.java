package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.w("MainActivity", "onPause executado!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.w("MainActivity", "onStop executado!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.w("MainActivity", "onResume executado!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.w("MainActivity", "onDestroy executado!");
    }

}