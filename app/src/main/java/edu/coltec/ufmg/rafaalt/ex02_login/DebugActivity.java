package edu.coltec.ufmg.rafaalt.ex02_login;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        Log.d("DebugActivity", "onCreate executada");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DebugActivity", "onStop executada");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DebugActivity", "onResume executada");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DebugActivity", "onDestroy executada");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DebugActivity", "onPause executada");
    }

}