package com.commerce;

public class Product {
    // 속성
    private String name; // 상품명
    private int price; // 가격
    private String description; // 설명
    private int quantity; // 재고 수량

    // 생성자
    public Product(String name, int price, String description, int quantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    // 기능
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }
}
