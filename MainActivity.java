package com.example.android.shop_shoplist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

//DEFINIENDO TEXTVIEWS CON LOS ARTICULOS AGREGADOS EN LA LISTA

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    public static final int TEXT_REQUEST=1;
    int count=1;

    private TextView articulo1;
    private TextView articulo2;
    private TextView articulo3;
    private TextView articulo4;
    private TextView articulo5;
    private TextView articulo6;
    private TextView articulo7;
    private TextView articulo8;
    private TextView articulo9;
    private TextView articulo10;
    private TextView articulo11;
    private TextView articulo12;
    private TextView articulo13;
    private TextView articulo14;
    private TextView articulo15;
    private TextView articulo16;
    private TextView articulo17;
    private TextView articulo18;
    private TextView articulo19;
    private TextView articulo20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //PONER ICONO EN EL ACTION BAR
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        articulo1 = (TextView) findViewById(R.id.text1_before_list);
        articulo2 = (TextView) findViewById(R.id.text2_before_list);
        articulo3 = (TextView) findViewById(R.id.text3_before_list);
        articulo4 = (TextView) findViewById(R.id.text4_before_list);
        articulo5 = (TextView) findViewById(R.id.text5_before_list);
        articulo6 = (TextView) findViewById(R.id.text6_before_list);
        articulo7 = (TextView) findViewById(R.id.text7_before_list);
        articulo8 = (TextView) findViewById(R.id.text8_before_list);
        articulo9 = (TextView) findViewById(R.id.text9_before_list);
        articulo10 = (TextView) findViewById(R.id.text10_before_list);
        articulo11 = (TextView) findViewById(R.id.text11_before_list);
        articulo12 = (TextView) findViewById(R.id.text12_before_list);
        articulo13 = (TextView) findViewById(R.id.text13_before_list);
        articulo14 = (TextView) findViewById(R.id.text14_before_list);
        articulo15 = (TextView) findViewById(R.id.text15_before_list);
        articulo16 = (TextView) findViewById(R.id.text16_before_list);
        articulo17 = (TextView) findViewById(R.id.text17_before_list);
        articulo18 = (TextView) findViewById(R.id.text18_before_list);
        articulo19 = (TextView) findViewById(R.id.text19_before_list);
        articulo20 = (TextView) findViewById(R.id.text20_before_list);



        if (savedInstanceState != null) {
            boolean isVisible=savedInstanceState.getBoolean("reply_visible");


            if (isVisible) {
                articulo1.setText(savedInstanceState.getString("reply_articulo1"));
                articulo1.setVisibility(View.VISIBLE);

                articulo2.setText(savedInstanceState.getString("reply_articulo2"));
                articulo2.setVisibility(View.VISIBLE);

                articulo3.setText(savedInstanceState.getString("reply_articulo3"));
                articulo3.setVisibility(View.VISIBLE);

                articulo4.setText(savedInstanceState.getString("reply_articulo4"));
                articulo4.setVisibility(View.VISIBLE);

                articulo5.setText(savedInstanceState.getString("reply_articulo5"));
                articulo5.setVisibility(View.VISIBLE);

                articulo6.setText(savedInstanceState.getString("reply_articulo6"));
                articulo6.setVisibility(View.VISIBLE);

                articulo7.setText(savedInstanceState.getString("reply_articulo7"));
                articulo7.setVisibility(View.VISIBLE);

                articulo8.setText(savedInstanceState.getString("reply_articulo8"));
                articulo8.setVisibility(View.VISIBLE);

                articulo9.setText(savedInstanceState.getString("reply_articulo9"));
                articulo9.setVisibility(View.VISIBLE);

                articulo10.setText(savedInstanceState.getString("reply_articulo10"));
                articulo10.setVisibility(View.VISIBLE);

                articulo11.setText(savedInstanceState.getString("reply_articulo11"));
                articulo11.setVisibility(View.VISIBLE);

                articulo12.setText(savedInstanceState.getString("reply_articulo12"));
                articulo12.setVisibility(View.VISIBLE);

                articulo13.setText(savedInstanceState.getString("reply_articulo13"));
                articulo13.setVisibility(View.VISIBLE);

                articulo14.setText(savedInstanceState.getString("reply_articulo14"));
                articulo14.setVisibility(View.VISIBLE);

                articulo15.setText(savedInstanceState.getString("reply_articulo15"));
                articulo15.setVisibility(View.VISIBLE);

                articulo16.setText(savedInstanceState.getString("reply_articulo16"));
                articulo16.setVisibility(View.VISIBLE);

                articulo17.setText(savedInstanceState.getString("reply_articulo17"));
                articulo17.setVisibility(View.VISIBLE);

                articulo18.setText(savedInstanceState.getString("reply_articulo18"));
                articulo18.setVisibility(View.VISIBLE);

                articulo19.setText(savedInstanceState.getString("reply_articulo19"));
                articulo19.setVisibility(View.VISIBLE);

                articulo20.setText(savedInstanceState.getString("reply_articulo20"));
                articulo20.setVisibility(View.VISIBLE);

                count=savedInstanceState.getInt("contador");
            }
        }
    }


