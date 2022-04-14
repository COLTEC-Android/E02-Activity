package br.ufmg.coltec.e02_activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

public class DebugActivity extends Activity {

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("DebugActivity", "Método onStart iniciado");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("DebugActivity", "Método onPause iniciado");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("DebugActivity", "Método onCreate iniciado");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("DebugActivity", "Método onStop iniciado");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DebugActivity", "Método onResume iniciado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("DebugActivity", "Método onRestart iniciado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("DebugActivity", "Método onDestroy iniciado");
    }
}
