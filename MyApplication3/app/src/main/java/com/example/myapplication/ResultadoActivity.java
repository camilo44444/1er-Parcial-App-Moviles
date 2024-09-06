package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView userInfo;
    private TextView answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        userInfo = findViewById(R.id.userInfo);
        answers = findViewById(R.id.answers);

        // Recuperar la información de la actividad anterior
        String user = getIntent().getStringExtra("user");
        String theory = getIntent().getStringExtra("theory");

        userInfo.setText(user);
        answers.setText(theory);
    }
}
