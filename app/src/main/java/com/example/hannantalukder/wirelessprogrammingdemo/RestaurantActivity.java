package com.example.hannantalukder.wirelessprogrammingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    private ListView rListView;
    private Restaurent restaurent;
    private ArrayList<Restaurent>restaurents;
    private RestaurentAdapter restaurentAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        rListView = (ListView) findViewById(R.id.myRestaurant);
        restaurent = new Restaurent();
        restaurents = restaurent.getAllRestaurents();
        restaurentAdapter = new RestaurentAdapter(this, restaurents);
        rListView.setAdapter(restaurentAdapter);
        rListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(RestaurantActivity.this, restaurents.get(position).getRestaurentName(), Toast.LENGTH_SHORT).show();
                /*Toast.makeText(RestaurantActivity.this, restaurents.get(position).getRestaurentPhone(), Toast.LENGTH_SHORT).show();*/
            }
        });
    }
}
