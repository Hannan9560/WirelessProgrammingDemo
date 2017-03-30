package com.example.hannantalukder.wirelessprogrammingdemo;

import java.util.ArrayList;

/**
 * Created by Hannan Talukder on 3/31/2017.
 */

public class Restaurent {
    private String restaurentName;
    private String restaurentLocation;
    private String restaurentPhone;
    private int restaurantImageId;

    public Restaurent(String restaurentName, String restaurentLocation, String restaurentPhone) {
        this.restaurentName = restaurentName;
        this.restaurentLocation = restaurentLocation;
        this.restaurentPhone = restaurentPhone;
    }

    public Restaurent(String restaurentName, String restaurentLocation, String restaurentPhone, int restaurantImageId) {
        this.restaurentName = restaurentName;
        this.restaurentLocation = restaurentLocation;
        this.restaurentPhone = restaurentPhone;
        this.restaurantImageId = restaurantImageId;
    }

    public Restaurent() {
    }

    public String getRestaurentName() {
        return restaurentName;
    }

    public void setRestaurentName(String restaurentName) {
        this.restaurentName = restaurentName;
    }

    public String getRestaurentLocation() {
        return restaurentLocation;
    }

    public void setRestaurentLocation(String restaurentLocation) {
        this.restaurentLocation = restaurentLocation;
    }

    public String getRestaurentPhone() {
        return restaurentPhone;
    }

    public void setRestaurentPhone(String restaurentPhone) {
        this.restaurentPhone = restaurentPhone;
    }

    public int getRestaurantImageId() {
        return restaurantImageId;
    }

    public void setRestaurantImageId(int restaurantImageId) {
        this.restaurantImageId = restaurantImageId;
    }
    public ArrayList<Restaurent> getAllRestaurents()
    {
        ArrayList<Restaurent> restaurents = new ArrayList<>();
        restaurents.add(new Restaurent("BFC", "Road # 27, Dhanmondhi 27","01252525", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road # 27, Dhanmondhi 27","01252525", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road # 27, Dhanmondhi 27","01252525", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road # 27, Dhanmondhi 27","01252525", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road # 27, Dhanmondhi 27","01252525", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road # 27, Dhanmondhi 27","01252525", R.mipmap.ic_launcher));
        restaurents.add(new Restaurent("BFC", "Road # 27, Dhanmondhi 27","01252525", R.mipmap.ic_launcher));

        return restaurents;
    }
}
