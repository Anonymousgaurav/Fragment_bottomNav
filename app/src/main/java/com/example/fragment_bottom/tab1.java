package com.example.fragment_bottom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class tab1 extends Fragment {

    View v;
    private RecyclerView recycler_view_1;
    private List<Chat> chatList;

    public tab1() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        v = inflater.inflate(R.layout.tab_1, container, false);
        recycler_view_1 = v.findViewById(R.id.recycler_view_1);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(getContext(),chatList);
        recycler_view_1.setLayoutManager(new LinearLayoutManager(getActivity()));
        recycler_view_1.setAdapter(adapter);

        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        chatList = new ArrayList<>();
        chatList.add(new Chat("Gaurav Kumar","8427238055",R.drawable.sachin));
        chatList.add(new Chat("Sourav Kumar","8427238055",R.drawable.sachin2));
        chatList.add(new Chat("Gaurav Kumar","8427238055",R.drawable.sachin));
        chatList.add(new Chat("Sourav Kumar","8427238055",R.drawable.sachin2));
        chatList.add(new Chat("Gaurav Kumar","8427238055",R.drawable.sachin));
        chatList.add(new Chat("Sourav Kumar","8427238055",R.drawable.sachin2));
        chatList.add(new Chat("Gaurav Kumar","8427238055",R.drawable.sachin));
        chatList.add(new Chat("Sourav Kumar","8427238055",R.drawable.sachin2));
        chatList.add(new Chat("Gaurav Kumar","8427238055",R.drawable.sachin));
        chatList.add(new Chat("Sourav Kumar","8427238055",R.drawable.sachin2));
        chatList.add(new Chat("Gaurav Kumar","8427238055",R.drawable.sachin));
        chatList.add(new Chat("Sourav Kumar","8427238055",R.drawable.sachin2));
        chatList.add(new Chat("Gaurav Kumar","8427238055",R.drawable.sachin));
        chatList.add(new Chat("Sourav Kumar","8427238055",R.drawable.sachin2));
        chatList.add(new Chat("Gaurav Kumar","8427238055",R.drawable.sachin));
        chatList.add(new Chat("Sourav Kumar","8427238055",R.drawable.sachin2));

    }
}