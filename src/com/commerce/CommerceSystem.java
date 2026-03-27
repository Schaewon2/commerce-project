package com.commerce;

import java.util.ArrayList;
import java.util.*;

// 커머스 플랫폼의 상품을 관리하고 사용자 입력을 처리하는 클래스
public class CommerceSystem {
    Scanner scanner = new Scanner(System.in);
    // 속성
    private List<Product> products; // 전자제품, 음식, ...

    // 생성자
    public CommerceSystem(List<Product> products) {
        this.products = products;
    }

    // 기능
    public void start() {
        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
        while (true) {
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i + 1) + ". " + products.get(i).getName() + " | " + products.get(i).getPrice() + "원 | " + products.get(i).getDescription());
            }
            System.out.println("0. 종료 | 프로그램 종료");
            if (scanner.nextInt() == 0) {
                System.out.println("커머스 프로그램을 종료합니다.");
                break;
            }
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
