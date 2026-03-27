package com.commerce;

import java.util.List;

public class Category {
    // 속성
    private List<Product> productList; // 리스트를 묶어서 카테고리가 되는 거임
    private String categoryName;

    // 생성자
    public Category(List<Product> productList, String categoryName) {
        this.productList = productList;
        this.categoryName = categoryName;
    }

    // 기능
    public List<Product> getProductList() {
        return productList;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
