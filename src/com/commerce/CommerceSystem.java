package com.commerce;

import java.util.*;

// 커머스 플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스
public class CommerceSystem {
    // 속성
    private Scanner scanner = new Scanner(System.in);
    private List<Category> categoryList;

    // 생성자
    public CommerceSystem(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    // 기능
    public void start() {
        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 - 메인 ]");
            int index = 1;
            for (Category category : categoryList) {
                System.out.println((index++) + ". " + category.getCategoryName());
            }
            System.out.println("0. 종료 | 프로그램 종료");
            int choiceCategoryNumber = scanner.nextInt();
            if (choiceCategoryNumber == 0) {
                System.out.println("커머스 플랫폼을 종료합니다.");
                break;
            }
            Category category = categoryList.get(choiceCategoryNumber - 1);
            System.out.println("[ " + category.getCategoryName() + " 카테고리 ]");

            List<Product> products = category.getProductList();
            index = 1;
            for (Product product : products) {
                System.out.println((index++) + ". " + product.getName() + " | " + product.getPrice() + "원 | " + product.getDescription());
            }
            System.out.println("0. 뒤로가기");
            int choiceProductNumber = scanner.nextInt();
            if (choiceProductNumber == 0) {
                continue;
            }

            Product product = products.get(choiceProductNumber - 1);
            System.out.println("선택한 상품: " + product.getName() + " | " + product.getPrice() + "원 | " + product.getDescription() + " | 재고: " + product.getQuantity() + "개");
            System.out.println();
        }
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }
}
