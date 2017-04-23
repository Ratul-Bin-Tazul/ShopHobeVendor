package com.shophobe.shophobevendor;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView shopCard;
    public static AlertDialog alertDialog;
    public static ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shopCard = (CardView)findViewById(R.id.shopCard);

        shopCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog = ProgressDialog.show(MainActivity.this, "",
                        "Please wait...", true);
                startActivity(new Intent(MainActivity.this,ShopActivity.class));

            }
        });
    }
}
