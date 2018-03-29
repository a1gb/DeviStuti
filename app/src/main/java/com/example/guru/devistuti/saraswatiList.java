package com.example.guru.devistuti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class saraswatiList extends AppCompatActivity {
    ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
    private SimpleAdapter sa;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saraswati_list);
        getSupportActionBar().setTitle("Saraswati Stuti");
        listView=(ListView)findViewById(R.id.list);

        HashMap<String,String> item;    //Used to link data to lines
        //Load the data
        for(int i=0;i<States_Capitals_Population.length;i++){
            item = new HashMap<String,String>();
            item.put( "line1", States_Capitals_Population[i][0]);
            item.put( "line2", States_Capitals_Population[i][1]);
            item.put( "line3", States_Capitals_Population[i][2]);
            list.add( item );
        }
        //Use an Adapter to link data to Views
        sa = new SimpleAdapter(this, list,
                R.layout.row_list,
                new String[] { "line1","line2", "line3" },
                new int[] {R.id.line_a, R.id.line_b, R.id.line_c});
        //Link the Adapter to the list
        listView.setAdapter(sa);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0)
                {
                    Toast.makeText(getApplicationContext(),"Haha U clicked Me!!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(saraswatiList.this, com.example.guru.devistuti.saraswati.class);
                    startActivity(intent);


                }
                if (position==1)
                {
                    Intent intent = new Intent(saraswatiList.this, com.example.guru.devistuti.saraswati.class);
                    startActivity(intent);


                }
                if (position==2)
                {
                    Intent intent = new Intent(saraswatiList.this, com.example.guru.devistuti.saraswati.class);
                    startActivity(intent);


                }
                if (position==3)
                {
                    Intent intent = new Intent(saraswatiList.this, com.example.guru.devistuti.saraswati.class);
                    startActivity(intent);


                }
            }
        });


    }
    //Data
    private String[][] States_Capitals_Population =
            {{"Padavalambanastuti","By candrasekara Bharati Mahaswamiji","10:28"},
                    {"Desikotkarsamanjari","By candrasekara Bharati Mahaswamiji","13:21"},
                    {"Guruprathanastotram","By candrasekara Bharati Mahaswamiji","11:37"},
                    {"Srimadacharyendrastavam","By candrasekara Bharati Mahaswamiji","7:44"}

            };
}
