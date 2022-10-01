package com.johannes2002895.mywaifulist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private RecyclerView rvwaifu;
    private ArrayList<Waifu> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvwaifu = findViewById(R.id.rv_waifus);
        rvwaifu.setHasFixedSize(true);
        list.addAll(WaifuData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvwaifu.setLayoutManager(new LinearLayoutManager(this));
        ListWaifuAdapter listCoffeeDrinkAdapter = new  ListWaifuAdapter(list);
        rvwaifu.setAdapter(listCoffeeDrinkAdapter);

        //onClick
        listCoffeeDrinkAdapter.setOnItemClickCallback(new ListWaifuAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Waifu data) {
                showSelectedCoffeeDrink(data);
            }
        });
    }
    //onclick method

    private void showSelectedCoffeeDrink(Waifu coffeeDrink){
        Intent kirimData = new Intent(MainActivity.this,DetailWaifu.class);
        kirimData.putExtra(DetailWaifu.EXTRA_NAMA, coffeeDrink.getName());
        kirimData.putExtra(DetailWaifu.EXTRA_DETAIL,
                coffeeDrink.getDetail());
        kirimData.putExtra(DetailWaifu.EXTRA_IMGPOSTER,
                coffeeDrink.getPhotoPoster());
        startActivity(kirimData);
    }
    }
