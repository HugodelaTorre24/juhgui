package com.example.juhgui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TextoEnviado extends AppCompatActivity {

    private Button boton2;

    EditText edtitext;
    Button btnEnviar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_texto_enviado2);

        boton2 = findViewById(R.id.botonTexto);
        edtitext= findViewById(R.id.texto1);
        edtitext = findViewById(R.id.texto2);
        edtitext = findViewById(R.id.texto3);
        edtitext = findViewById(R.id.texto4);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
        });

    }


}