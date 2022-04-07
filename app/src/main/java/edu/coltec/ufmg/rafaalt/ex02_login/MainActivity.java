package edu.coltec.ufmg.rafaalt.ex02_login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.Debug;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btn_login);
        EditText editUser = findViewById(R.id.edit_user);
        EditText editSenha = findViewById(R.id.edit_senha);
        TextView txt = findViewById(R.id.txt_user);

        Intent telaApp = new Intent(MainActivity.this, AppActivity.class);

        btnLogin.setOnClickListener((view) -> {
            String text = editUser.getText().toString();
            String senha = editSenha.getText().toString();
            if(text.equals("admin") && senha.equals("1234")){
                //Entrou no programa
                Bundle bundle = new Bundle();
                bundle.putString("nome", text);
                telaApp.putExtras(bundle);
                startActivity(telaApp);
            }
            else{
                Toast.makeText(this, "Usuario ou senha incorretos!", Toast.LENGTH_LONG).show();
            }
        });
    }
}