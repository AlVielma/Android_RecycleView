package com.example.practica7_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.practica7_recycleview.Adapters.YugiohAdapter;
import com.example.practica7_recycleview.Models.CartasYugioh;

import java.util.ArrayList;
import java.util.List;

public class Yugioh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yugioh);
        List<CartasYugioh> Lista_Yugi = new ArrayList<>();
        Lista_Yugi.add(new CartasYugioh("Dark Magician","Spellcaster"));
        Lista_Yugi.add(new CartasYugioh("Blue Eyes White Dragon","Dragon"));
        Lista_Yugi.add(new CartasYugioh("Red Eyes Black Dragon","Dragon"));

        YugiohAdapter ya = new YugiohAdapter(Lista_Yugi);
        RecyclerView rc= findViewById(R.id.rcYugioh);

        rc.setAdapter(ya);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);


    }
}