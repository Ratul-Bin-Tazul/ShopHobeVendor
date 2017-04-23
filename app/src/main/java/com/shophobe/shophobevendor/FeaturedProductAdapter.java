package com.shophobe.shophobevendor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class FeaturedProductAdapter extends RecyclerView.Adapter<FeaturedProductAdapter.FeaturedViewHolder>  {

    private ArrayList<ProductDataProvider> arrayList;
    private Context context;

    public FeaturedProductAdapter(ArrayList<ProductDataProvider> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }



    @Override
    public FeaturedProductAdapter.FeaturedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_item_layout,parent,false);

        FeaturedProductAdapter.FeaturedViewHolder featuredHolder = new FeaturedProductAdapter.FeaturedViewHolder(view);
        return featuredHolder;
    }

    @Override
    public void onBindViewHolder(FeaturedProductAdapter.FeaturedViewHolder holder, int position) {

        ProductDataProvider productDataProvider = arrayList.get(position);

        holder.featuredProductName.setText(productDataProvider.getProductName());
        holder.featuredProductPrice.setText("BDT "+productDataProvider.getProductPrice());
        holder.featuredProductDetails.setText(productDataProvider.getProductColor()+" Color, "+productDataProvider.getProductStock()+" in stock");
        holder.featuredProductImg.setImageResource(R.drawable.shop); //change this in real time



    }

    public static class FeaturedViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView featuredProductName,featuredProductDetails,featuredProductPrice;
        public ImageView featuredProductImg;
        public FeaturedViewHolder(View v) {
            super(v);
            featuredProductName = (TextView)itemView.findViewById(R.id.productName);
            featuredProductPrice = (TextView)itemView.findViewById(R.id.featuredProductPrice);
            featuredProductDetails = (TextView)itemView.findViewById(R.id.productDetails);
            featuredProductImg = (ImageView) itemView.findViewById(R.id.productImg);
        }
    }
}
