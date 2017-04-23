package com.shophobe.shophobevendor;



public class OrderDataProvider {

    private String customerName,productNum,customerAddress,orderPrice;

    public OrderDataProvider(String customerAddress, String customerName, String orderPrice, String productNum) {
        this.customerAddress = customerAddress;
        this.customerName = customerName;
        this.orderPrice = orderPrice;
        this.productNum = productNum;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }
}
