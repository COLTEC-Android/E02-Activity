package br.ufmg.coltec.e02_activity;

import android.util.Log;

import android.app.Activity;

public class DebugActivity extends Activity{


    protected void onCreate(){
        Log.w("DebugActivity","onCreate() executado!");
    }

    protected void onStart(){
        super.onStart();
        Log.w("DebugActivity","onStart() executado!");
    }

    protected void onResume(){
        super.onResume();
        Log.w("DebugActivity","onResume() executado!");
    }

    protected void onPause(){
        super.onPause();
        Log.w("DebugActivity","onPause() executado!");
    }

    protected void onStop(){
        super.onStop();
        Log.w("DebugActivity","onStop() executado!");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.w("DebugActivity","onDestroy() executado!");
    }

}
