package com.example.juhgui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class TextoEnviado extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto_enviado2);

        Button botonGuardar = findViewById(R.id.boton2); //boton con ID boton2

        botonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guardarDatosEnJSON();
            }
        });


    }

    private void guardarDatosEnJSON(){
        // Obtener todos los EditText (como tienen el mismo ID, los buscamos por su clase)
        ArrayList<EditText> listaEditText = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            EditText editText1 = findViewById(R.id.texto1);
            EditText editText2 = findViewById(R.id.texto2);
            EditText editText3 = findViewById(R.id.texto3);
            EditText editText4 = findViewById(R.id.texto4);
            if(editText1 != null && editText2 != null && editText3 != null && editText4 != null){

                listaEditText.add(editText1);
                listaEditText.add(editText2);
                listaEditText.add(editText3);
                listaEditText.add(editText4);

            }
        }

        // Crear JSON con los datos de los EditText
        JSONArray jsonArray = new JSONArray();
        for(int i = 0; i < listaEditText.size(); i++){
            String texto = listaEditText.get(i).getText().toString();
            if(!texto.isEmpty()){
                JSONObject objeto = new JSONObject();
                try{
                    objeto.put("texto" + ( i +1 ), texto);
                    jsonArray.put(objeto);
                } catch (JSONException e){
                    e.printStackTrace();
                }
            }
        }

    }

}