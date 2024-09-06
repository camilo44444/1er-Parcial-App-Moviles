package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateLogin();
            }
        });
    }

    private void validateLogin() {
        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();

        if (user.isEmpty() || pass.isEmpty()) {
            Toast.makeText(MainActivity.this, "Favor llenar los campos", Toast.LENGTH_SHORT).show();
        } else if (user.equals("uac123") && pass.equals("12345678")) {

            Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
            intent.putExtra("user", "Tu Nombre");
            intent.putExtra("theory", "1) c\n2) c\n3) c\n4) b\n5) c\n6) a\n7) c\n8) b");
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }
}
