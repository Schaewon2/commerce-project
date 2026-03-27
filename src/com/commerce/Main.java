package com.commerce;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Category> categoryList = new ArrayList<>();
        List<Product> electronics = new ArrayList<>();

        Product product1 = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 30);
        Product product2 = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 15);
        Product product3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 20);
        Product product4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 10);

        electronics.add(product1);
        electronics.add(product2);
        electronics.add(product3);
        electronics.add(product4);

        Category category1 = new Category(electronics, "전자제품");
        categoryList.add(category1);

        CommerceSystem system = new CommerceSystem(categoryList);
        system.start();
    }
}
