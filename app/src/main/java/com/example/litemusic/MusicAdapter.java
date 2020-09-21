package com.example.litemusic;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.litemusic.Model.Music;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter <MusicAdapter.MusicViewHolder> {
    List<Music> musicNames;
    Context context;

    public MusicAdapter(Context context, List<Music> musicNames){
        this.context=context;
        this.musicNames=musicNames;
    }
    public class MusicViewHolder extends RecyclerView.ViewHolder {
        public TextView song_title;
        public TextView song_artist;
        public MusicViewHolder(@NonNull View itemView) {
            super(itemView);
            song_title=itemView.findViewById(R.id.song_title);
            song_artist=itemView.findViewById(R.id.song_artist);
        }
    }
    @NonNull
    @Override
    public MusicAdapter.MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView=  LayoutInflater.from(parent.getContext()).inflate(R.layout.music_list, parent, false);
        return new MusicViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAdapter.MusicViewHolder holder, int position) {
        holder.song_title.setText(musicNames.get(position).name);
        holder.song_artist.setText(musicNames.get(position).artist);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(), musicOpen.class);
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return musicNames.size();
    }


}
