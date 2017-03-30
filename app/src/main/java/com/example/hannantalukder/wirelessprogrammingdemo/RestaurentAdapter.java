package com.example.hannantalukder.wirelessprogrammingdemo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.resource;
import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by Hannan Talukder on 3/31/2017.
 */

public class RestaurentAdapter extends ArrayAdapter<Restaurent> {
    private Context context;
    private ArrayList<Restaurent> restaurents;
    private int number;

    public RestaurentAdapter(@NonNull Context context, ArrayList<Restaurent> restaurents) {
        super(context, R.layout.restaurant_layout, restaurents);
        this.context = context;
        this.restaurents = restaurents;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.restaurant_layout,parent,false);
        ImageView restaurantImageView = (ImageView) convertView.findViewById(R.id.restaurantImage);
        TextView restaurantName = (TextView) convertView.findViewById(R.id.restaurantName);
        TextView restaurentLocation = (TextView) convertView.findViewById(R.id.restaurentLocationET);
        TextView restaurentPhone = (TextView) convertView.findViewById(R.id.restaurentPhone);

        restaurantName.setText(restaurents.get(position).getRestaurentName());
        restaurentLocation.setText(restaurents.get(position).getRestaurentLocation());
        restaurentPhone.setText(restaurents.get(position).getRestaurentPhone());
        restaurantImageView.setImageResource(restaurents.get(position).getRestaurantImageId());
        
        

        restaurentPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(context, restaurents.get(position).getRestaurentPhone(), Toast.LENGTH_SHORT).show();

                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:"+restaurents.get(position).getRestaurentPhone()));
                startActivity(call);
            }

            private void startActivity(Intent call) {
            }
        });


        return convertView;
    }
    
}
