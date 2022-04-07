package edu.coltec.ufmg.rafaalt.ex02_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class AppActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);

        Bundle bundle = this.getIntent().getExtras();
        TextView txt = findViewById(R.id.txtBemVindo);

        Toast.makeText(this, "Login efetuado com sucesso!", Toast.LENGTH_SHORT);
        txt.setText("Seja bem vindo, " + bundle.getString("nome"));
    }
}