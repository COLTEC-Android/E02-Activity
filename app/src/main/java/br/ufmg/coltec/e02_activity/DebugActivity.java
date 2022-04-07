package br.ufmg.coltec.e02_activity;

import android.util.Log;

public class DebugActivity {

    protected void onCreate(){
        Log.w("DebubActivity","onCreate() executado!");
    }

    protected void onStart(){
        Log.w("DebubActivity","onStart() executado!");
    }

    protected void onResume(){
        Log.w("DebubActivity","onResume() executado!");
    }

    protected void onPause(){
        Log.w("DebubActivity","onPause() executado!");
    }

    protected void onStop(){
        Log.w("DebubActivity","onStop() executado!");
    }

    protected void onDestroy(){
        Log.w("DebubActivity","onDestroy() executado!");
    }

}
