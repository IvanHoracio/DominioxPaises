package com.example.ivan_.dominioxpaises;



import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class inicio extends AppCompatActivity {

    String[] nombres;
    String[] dominios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Se usan los arreglos de nombres de países y dominio que están en recursos
        Resources res = getResources();
        nombres = res.getStringArray(R.array.array_paises);
        dominios = res.getStringArray(R.array.array_dominiosPaises);
        ListView lstNombresPaises = (ListView) findViewById(R.id.lstPaises);
        Pais myAdapter = new Pais(getApplicationContext(), nombres, dominios);
        lstNombresPaises.setAdapter(myAdapter);
    }
}