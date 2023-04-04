package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends DebugActivity {

    Button bt_logar;
    EditText et_login;
    EditText et_senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bt_logar = findViewById(R.id.bt_logar);
        et_login = findViewById(R.id.et_login);
        et_senha = findViewById(R.id.et_senha);

        bt_logar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(et_login.getText().toString().equals("admin") && et_senha.getText().toString().equals("admin123")) {
                    Intent intent = new Intent(Login.this, SegundaTela.class);
                    Bundle bundle = new Bundle();
                    bundle.putCharSequence("Login", et_login.getText().toString());
                    bundle.putCharSequence("Senha", et_senha.getText().toString());
                    intent.putExtras(bundle);
                    startActivity(intent);
                    Log.d("TESTE", "Login feito com sucesso");
                    Toast.makeText(Login.this, "Login feito corretamente", Toast.LENGTH_SHORT).show();
                } else {
                    Log.d("TESTE", "Falha ao logar");
                    Toast.makeText(Login.this, "Dados incorretos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}