package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user = findViewById(R.id.txt_user);
        EditText senha = findViewById(R.id.txt_senha);
        Button btnLogin = findViewById(R.id.btn_fazerLogin);

        btnLogin.setOnClickListener((view) -> {
            if ((user.getText().toString().equals("admin")) && (senha.getText().toString().equals("admin123"))) {
                Log.d("Main activity", "Login e senha corretos");
                Intent intent = new Intent(MainActivity.this, loginSucesso.class);
                Bundle args = new Bundle();
                args.putCharSequence("usuario", user.getText().toString());
                intent.putExtras(args);

                startActivity(intent);

            }else{
                Log.e("MainActivity", "Login ou senha incoretos");
                Toast.makeText(this, "Login ou senha incorretos ", Toast.LENGTH_LONG).show();
            }

        });

    }

}