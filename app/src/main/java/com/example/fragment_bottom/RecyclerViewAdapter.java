package com.example.fragment_bottom;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>
{

    Context mcontext;
    List<Chat> chatList;

    public RecyclerViewAdapter(Context mcontext, List<Chat> chatList)
    {
        this.mcontext = mcontext;
        this.chatList = chatList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mcontext).inflate(R.layout.chat_custom,viewGroup,false);
        MyViewHolder myViewHolder = new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i)
    {
        myViewHolder.name_contact.setText(chatList.get(i).getName());
        myViewHolder.phone_contact.setText(chatList.get(i).getPhone());
        myViewHolder.img.setImageResource(chatList.get(i).getPhoto());
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name_contact;
        TextView phone_contact;
        ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name_contact= itemView.findViewById(R.id.name_contact);
            phone_contact=itemView.findViewById(R.id.phone_contact);
            img = itemView.findViewById(R.id.img);
        }
    }
}