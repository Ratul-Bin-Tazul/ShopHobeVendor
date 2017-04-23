package com.shophobe.shophobevendor;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class ProductFragment extends Fragment {

    private RecyclerView featuredRecyclerview;
    private RecyclerView productRecyclerview;
    private RecyclerView.Adapter featuredProductAdapter;
    private RecyclerView.Adapter productAdapter;
    private RecyclerView.LayoutManager layoutManager;

    public static ArrayList<ProductDataProvider> productArrayList = new ArrayList<>();
    public static ArrayList<ProductDataProvider> featuredProductArrayList = new ArrayList<>();



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_product, container, false);



        featuredRecyclerview = (RecyclerView) view.findViewById(R.id.featuredProductRecyclerview);
        productRecyclerview = (RecyclerView) view.findViewById(R.id.featuredProductRecyclerview);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        featuredRecyclerview.setHasFixedSize(true);
        productRecyclerview.setHasFixedSize(true);


        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getContext());
        featuredRecyclerview.setLayoutManager(layoutManager);
        productRecyclerview.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        featuredProductAdapter = new FeaturedProductAdapter(featuredProductArrayList,getContext());
        featuredRecyclerview.setAdapter(featuredProductAdapter);

        productAdapter = new ProductAdapter(productArrayList,getContext());
        productRecyclerview.setAdapter(productAdapter);


        featuredProductAdapter.notifyDataSetChanged();
        productAdapter.notifyDataSetChanged();


        return view;
    }

}
