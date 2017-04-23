package com.shophobe.shophobevendor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SAMSUNG on 4/12/2017.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>   {

    private ArrayList<ProductDataProvider> arrayList;
    private Context context;

    public ProductAdapter(ArrayList<ProductDataProvider> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_item_layout,parent,false);

        ProductAdapter.ProductViewHolder productHolder = new ProductAdapter.ProductViewHolder(view);
        return productHolder;
    }

    @Override
    public void onBindViewHolder(ProductAdapter.ProductViewHolder holder, int position) {

        ProductDataProvider productDataProvider = arrayList.get(position);

        holder.productName.setText(productDataProvider.getProductName());
        holder.productPrice.setText("BDT "+productDataProvider.getProductPrice());
        holder.productDetails.setText(productDataProvider.getProductColor()+" Color, "+productDataProvider.getProductStock()+" in stock");
        holder.productImg.setImageResource(R.drawable.shop); //change this in real time


    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView productName,productDetails,productPrice;
        public ImageView productImg;

        public ProductViewHolder(View v) {
            super(v);
            productName = (TextView)itemView.findViewById(R.id.productName);
            productDetails = (TextView)itemView.findViewById(R.id.productDetails);
            productPrice = (TextView)itemView.findViewById(R.id.productPrice);
            productImg = (ImageView) itemView.findViewById(R.id.productImg);
        }
    }
}
