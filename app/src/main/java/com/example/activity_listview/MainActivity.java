package com.example.activity_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String data[]={"Banglore","Patna","Muzaffarpur","Mangalore","Chennai","Kolakata","Durgapur","Pune","Mumbai","Hydrabad",
                "Gwalior","Indor","Bhopal","Jaipur","Delhi","Kanpur","Lacknow","Kanpur","Ranchi","Motipur","Motihari",};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.list_view_item,data);
        ListView listView=findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this,position + " Selected Item :" +data[position],Toast.LENGTH_LONG).show();

            }
        });
    }
}