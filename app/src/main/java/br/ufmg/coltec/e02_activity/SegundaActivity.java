package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends DebugActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        //Recuperando dados
        Bundle parametros = this.getIntent().getExtras();
        String nome = parametros.getString("nome");

        TextView txtParabens = this.findViewById(R.id.txt_sucesso);
        txtParabens.setText("Seja bem vindo, "+ nome +"!");

    }
}