package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private Spinner spinner1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1=(Spinner)findViewById(R.id.spinner1);
        final  List<String>arraysp1=new ArrayList<String>();
        arraysp1.add("Language");
        arraysp1.add("Arabic");
        arraysp1.add("English");

        final ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arraysp1);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                if(position==1)
                {
                    Intent i=new Intent("android.intent.action.Arabic");
                    startActivity(i);

                }

               else if(position==2)
                {
                    Intent i=new Intent("android.intent.action.Einglish");
                    startActivity(i);

                }
               spinner1.setSelection(0);


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {




            }


        });

    }

}

