package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class SegundaActivity extends DebugActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle activityBundle=this.getIntent().getExtras();
        String name= activityBundle.getString("name");

        TextView lblMessenger=findViewById(R.id.lbl_message);
        lblMessenger.setText("Seja bem vindo(a), "+name);
    }
}