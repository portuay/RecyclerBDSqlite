package com.chincha.mi.turismo.recyclerbdsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<EmpresasCh> listaEmpresas;
    RecyclerView recyclerEmpresas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaEmpresas = new ArrayList<>();
        recyclerEmpresas = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerEmpresas.setLayoutManager(new LinearLayoutManager(this));

        llenarEmpresas();

        AdaptorEmpresas adapter = new AdaptorEmpresas(listaEmpresas);
        recyclerEmpresas.setAdapter(adapter);

    }

    private void llenarEmpresas() {
        listaEmpresas.add(new EmpresasCh("Tambo de Mora","Eata es la info de tambo de mora",R.drawable.tambodemora01));
        listaEmpresas.add(new EmpresasCh("Hacienda San José","Eata es la info de hacienda san jose",R.drawable.haciendasanjose11));
        listaEmpresas.add(new EmpresasCh("Beatita Melchorita","Eata es la info de la beatita melchortia",R.drawable.melchorita01));
        listaEmpresas.add(new EmpresasCh("Tambo de Mora","Eata es la info de tambo de mora",R.drawable.tambodemora02));
        listaEmpresas.add(new EmpresasCh("Hacienda San José","Eata es la info de hacienda san jose",R.drawable.haciendasanjose12));
        listaEmpresas.add(new EmpresasCh("Beatita Melchorita","Eata es la info de la beatita melchortia",R.drawable.melchorita02));
        listaEmpresas.add(new EmpresasCh("Tambo de Mora","Eata es la info de tambo de mora",R.drawable.tambodemora03));
        listaEmpresas.add(new EmpresasCh("Hacienda San José","Eata es la info de hacienda san jose",R.drawable.haciendasanjose13));
        listaEmpresas.add(new EmpresasCh("Beatita Melchorita","Eata es la info de la beatita melchortia",R.drawable.melchorita03));
    }
}
