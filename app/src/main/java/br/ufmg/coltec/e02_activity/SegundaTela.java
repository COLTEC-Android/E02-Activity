package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaTela extends DebugActivity {
    TextView tv_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        Bundle bundle = this.getIntent().getExtras();
        String login = bundle.getCharSequence("Login").toString();
        String senha = bundle.getCharSequence("Senha").toString();

        tv_usuario = findViewById(R.id.tv_usuario);
        tv_usuario.setText("Usuario logado: "+ login);

    }
}