// Al tocar boton en la principal va a la segunda actividad

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG,"Button clicked");
        Intent intent = new Intent(this, AgregarArticulo.class);
        startActivityForResult(intent,TEXT_REQUEST);
    }

    public void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if (requestCode==TEXT_REQUEST){
            if(resultCode==RESULT_OK) {
                if(count==1){

                    String agregar1 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo1.setText(agregar1);
                }
                if(count==2){

                    String agregar2 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo2.setText(agregar2);
                }
                if(count==3) {

                    String agregar3 = data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo3.setText(agregar3);
                }

                if(count==4){

                    String agregar4 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo4.setText(agregar4);
                }
                if(count==5){

                    String agregar5 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo5.setText(agregar5);
                }
                if(count==6){

                    String agregar6 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo6.setText(agregar6);
                }
                if(count==7){

                    String agregar7 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo7.setText(agregar7);
                }
                if(count==8){

                    String agregar8 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo8.setText(agregar8);
                }
                if(count==9){

                    String agregar9 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo9.setText(agregar9);
                }
                if(count==10){

                    String agregar10 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo10.setText(agregar10);
                }
                if(count==11){

                    String agregar11 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo11.setText(agregar11);
                }
                if(count==12){

                    String agregar12 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo12.setText(agregar12);
                }
                if(count==13){

                    String agregar13 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo13.setText(agregar13);
                }
                if(count==14){

                    String agregar14 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo14.setText(agregar14);
                }
                if(count==15){

                    String agregar15 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo15.setText(agregar15);
                }
                if(count==16){

                    String agregar16 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo16.setText(agregar16);
                }
                if(count==17){

                    String agregar17 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo17.setText(agregar17);
                }
                if(count==18){

                    String agregar18 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo18.setText(agregar18);
                }
                if(count==19){

                    String agregar19 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo19.setText(agregar19);
                }
                if(count==20){

                    String agregar20 =data.getStringExtra(AgregarArticulo.EXTRA_MESSAGE);
                    articulo20.setText(agregar20);
                }
                count=count+1;
            }
        }
    }

public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putBoolean("reply_visible", true);

    outState.putString("reply_articulo1", articulo1.getText().toString());
    outState.putString("reply_articulo2", articulo2.getText().toString());
    outState.putString("reply_articulo3", articulo3.getText().toString());
    outState.putString("reply_articulo4", articulo4.getText().toString());
    outState.putString("reply_articulo5", articulo5.getText().toString());
    outState.putString("reply_articulo6", articulo6.getText().toString());
    outState.putString("reply_articulo7", articulo7.getText().toString());
    outState.putString("reply_articulo8", articulo8.getText().toString());
    outState.putString("reply_articulo9", articulo9.getText().toString());
    outState.putString("reply_articulo10", articulo10.getText().toString());
    outState.putString("reply_articulo11", articulo11.getText().toString());
    outState.putString("reply_articulo12", articulo12.getText().toString());
    outState.putString("reply_articulo13", articulo13.getText().toString());
    outState.putString("reply_articulo14", articulo14.getText().toString());
    outState.putString("reply_articulo15", articulo15.getText().toString());
    outState.putString("reply_articulo16", articulo16.getText().toString());
    outState.putString("reply_articulo17", articulo17.getText().toString());
    outState.putString("reply_articulo18", articulo18.getText().toString());
    outState.putString("reply_articulo19", articulo19.getText().toString());
    outState.putString("reply_articulo20", articulo20.getText().toString());
    outState.putInt("contador", count);
}
}



