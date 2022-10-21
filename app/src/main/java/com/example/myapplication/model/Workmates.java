package com.example.myapplication.model;

import androidx.annotation.DrawableRes;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Workmates {

    private final String name;
    private final Restaurant mRestaurant;
    private final boolean choose;
    @DrawableRes
    private final int avatar;

    public Workmates(String name, int avatar, Restaurant restaurant, boolean choose) {
        this.name = name;
        this.avatar = avatar;
        this.mRestaurant = restaurant;
        this.choose = choose;
    }

    public static List<Workmates> DUMMY_WORKMATES = Arrays.asList(
            new Workmates("Scarlett", R.drawable.circle, Restaurant.getRestaurant()[0], true),
            new Workmates("Hugh", R.drawable.circle, Restaurant.getRestaurant()[0], true),
            new Workmates("Nana", R.drawable.circle, Restaurant.getRestaurant()[0], true),
            new Workmates("Godfrey", R.drawable.circle, Restaurant.getRestaurant()[0], false));

    public static List<Workmates> getWorkmates(){
        return new ArrayList<>(DUMMY_WORKMATES);
    }

//    public static Workmates[] getWorkmates() {
//        return new Workmates[]{new Workmates("Scarlett", R.drawable.ic_baseline_supervisor_account_24, Restaurant.getRestaurant()[0], true),
//                new Workmates("Hugh", R.drawable.ic_baseline_supervisor_account_24, Restaurant.getRestaurant()[0], true),
//                new Workmates("Nana", R.drawable.ic_baseline_supervisor_account_24, Restaurant.getRestaurant()[0], true),
//                new Workmates("Godfrey", R.drawable.ic_baseline_supervisor_account_24, Restaurant.getRestaurant()[0], false)};
//    }

    public String getName() {
        return name;
    }

    public int getAvatar() {
        return avatar;
    }

    public Restaurant getRestaurant() {
        return mRestaurant;
    }

    public boolean isChoose() {
        return choose;
    }
}
