package com.apaza.paginasamarillasapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class BuscarActivity extends AppCompatActivity {


    private EditText etnombre;

    private ImageView ivbuscar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar);


        etnombre = (EditText)findViewById(R.id.EditText);


        ivbuscar = (ImageView)findViewById(R.id.menu_icon);



    }

    public void Buscar(View view){


        String strnombre = etnombre.getText().toString();
        if(strnombre.equalsIgnoreCase("restaurant")){

            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        }else {
            Toast.makeText(this, "Solo puede buscar Restaurant :V",
                    Toast.LENGTH_LONG).show();
        }


    }
}
