package com.mood.jenaPlus;

import android.graphics.Color;
import android.location.Location;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ceciliaxiang on 2017-02-25.
 */

public class MoodList {

    private ArrayList<Mood> UserMoodList = new ArrayList<>();
    private ArrayList<Mood> FollowingMoodList = new ArrayList<>();


    public void addMood(Mood mood){
        
        UserMoodList.add(mood);
    }

    public void deleteMood(Mood mood){

        UserMoodList.remove(mood);
    }


    public Mood getUserIndex(int index){
        return UserMoodList.get(index);
    }

    public Mood getFollowingIndex(int index){
        return FollowingMoodList.get(index);
    }


    public ArrayList<Mood> getUserMood() {
        return UserMoodList;
    }

    public ArrayList<Mood> getFollowingMood() {
        return FollowingMoodList;
    }



}
