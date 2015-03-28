package com.sicomeafit.campusmovil.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.google.android.gms.maps.model.LatLng;


public class MapData {

	public static ArrayList<String> markersTitles;
	public static ArrayList<String> markersSubtitles;
	public static ArrayList<String> markersCategories;

	//Mapa que contendr� las referencias a los marcadores propios del usuario.
	public static Map<LatLng, String> userMarkers;
    public static Map<LatLng, Integer> userMarkersIds;


	public MapData(ArrayList<String> markersTitlesCreated, ArrayList<String> markersSubtitlesCreated,
			ArrayList<String> markersCategoriesCreated, Map<LatLng, String> userMarkersCreated,
            Map<LatLng, Integer> userMarkersIdsCreated){
		markersTitles = new ArrayList<String>();
		markersSubtitles = new ArrayList<String>();
		markersCategories = new ArrayList<String>();
		markersTitles = markersTitlesCreated;
		markersSubtitles = markersSubtitlesCreated;
		markersCategories = markersCategoriesCreated;

		userMarkers = new HashMap<LatLng, String>();
		userMarkers = userMarkersCreated;
        userMarkersIds = new HashMap<LatLng, Integer>();
        userMarkersIds = userMarkersIdsCreated;
	}

	public static ArrayList<String> getMarkersTitles(){
		ArrayList<String> markersTitlesCopied = new ArrayList<String>();
		for(String title : markersTitles){
			markersTitlesCopied.add(title);
		}
		return markersTitlesCopied;
	}

	public static ArrayList<String> getMarkersSubtitles(){
		ArrayList<String> markersSubtitlesCopied = new ArrayList<String>();
		for(String subtitle : markersSubtitles){
			markersSubtitlesCopied.add(subtitle);
		}
		return markersSubtitlesCopied;
	}

	public static ArrayList<String> getMarkersCategories() {
		ArrayList<String> markersCategoriesCopied = new ArrayList<String>();
		for(String category : markersCategories){
			markersCategoriesCopied.add(category);
		}
		return markersCategoriesCopied;
	}

	public static Map<LatLng, String> getUserMarkers() {
		Map<LatLng, String> userMarkersCopied = new HashMap<LatLng, String>();
		for(Map.Entry<LatLng, String> userMarker : userMarkers.entrySet()){
			userMarkersCopied.put(userMarker.getKey(), userMarker.getValue());
		}
		return userMarkersCopied;
	}

    public static Map<LatLng, Integer> getUserMarkersIds() {
        Map<LatLng, Integer> userMarkersIdsCopied = new HashMap<LatLng, Integer>();
        for(Map.Entry<LatLng, Integer> userMarkerId : userMarkersIds.entrySet()){
            userMarkersIdsCopied.put(userMarkerId.getKey(), userMarkerId.getValue());
        }
        return userMarkersIdsCopied;
    }

    public static void addUserMarker(LatLng pressedPoint, String title){
        userMarkers.put(pressedPoint, title);
    }

    public static void addUserMarkerId(LatLng pressedPoint, int id){
        userMarkersIds.put(pressedPoint, id);
    }

}
