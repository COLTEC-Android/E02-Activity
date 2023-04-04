package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);

        Log.i("TESTE", "onCreate executado");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TESTE", "onStart executado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TESTE", "onResume executado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TESTE", "onStop executado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TESTE", "onStop executado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TESTE", "onRestart executado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TESTE", "onDestroy executado");
    }


}