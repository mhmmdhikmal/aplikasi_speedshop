package com.example.apk_speed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView speedshop;
    private ArrayList<Speedshop> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speedshop = findViewById(R.id.speedshop);
        speedshop.setHasFixedSize(true);

        list.addAll(Speedshopdata.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        speedshop.setLayoutManager(new LinearLayoutManager(this));
        List_speedshop_adapter listHeroAdapter = new List_speedshop_adapter(list);
        speedshop.setAdapter(listHeroAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void showRecylerCardView() {
        speedshop.setLayoutManager(new LinearLayoutManager(this));
        CardView_speedshop_adapter cardViewHeroAdapter = new CardView_speedshop_adapter(list);
        speedshop.setAdapter(cardViewHeroAdapter);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_cardview:
                showRecylerCardView();
                break;
        }
    }
}