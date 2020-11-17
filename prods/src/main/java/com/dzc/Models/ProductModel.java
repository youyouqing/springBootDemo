package com.dzc.Models;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;

public class ProductModel {
    public ProductModel(int product_id, String product_name) {
        this.product_id = product_id;
        this.product_name = product_name;
    }

    private int product_id;

    @NotNull
    @Length(min = 2, max = 50, message = "商品名称不合法")
    private String product_name;

    @Range(min = 0, max = 1000, message = "价格不合法")
    private float product_price;



    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }



    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

}
