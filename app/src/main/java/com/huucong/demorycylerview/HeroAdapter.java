package com.huucong.demorycylerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HeroViewHolder> {
    private List<Hero> heroList;
    public HeroAdapter(List<Hero> heroList){
        this.heroList = heroList;
    }
    @NonNull
    @Override
    public HeroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hero,parent,false);
        return new HeroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HeroViewHolder holder, int position) {
        Hero hero = heroList.get(position);
        holder.imageHero.setImageResource(hero.getImage());
        holder.textNameHero.setText(hero.getName());
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public class HeroViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageHero;
        private TextView textNameHero;
        public HeroViewHolder(@NonNull View itemView) {
            super(itemView);
            imageHero = itemView.findViewById(R.id.image_hero);
            textNameHero = itemView.findViewById(R.id.text_name_hero);
        }
    }
}
