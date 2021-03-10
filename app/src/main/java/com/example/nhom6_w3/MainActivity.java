package com.example.nhom6_w3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main06);
        sp=findViewById(R.id.spUni);
        //String[] st={"PTIT","NEU","HUST","FTU"};
//        ArrayAdapter<String > adapter=new ArrayAdapter<String >(this,
//                android.R.layout.simple_spinner_item,st);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         String[] st=getResources().getStringArray(R.array.uni);
        ArrayAdapter<String > adapter=new ArrayAdapter<String >(this,
                R.layout.spinner_item,st);
        adapter.setDropDownViewResource(R.layout.spinner_item);
        sp.setAdapter(adapter);
    }
}
