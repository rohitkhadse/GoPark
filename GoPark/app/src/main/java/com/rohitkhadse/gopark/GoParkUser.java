package com.rohitkhadse.gopark;

import com.google.android.gms.maps.model.Marker;

import java.util.HashMap;

public class GoParkUser {
    public static enum Color { Green, Red, Blue, Orange } ;
    static int userId ;
    static String name;
    static String email;
    static boolean canRefreshMap=true;
    static int userPoints;


    static ParkLotData selectedParkLot;

    public static ParkLotData getSelectedParkLot() {
        return selectedParkLot;
    }

    public static void setSelectedParkLot(ParkLotData selectedParkLot) {
        GoParkUser.selectedParkLot = selectedParkLot;
    }

    public static int getUserPoints() {
        return userPoints;
    }

    public static void setUserPoints(int userPoints) {
        GoParkUser.userPoints = userPoints;
    }

    public static boolean isCanRefreshMap() {
        return canRefreshMap;
    }

    public static void setCanRefreshMap(boolean canRefreshMap) {
        GoParkUser.canRefreshMap = canRefreshMap;
    }

    public static HashMap<Marker, ParkLotData> allMarkersMap = new HashMap<Marker, ParkLotData>();

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        GoParkUser.userId = userId;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        GoParkUser.name = name;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        GoParkUser.email = email;
    }


}

