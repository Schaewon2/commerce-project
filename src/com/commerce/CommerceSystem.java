package com.commerce;

import java.util.*;

// 커머스 플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스
public class CommerceSystem {
    Scanner scanner = new Scanner(System.in);
    // 속성
    private List<Category> category;

    // 생성자
    public CommerceSystem(List<Category> categoryList) {
        this.category = categoryList;
    }

    // 기능
    public void start() {
        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 메인 ]");
            int index = 1;
            for (Category category : category) {
                System.out.println((index++) + ". " + category.getCategoryName());
            }
            System.out.println("0. 종료 | 프로그램 종료");
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }
            optionProduct(n);
        }
    }

    private void optionProduct(int n) {
        System.out.println("[ " + category.get(n - 1).getCategoryName() + " 카테고리 ]");
        int index = 1;
        List<Product> products = category.get(n - 1).getProductList();
        for (Product product : products) {
            System.out.println((index++) + ". " + product.getName() + " | " + product.getPrice() + "원 | " + product.getDescription());
        }
        System.out.println("0. 뒤로가기");
        int n1 = scanner.nextInt();
        if (n1 == 0) {
            start();
        }

        Product product = products.get(n1 - 1);
        System.out.println("선택한 상품: " + product.getName() +" | " +product.getPrice()+"원 | " + product.getDescription() + " | 재고: " + product.getQuantity() + "개");
        System.out.println();
    }


    public List<Category> getCategory() {
        return category;
    }
}
