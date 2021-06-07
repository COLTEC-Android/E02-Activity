package br.ufmg.coltec.e02_activity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle activityBundle = this.getIntent().getExtras();
        String name = activityBundle.getString("name");

        TextView txtUser = findViewById(R.id.txt_username);
        txtUser.setText(name);
    }
}