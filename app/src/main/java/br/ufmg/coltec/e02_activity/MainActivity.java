package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declarando Button
        Button btnLogar = this.findViewById(R.id.btn_logar);
        EditText editUser = this.findViewById(R.id.edit_txt_login);
        EditText editPass = this.findViewById(R.id.edit_txt_password);
        //Click Button
        btnLogar.setOnClickListener((view) -> {

            String getUser = editUser.getText().toString();
            String getPass = editPass.getText().toString();

            if (editUser.getText().toString().equals("admin") && editPass.getText().toString().equals("admin123")){

                //Enviar dados para outra activity
                Bundle parametros = new Bundle();
                parametros.putCharSequence("nome", "admin");

                //Abrindo a segunda tela.
                Intent segundaTela = new Intent(MainActivity.this, SegundaActivity.class);
                segundaTela.putExtras(parametros);
                startActivity(segundaTela);
                Log.w("MainActivity", "Login feito com sucesso!");
            }else{
                Toast.makeText(MainActivity.this,"Usuario ou senhas incorretos", Toast.LENGTH_LONG).show();
                Log.w("MainActivity", "Login feito incorretamente!");
            }

        });

    }
}