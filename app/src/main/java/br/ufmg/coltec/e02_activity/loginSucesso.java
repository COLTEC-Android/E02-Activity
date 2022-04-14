package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class loginSucesso extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sucesso);

        Bundle activityBundle = this.getIntent().getExtras();
        String nomeUsuario = activityBundle.getCharSequence("usuario").toString();

        TextView lblMessage = findViewById(R.id.txt_mensagemSegundaTela);
        lblMessage.setText("Seja bem vindo, " + nomeUsuario);
    }

}