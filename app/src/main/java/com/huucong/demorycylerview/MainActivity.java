package com.huucong.demorycylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Hero> heroList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        recyclerView = findViewById(R.id.recycler_view);
        heroList = new ArrayList<>();
        initHeroList();

        HeroAdapter adapter = new HeroAdapter(heroList);
        LinearLayoutManager manager =
                new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }
    private void initHeroList(){
        heroList.add( new Hero("Iron Man", R.drawable.ironman));
        heroList.add( new Hero("Captain America", R.drawable.captain));
        heroList.add( new Hero("Spider Man", R.drawable.spiderman));
    }
}
