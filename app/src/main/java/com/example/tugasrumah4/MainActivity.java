package com.example.tugasrumah4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private ArrayList<Item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new ItemAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new Item("Bring Me The Horizon","Genre : Metalcore","Asal : Inggris",R.drawable.bmth));
        itemArrayList.add(new Item("Avenged Sevenfold","Genre : Heavy Metal","Asal : USA",R.drawable.a7x));
        itemArrayList.add(new Item("Eskimo Callboy","Genre : Metalcore","Asal : Germany",R.drawable.ec));
        itemArrayList.add(new Item("Linkin Park","Genre : Rock","Asal : USA",R.drawable.linkinpark));
        itemArrayList.add(new Item("Nirvana","Genre : Rock","Asal : USA",R.drawable.nirvana));
        itemArrayList.add(new Item("Slipknot","Genre : Metal","Asal : USA",R.drawable.slipknot));
        itemArrayList.add(new Item("System Of Down","Genre : Heavy Metal","Asal : USA",R.drawable.sod));
        itemArrayList.add(new Item("Asking Alexandria","Genre : Metalcore","Asal : Inggris",R.drawable.alexandria));
    }
}