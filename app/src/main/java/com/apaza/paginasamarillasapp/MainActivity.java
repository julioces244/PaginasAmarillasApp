package com.apaza.paginasamarillasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.List;
import android.view.View;

import static android.support.design.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list = (ListView) findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);

        list.setAdapter(adapter);




        Empresa empresa1 = new Empresa(1,"Gastronomia", "La Central","La Molina", 3551111,"lacentral@hotmail.com","www.lacentral.com","Un buen restaurant");
        Empresa empresa2 = new Empresa(1,"Gastronomia", "Norkys","Surco",3550000,"norkys@hotmail.com","www.norkys.com","El mejor pollo");
        Empresa empresa3 = new Empresa(1,"Gastronomia", "El Buen Sabor","SantaAnita",3550000,"elbuensabor@hotmail.com","www.elbuensabor.com","Ufff q rico!");
        Empresa empresa4 = new Empresa(1,"Gastronomia", "Delicias del mar","San Miguel",3559999,"delicias@hotmail.com","www.deliciasdelmar.com","Pescados y mariscos");
        Empresa empresa5 = new Empresa(1,"Gastronomia", "Don chicharron","Cercado de Lima",3558888,"donchicharon@hotmail.com","www.donchicharon.com","El mejor chicharron");
        EmpresaRepository empresaRepository = EmpresaRepository.getInstance();
        empresaRepository.agregarEmpresa(empresa1);
        empresaRepository.agregarEmpresa(empresa2);
        empresaRepository.agregarEmpresa(empresa3);
        empresaRepository.agregarEmpresa(empresa4);
        empresaRepository.agregarEmpresa(empresa5);
        List <Empresa> empresas = empresaRepository.getEmpresas();
                //String nombre = this.getIntent().getExtras().getString("strnombre");
        for (Empresa empresa : empresas) {
            adapter.add(empresa.getNombre());
        }



        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String s = list.getItemAtPosition(i).toString();

                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
                // If you want to close the adapter
                if(s.equalsIgnoreCase("La Central")){
                    Empresa empresa1 = new Empresa(1,"Gastronomia", "La Central","La Molina", 3551111,"lacentral@hotmail.com","www.lacentral.com","Un buen restaurant");


                Intent ListSong = new Intent(getApplicationContext(), DetalleActivity.class);
                    ListSong.putExtra("strnombre",empresa1.getNombre());
                    ListSong.putExtra("strrubro",empresa1.getRubro());
                    ListSong.putExtra("strdireccion",empresa1.getDireccion());
                    ListSong.putExtra("inttelefono",empresa1.getTelefono());
                    ListSong.putExtra("strcorreo",empresa1.getCorreo());
                    ListSong.putExtra("strurl",empresa1.getUrl());
                    ListSong.putExtra("strdescripcion",empresa1.getInfo());
                startActivity(ListSong);

                }else if(s.equalsIgnoreCase("Norkys")){
                    Empresa empresa1 = new Empresa(1,"Gastronomia", "Norkys","Surco",3550000,"norkys@hotmail.com","www.norkys.com","El mejor pollo");


                    Intent ListSong = new Intent(getApplicationContext(), DetalleActivity.class);
                    ListSong.putExtra("strnombre",empresa1.getNombre());
                    ListSong.putExtra("strrubro",empresa1.getRubro());
                    ListSong.putExtra("strdireccion",empresa1.getDireccion());
                    ListSong.putExtra("inttelefono",empresa1.getTelefono());
                    ListSong.putExtra("strcorreo",empresa1.getCorreo());
                    ListSong.putExtra("strurl",empresa1.getUrl());
                    ListSong.putExtra("strdescripcion",empresa1.getInfo());
                    startActivity(ListSong);
                }else if(s.equalsIgnoreCase("El Buen Sabor")){
                    Empresa empresa1 = new Empresa(1,"Gastronomia", "El Buen Sabor","SantaAnita",3550000,"elbuensabor@hotmail.com","www.elbuensabor.com","Ufff q rico!");


                    Intent ListSong = new Intent(getApplicationContext(), DetalleActivity.class);
                    ListSong.putExtra("strnombre",empresa1.getNombre());
                    ListSong.putExtra("strrubro",empresa1.getRubro());
                    ListSong.putExtra("strdireccion",empresa1.getDireccion());
                    ListSong.putExtra("inttelefono",empresa1.getTelefono());
                    ListSong.putExtra("strcorreo",empresa1.getCorreo());
                    ListSong.putExtra("strurl",empresa1.getUrl());
                    ListSong.putExtra("strdescripcion",empresa1.getInfo());
                    startActivity(ListSong);
                }else if(s.equalsIgnoreCase("Delicias del mar")){
                    Empresa empresa1 = new Empresa(1,"Gastronomia", "Delicias del mar","San Miguel",3559999,"delicias@hotmail.com","www.deliciasdelmar.com","Pescados y mariscos");

                    Intent ListSong = new Intent(getApplicationContext(), DetalleActivity.class);
                    ListSong.putExtra("strnombre",empresa1.getNombre());
                    ListSong.putExtra("strrubro",empresa1.getRubro());
                    ListSong.putExtra("strdireccion",empresa1.getDireccion());
                    ListSong.putExtra("inttelefono",empresa1.getTelefono());
                    ListSong.putExtra("strcorreo",empresa1.getCorreo());
                    ListSong.putExtra("strurl",empresa1.getUrl());
                    ListSong.putExtra("strdescripcion",empresa1.getInfo());
                    startActivity(ListSong);
                }else if(s.equalsIgnoreCase("Don chicharron")){
                    Empresa empresa1 = new Empresa(1,"Gastronomia", "Don chicharron","Cercado de Lima",3558888,"donchicharon@hotmail.com","www.donchicharon.com","El mejor chicharron");

                    Intent ListSong = new Intent(getApplicationContext(), DetalleActivity.class);
                    ListSong.putExtra("strnombre",empresa1.getNombre());
                    ListSong.putExtra("strrubro",empresa1.getRubro());
                    ListSong.putExtra("strdireccion",empresa1.getDireccion());
                    ListSong.putExtra("inttelefono",empresa1.getTelefono());
                    ListSong.putExtra("strcorreo",empresa1.getCorreo());
                    ListSong.putExtra("strurl",empresa1.getUrl());
                    ListSong.putExtra("strdescripcion",empresa1.getInfo());
                    startActivity(ListSong);
                }


            }

        });


    }
}