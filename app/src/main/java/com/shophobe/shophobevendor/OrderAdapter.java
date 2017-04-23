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

public class OrderAdapter  extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder>    {

    private ArrayList<OrderDataProvider> arrayList;
    private Context context;

    public OrderAdapter(ArrayList<OrderDataProvider> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public OrderAdapter.OrderViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.order_item_layout,parent,false);

        OrderAdapter.OrderViewHolder orderHolder = new OrderAdapter.OrderViewHolder(view);
        return orderHolder;
    }

    @Override
    public void onBindViewHolder(OrderAdapter.OrderViewHolder holder, int position) {

        OrderDataProvider orderDataProvider = arrayList.get(position);

        holder.customerName.setText(orderDataProvider.getCustomerName());
        holder.orderPrice.setText("BDT "+orderDataProvider.getOrderPrice());
        holder.numOfProduct.setText(orderDataProvider.getProductNum()+" product(s) orderd");
        holder.customerAddress.setText(orderDataProvider.getCustomerAddress());
        holder.orderStatus.setImageResource(R.mipmap.circle_pending); //change this in real time

    }

    public static class OrderViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView customerName,numOfProduct,customerAddress,orderPrice;
        public ImageView orderStatus;

        public OrderViewHolder(View v) {
            super(v);
            customerName = (TextView)itemView.findViewById(R.id.customerName);
            numOfProduct = (TextView)itemView.findViewById(R.id.numOfProduct);
            customerAddress = (TextView)itemView.findViewById(R.id.customerAddress);
            orderPrice = (TextView)itemView.findViewById(R.id.orderPrice);
            orderStatus = (ImageView) itemView.findViewById(R.id.orderStatusCircle);
        }
    }
}
