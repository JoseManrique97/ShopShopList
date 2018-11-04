package com.example.android.shop_shoplist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class AgregarArticulo extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="com.example.android.shop_shoplist.extra.MESSAGE";
    private TextView enviar_chupeta;
    private TextView enviar_doritos;
    private TextView enviar_halls;
    private TextView enviar_cricri;
    private TextView enviar_cheetos;
    private TextView enviar_galak;
    private TextView enviar_hershey;
    private TextView enviar_nerds;
    private TextView enviar_pirulin;
    private TextView enviar_platanitos;
    private TextView enviar_oreo;
    private TextView enviar_samba;
    private TextView enviar_chocolate;
    private TextView enviar_sorbeticos;
    private TextView enviar_zucaritas;
    private TextView enviar_cocosette;
    private TextView enviar_mym;
    private TextView enviar_pringles;
    private TextView enviar_frootloops;
    private TextView enviar_flips;


    public AgregarArticulo() {
    }

    //Obtener referencia a la instancia del TextView y asignarle variable privada

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_articulo);
        enviar_chupeta=(TextView) findViewById(R.id.chupetas);
        enviar_doritos=(TextView) findViewById(R.id.doritos);
        enviar_halls=(TextView) findViewById(R.id.halls);
        enviar_cricri=(TextView) findViewById(R.id.cricri);
        enviar_galak=(TextView) findViewById(R.id.galak);
        enviar_cheetos=(TextView) findViewById(R.id.cheetos);
        enviar_hershey=(TextView) findViewById(R.id.hershey);
        enviar_nerds=(TextView) findViewById(R.id.nerds);
        enviar_pirulin=(TextView) findViewById(R.id.pirulin);
        enviar_platanitos=(TextView) findViewById(R.id.platanitos);
        enviar_oreo=(TextView) findViewById(R.id.oreo);
        enviar_samba=(TextView) findViewById(R.id.samba);
        enviar_chocolate=(TextView) findViewById(R.id.chocolate);
        enviar_sorbeticos=(TextView) findViewById(R.id.sorbeticos);
        enviar_zucaritas=(TextView) findViewById(R.id.zucaritas);
        enviar_cocosette=(TextView) findViewById(R.id.cocosette);
        enviar_mym=(TextView) findViewById(R.id.mym);
        enviar_pringles=(TextView) findViewById(R.id.pringles);
        enviar_frootloops=(TextView) findViewById(R.id.frootloops);
        enviar_flips=(TextView) findViewById(R.id.flips);

    }

    //METODOS PARA IR A LA ACTIVIDAD PRINCIPAL UNA VEZ DADO CLICK EN EL ARTICULO

    public void launchchupeta(View view) {
        String agregar1 = enviar_chupeta.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar1);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchdoritos(View view) {
        String agregar2 = enviar_doritos.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar2);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchhalls(View view) {
        String agregar3 = enviar_halls.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar3);
        setResult(RESULT_OK,intentRE);
        finish ();
    }


    public void launchflips(View view) {
        String agregar4 = enviar_flips.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar4);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchcricri(View view) {
        String agregar5 = enviar_cricri.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar5);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchcheetos(View view) {
        String agregar6 = enviar_cheetos.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar6);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchgalak(View view) {
        String agregar7= enviar_galak.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar7);
        setResult(RESULT_OK,intentRE);
        finish ();
    }
    public void launchhershey(View view) {
        String agregar8= enviar_hershey.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar8);
        setResult(RESULT_OK,intentRE);
        finish ();
    }
    public void launchnerds(View view) {
        String agregar9= enviar_nerds.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar9);
        setResult(RESULT_OK,intentRE);
        finish ();
    }
    public void launchpirulin(View view) {
        String agregar10= enviar_pirulin.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar10);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchplatanitos(View view) {
        String agregar11= enviar_platanitos.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar11);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchoreo(View view) {
        String agregar12= enviar_oreo.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar12);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchsamba(View view) {
        String agregar13= enviar_samba.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar13);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchchocolate(View view) {
        String agregar14= enviar_chocolate.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar14);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchsorbeticos(View view) {
        String agregar15= enviar_sorbeticos.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar15);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchzucaritas(View view) {
        String agregar16= enviar_zucaritas.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar16);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchcocosette(View view) {
        String agregar17= enviar_cocosette.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar17);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchmym(View view) {
        String agregar18= enviar_mym.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar18);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchpringles(View view) {
        String agregar19= enviar_pringles.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar19);
        setResult(RESULT_OK,intentRE);
        finish ();
    }

    public void launchfrootloops(View view) {
        String agregar20= enviar_frootloops.getText().toString();
        Intent intentRE = new Intent ();
        intentRE.putExtra(EXTRA_MESSAGE, agregar20);
        setResult(RESULT_OK,intentRE);
        finish ();
    }
}


