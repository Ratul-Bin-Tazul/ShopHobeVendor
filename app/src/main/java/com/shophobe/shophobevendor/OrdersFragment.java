package com.shophobe.shophobevendor;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class OrdersFragment extends Fragment {

    private RecyclerView orderRecyclerview;

    private RecyclerView.Adapter orderAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public static ArrayList<OrderDataProvider> orderArrayList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_orders, container, false);


        orderRecyclerview = (RecyclerView) view.findViewById(R.id.orderRecyclerview);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        orderRecyclerview.setHasFixedSize(true);



        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getContext());
        orderRecyclerview.setLayoutManager(layoutManager);


        // specify an adapter (see also next example)
        orderAdapter = new OrderAdapter(orderArrayList,getContext());
        orderRecyclerview.setAdapter(orderAdapter);




        orderAdapter.notifyDataSetChanged();


        return view;
    }




}
