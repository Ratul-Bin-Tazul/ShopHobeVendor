package com.shophobe.shophobevendor;

/**
 * Created by SAMSUNG on 4/12/2017.
 */

public class ProductDataProvider {
    private String productName,productColor,productStock,productPrice;

    public ProductDataProvider(String productColor, String productName, String productStock,String productPrice) {
        this.productColor = productColor;
        this.productName = productName;
        this.productStock = productStock;
        this.productPrice = productPrice;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductStock() {
        return productStock;
    }

    public void setProductStock(String productStock) {
        this.productStock = productStock;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
