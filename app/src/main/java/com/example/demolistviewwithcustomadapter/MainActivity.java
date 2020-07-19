package com.example.demolistviewwithcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    private String[] countryName;
    private int[] img = {R.drawable.afg,R.drawable.arm,R.drawable.aze,R.drawable.bah,R.drawable.bng,R.drawable.bhu,
            R.drawable.chi,R.drawable.ind,R.drawable.jap,R.drawable.nep,R.drawable.pak,R.drawable.sri,
            R.drawable.can,R.drawable.lon,R.drawable.ger};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName = getResources().getStringArray(R.array.country_name);
        listView = findViewById(R.id.listViewId);

        CustomAdapter adapter = new CustomAdapter(MainActivity.this,countryName,img);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = countryName[position];
                Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
