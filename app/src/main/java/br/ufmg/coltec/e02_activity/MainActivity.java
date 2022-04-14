package br.ufmg.coltec.e02_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText lblemail = findViewById(R.id.email);
        final EditText lblsenha = findViewById(R.id.senha);
        Button btnUpdate = findViewById(R.id.btn_entrar);


        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lblemail.getText().toString().equals("admin")){
                    if(lblsenha.getText().toString().equals("admin123")){
                        //vou para a proxima tela
                        Bundle args=new Bundle();
                        Intent intent=new Intent(MainActivity.this,SegundaActivity.class);
                        args.putCharSequence("name",lblemail.getText().toString());
                        intent.putExtras(args);
                        startActivity(intent);

                    }else{
                        Toast.makeText(MainActivity.this, "Senha incorreta!", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "E-mail incorreto!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}