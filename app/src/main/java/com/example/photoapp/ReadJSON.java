package com.example.photoapp;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadJSON {
    public static ArrayList<Photo> readJSONFile(Context context) throws IOException, JSONException {
// Read content of company.json

        String jsonText = readText(context, R.raw.photos);
        JSONArray photos = new JSONArray(jsonText);
        ArrayList<Photo> photoData = new ArrayList<Photo>();

        for(int i = 0; i<photos.length(); i++){
            JSONObject pt = photos.getJSONObject(i);
            JSONObject photo = pt.getJSONObject("photo");
            Photo ph = new Photo(photo.optInt("id"),photo.getString("source_photo"),
                    photo.getString("title_photo"), photo.getString("description"));
            photoData.add(ph);
        }
        return photoData;

    }

    private static String readText(Context context, int resId) throws IOException {
        InputStream is = context.getResources().openRawResource(resId);
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String s = null;
        while ((s = br.readLine()) != null) {
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }
}
/*
ArrayList<Photo> Photos = (ArrayList<Photo>) photos;
        JSONObject photo = photos.get("photo");
        int id= photos.getInt("id");
        String name = jsonRoot.getString("name");

        JSONArray jsonArray = jsonRoot.getJSONArray("websites");
        String[] websites = new String[jsonArray.length()];

        for(int i=0;i < jsonArray.length();i++) {
            websites[i] = jsonArray.getString(i);
        }

        JSONObject jsonAddress = jsonRoot.getJSONObject("address");
        String street = jsonAddress.getString("street");
        String city = jsonAddress.getString("city");
        Address address= new Address(street, city);

        Company company = new Company();
        company.setId(id);
        company.setName(name);
        company.setAddress(address);
        company.setWebsites(websites);
        return company;


public void runExample(View view)  {
        try {

            Company company = ReadJSONExample.readCompanyJSONFile(this);

            outputText.setText(company.toString());
        } catch(Exception e)  {
            outputText.setText(e.getMessage());
            e.printStackTrace();
        }
    }
    }*/