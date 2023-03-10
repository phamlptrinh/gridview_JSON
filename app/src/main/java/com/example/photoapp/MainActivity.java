package com.example.photoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import org.json.JSONException;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    GridView gridview;
    private AdapterView.OnItemClickListener onitemclick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Intent intent = new Intent(getBaseContext(), ViewPhotoActivity.class);
            intent.putExtra("id", gridview.getAdapter().getItemId(position));
            startActivity(intent);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridview = findViewById(R.id.gridview);
        //PhotoAdapter adapter = new PhotoAdapter(PhotoData.generatePhotoData(), getApplicationContext());
        //JSON
        PhotoData ptd = new PhotoData(getApplicationContext());
        PhotoAdapter adapter = new PhotoAdapter(ptd.generatePhotoData(), getApplicationContext());

        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(onitemclick);
    }
}