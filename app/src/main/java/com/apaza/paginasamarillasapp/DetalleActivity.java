package com.apaza.paginasamarillasapp;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class DetalleActivity extends AppCompatActivity {

    private TextView tv_nombre;
    private TextView tv_rubro;
    private TextView tv_direccion;
    private TextView tv_telefono;
    private TextView tv_correo;
    private TextView tv_url;
    private TextView tv_descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);


    tv_nombre = (TextView)findViewById(R.id.nombre);
    tv_rubro = (TextView)findViewById(R.id.rubro);
    tv_direccion = (TextView)findViewById(R.id.direccion);
    tv_telefono = (TextView)findViewById(R.id.telefono);
    tv_descripcion = (TextView)findViewById(R.id.descripcion);




                final String nombre = this.getIntent().getExtras().getString("strnombre");
                tv_nombre.setText(nombre);


                final String rubro = this.getIntent().getExtras().getString("strrubro");
                tv_rubro.setText(rubro);


                final String direccion = this.getIntent().getExtras().getString("strdireccion");
                tv_direccion.setText(direccion);


                final String descripcion = this.getIntent().getExtras().getString("strdescripcion");
                tv_descripcion.setText(descripcion);


                final int telefono = this.getIntent().getExtras().getInt("inttelefono");
                tv_telefono.setText(String.valueOf(telefono));


                final String correo = this.getIntent().getExtras().getString("strcorreo");


        BottomNavigationView bottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.menu_home:
                        Toast.makeText(DetalleActivity.this, "Go home section...", Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse("http://www.google.com"));
                        startActivity(intent2);
                        break;
                    case R.id.menu_email:

                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                        intent.putExtra(Intent.EXTRA_EMAIL, correo);

                            startActivity(intent);


                        Toast.makeText(DetalleActivity.this, "Go camera section...", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.menu_sms:
                        Toast.makeText(DetalleActivity.this, descripcion, Toast.LENGTH_SHORT).show();
                        Intent sms = new Intent(Intent.ACTION_SEND);
                        sms.putExtra(Intent.EXTRA_TEXT, "code:");
                        sms.setType("text/plain");
                        //int telef= Integer.parseInt(tv_telefono.toString());
                        startActivity(sms);

                        break;
                    case R.id.menu_share:
                        Toast.makeText(DetalleActivity.this, "Go notification section...", Toast.LENGTH_SHORT).show();
                        Intent share = new Intent(Intent.ACTION_SEND);
                        share.putExtra(Intent.EXTRA_TEXT, "code:");
                        share.setType("text/plain");
                        //int telef= Integer.parseInt(tv_telefono.toString());
                        startActivity(share);
                        break;
                    case R.id.menu_phone:
                        Toast.makeText(DetalleActivity.this, "Go more sections...", Toast.LENGTH_SHORT).show();
                        Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("telef:"+telefono));
                        int REQUEST_PHONE_CALL = 1;
                        if (ContextCompat.checkSelfPermission(DetalleActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                            ActivityCompat.requestPermissions(DetalleActivity.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                        }
                        else
                        {
                            startActivity(callIntent);
                        }

                        //startActivity(callIntent);
                        break;
                }
                return true;
            }
        });

    }
}
