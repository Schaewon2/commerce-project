package com.commerce;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Category> categoryList = new ArrayList<>();
        List<Product> electronics = new ArrayList<>();
        List<Product> clothing = new ArrayList<>();
        List<Product> foods = new ArrayList<>();

        Product product1 = new Product("Galaxy S25", 1200000, "최신 안드로이드 스마트폰", 30);
        Product product2 = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 15);
        Product product3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 20);
        Product product4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 10);

        Product product5 = new Product("윈드브레이커 나일론 자켓", 72000, "고프코어 룩에 활용하기 좋은 자켓", 50);
        Product product6 = new Product("슬림컷 생지 데님 팬츠", 58000, "슬림한 라인이 돋보이는 데님", 7);
        Product product7 = new Product("오버핏 코튼 반팔 티셔츠", 29000, "탄탄한 20수 면 소재로 제작된 데일리 오버핏 티셔츠", 150);

        Product product8 = new Product("치즈 듬뿍 페퍼로니 피자", 18900, "고소한 치즈와 짭짤한 페퍼로니의 환상 조합", 20);
        Product product9 = new Product("프리미엄 한우 스테이크", 45000, "최상급 한우 채끝살로 만든 육즙 가득 스테이크", 10);
        Product product10 = new Product("매콤 달콤 떡볶이 세트", 12000, "중독성 있는 소스와 쫄깃한 밀떡의 만남", 50);

        electronics.add(product1);
        electronics.add(product2);
        electronics.add(product3);
        electronics.add(product4);

        clothing.add(product5);
        clothing.add(product6);
        clothing.add(product7);

        foods.add(product8);
        foods.add(product9);
        foods.add(product10);

        Category category1 = new Category(electronics, "전자제품");
        Category category2 = new Category(clothing, "의류");
        Category category3 = new Category(foods, "식품");

        categoryList.add(category1);
        categoryList.add(category2);
        categoryList.add(category3);

        CommerceSystem system = new CommerceSystem(categoryList);
        system.start();
    }
}
